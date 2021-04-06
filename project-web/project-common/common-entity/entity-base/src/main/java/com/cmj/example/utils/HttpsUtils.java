package com.cmj.example.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author mengjie_chen
 * @description
 * @date 2021/1/7
 */
public class HttpsUtils {
    private static final Logger logger = LoggerFactory.getLogger(HttpsUtils.class);

    private static PoolingHttpClientConnectionManager connMgr;
    private static RequestConfig requestConfig;
    private static final int MAX_TIMEOUT = 1000 * 60 * 60;

    public static final int TYPE_HTTP = 1;
    public static final int TYPE_HTTPS = 2;

    static {
        // 设置连接池
        connMgr = new PoolingHttpClientConnectionManager();
        // 设置连接池大小
        connMgr.setMaxTotal(100);
        connMgr.setDefaultMaxPerRoute(connMgr.getMaxTotal());

        RequestConfig.Builder configBuilder = RequestConfig.custom();
        // 设置连接超时
        configBuilder.setConnectTimeout(MAX_TIMEOUT);
        // 设置读取超时
        configBuilder.setSocketTimeout(MAX_TIMEOUT);
        // 设置从连接池获取连接实例的超时
        configBuilder.setConnectionRequestTimeout(MAX_TIMEOUT);
        requestConfig = configBuilder.build();
    }

