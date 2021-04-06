package com.cmj.example.utils;

import java.util.*;

/**
 * @author mengjie_chen
 * @description
 * @date 2020/12/15
 */
public class CollectionUtils {

    /**
     * 判断集合是否是空
     *
     * @param collection
     * @return boolean
     * @author mengjie_chen
     * @date 2020/12/15
     */
    public static <E> boolean isNullOrEmpty(Collection<E> collection) {
        return Objects.isNull(collection) || collection.size() == 0;
    }

    /**
     * 判断Map集合是否是空
     *
     * @param map
     * @return boolean
     * @author mengjie_chen
     * @date 2021/3/31
     */
    public static <K, V> boolean isNullOrEmpty(Map<K, V> map) {
        return Objects.isNull(map) || map.isEmpty();
    }

    /**
     * 判断Map集合不是空
     *
     * @param map
     * @return boolean
     * @author mengjie_chen
     * @date 2021/3/31
     */
    public static <K, V> boolean isNotNullAndEmpty(Map<K, V> map) {
        return Objects.nonNull(map) && !map.isEmpty();
    }

    /**
     * 判断集合是否不是空
     *
     * @param collection
     * @return boolean
     * @author mengjie_chen
     * @date 2020/12/15
     */
    public static <E> boolean isNotNullAndEmpty(Collection<E> collection) {
        return Objects.nonNull(collection) && collection.size() > 0;
    }

    public static <T> List<List<T>> subList(List<T> sourceList, int batchSize) {
        List<List<T>> list = new ArrayList<>(10);
        int sourceSize = sourceList.size();
        int batch = sourceSize / batchSize + (sourceSize % batchSize == 0 ? 0 : 1);
        for (int i = 0; i < batch; i++) {
            List<T> subList = sourceList.subList(i * batchSize, (i == batch - 1) ? sourceSize : i * batchSize + batchSize);
            list.add(subList);
        }
        return list;
    }
}