    /**
     * 创建SSL安全连接
     *
     * @param
     * @return org.apache.http.conn.ssl.SSLConnectionSocketFactory
     * @author mengjie_chen
     * @date 2021/1/7
     */
    private static SSLConnectionSocketFactory createSSLConnSocketFactory() {
        SSLConnectionSocketFactory sslsf = null;
        try {
            SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {

                public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                    return true;
                }
            }).build();
            sslsf = new SSLConnectionSocketFactory(sslContext, (s, sslSession) -> true);
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
        return sslsf;
    }

    /**
     * post请求，form-urlEncoded形式
     *
     * @param url
     * @param headerParamList
     * @param paramList
     * @return java.lang.String
     * @author mengjie_chen
     * @date 2021/3/25
     */
    public static String post(String url, List<BasicHeader> headerParamList, List<BasicNameValuePair> paramList) throws IOException {
        CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(createSSLConnSocketFactory()).setConnectionManager(connMgr).setDefaultRequestConfig(requestConfig).build();

        HttpPost httpPost = new HttpPost(url);
        // 解决中文乱码问题
        httpPost.setEntity(new UrlEncodedFormEntity(paramList, "UTF-8"));
        for (BasicHeader basicHeader : headerParamList) {
            httpPost.addHeader(basicHeader);
        }
        logger.info("发送请求 -----> url = {}\theader = {}\tparam = {}", url, JSONObject.toJSONString(headerParamList), JSONObject.toJSONString(paramList));
        CloseableHttpResponse response = httpClient.execute(httpPost);
        int code = response.getStatusLine().getStatusCode();
        String msg = response.getStatusLine().getReasonPhrase();
        if (code != 200) {
            throw new RuntimeException("请求结果异常：" + msg);
        }
        HttpEntity e = response.getEntity();
        String result = EntityUtils.toString(e, "UTF-8");
        logger.info("{}\t请求成功 -----> result = {}", url, result);
        return result;
    }

    /**
     * post请求
     *
     * @param url             请求地址
     * @param headerParamList 请求头参数
     * @param body            请求体
     * @return java.lang.String
     * @author mengjie_chen
     * @date 2021/1/7
     */
    public static String post(String url, List<BasicHeader> headerParamList, String body) throws IOException {
        CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(createSSLConnSocketFactory()).setConnectionManager(connMgr).setDefaultRequestConfig(requestConfig).build();
        // 通过请求的url初始化一个HttpGet请求
        HttpPost httpPost = new HttpPost(url);
        for (BasicHeader basicHeader : headerParamList) {
            httpPost.addHeader(basicHeader);
        }
        // 解决中文乱码问题
        StringEntity stringEntity = new StringEntity(body, "UTF-8");
        stringEntity.setContentEncoding("UTF-8");
        httpPost.setEntity(stringEntity);

        CloseableHttpResponse response = httpClient.execute(httpPost);
        int code = response.getStatusLine().getStatusCode();
        String msg = response.getStatusLine().getReasonPhrase();
        if (code != 200) {
            throw new RuntimeException("请求结果异常：" + msg);
        }
        HttpEntity e = response.getEntity();
        return EntityUtils.toString(e, "UTF-8");
    }

    /**
     * 发送带参数的get请求
     *
     * @param url
     * @param paramMap
     * @return java.lang.String
     * @author mengjie_chen
     * @date 2021/3/6
     */
    public static String getByHttps(String url, Map<String, Object> paramMap) throws IOException {
        CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(createSSLConnSocketFactory()).setConnectionManager(connMgr).setDefaultRequestConfig(requestConfig).build();
        List<BasicNameValuePair> paramList = new ArrayList<>(10);
        // 组装参数
        if (CollectionUtils.isNotNullAndEmpty(paramMap)) {
            paramMap.forEach((key, value) -> paramList.add(new BasicNameValuePair(key, String.valueOf(value))));
        }

        // 发送请求
        HttpGet httpGet;
        if (CollectionUtils.isNullOrEmpty(paramList)) {
            httpGet = new HttpGet(url);
            logger.info("发送请求 -----> {}", url);
        } else {
            String params = EntityUtils.toString(new UrlEncodedFormEntity(paramList, Consts.UTF_8));
            httpGet = new HttpGet(url + "?" + params);
            logger.info("发送请求 -----> {}{}{}", url, "?", params);
        }

        CloseableHttpResponse response = httpClient.execute(httpGet);
        int code = response.getStatusLine().getStatusCode();
        String msg = response.getStatusLine().getReasonPhrase();
        if (code != 200) {
            throw new RuntimeException("请求结果异常：" + msg);
        }
        HttpEntity e = response.getEntity();
        logger.info("请求成功");
        return EntityUtils.toString(e, "UTF-8");
    }

    /**
     * 发送带参数的get请求
     *
     * @param url
     * @param paramMap
     * @param type
     * @return java.lang.String
     * @author mengjie_chen
     * @date 2021/3/31
     */
    public static String get(String url, Map<String, Object> paramMap, int type) throws IOException {
        if (TYPE_HTTP == type) {
            return getByHttp(url, paramMap);
        } else {
            return getByHttps(url, paramMap);
        }
    }

    /**
     * 发送带参数的get请求
     *
     * @param url
     * @param paramMap
     * @return java.lang.String
     * @author mengjie_chen
     * @date 2021/3/31
     */
    public static String getByHttp(String url, Map<String, Object> paramMap) throws IOException {
        CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(connMgr).setDefaultRequestConfig(requestConfig).build();
        List<BasicNameValuePair> paramList = new ArrayList<>(10);
        // 组装参数
        if (CollectionUtils.isNotNullAndEmpty(paramMap)) {
            paramMap.forEach((key, value) -> paramList.add(new BasicNameValuePair(key, String.valueOf(value))));
        }

        // 发送请求
        HttpGet httpGet;
        if (CollectionUtils.isNullOrEmpty(paramList)) {
            httpGet = new HttpGet(url);
            logger.info("发送请求 -----> {}", url);
        } else {
            String params = EntityUtils.toString(new UrlEncodedFormEntity(paramList, Consts.UTF_8));
            httpGet = new HttpGet(url + "?" + params);
            logger.info("发送请求 -----> {}{}{}", url, "?", params);
        }

        CloseableHttpResponse response = httpClient.execute(httpGet);
        int code = response.getStatusLine().getStatusCode();
        String msg = response.getStatusLine().getReasonPhrase();
        if (code != 200) {
            throw new RuntimeException("请求结果异常：" + msg);
        }
        HttpEntity e = response.getEntity();
        logger.info("请求成功");
        return EntityUtils.toString(e, "UTF-8");
    }

}