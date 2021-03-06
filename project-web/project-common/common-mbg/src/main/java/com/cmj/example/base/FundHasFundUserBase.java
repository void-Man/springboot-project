package com.cmj.example.base;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class FundHasFundUserBase implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund_has_funduser.FId
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund_has_funduser.FFundId
     *
     * @mbg.generated
     */
    private Integer fundId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund_has_funduser.FFundUserId
     *
     * @mbg.generated
     */
    private Integer fundUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund_has_funduser.FStartTime
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund_has_funduser.FInOffer
     *
     * @mbg.generated
     */
    private Byte inOffer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund_has_funduser.FProfitRate
     *
     * @mbg.generated
     */
    private BigDecimal profitRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund_has_funduser.FAverageRate
     *
     * @mbg.generated
     */
    private BigDecimal averageRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund_has_funduser.FRanking
     *
     * @mbg.generated
     */
    private Integer ranking;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund_has_funduser.FCreateTime
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund_has_funduser.FUpdateTime
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund_has_funduser.FDeleteTime
     *
     * @mbg.generated
     */
    private Date deleteTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund_has_funduser.FCreateUser
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund_has_funduser.FUpdateUser
     *
     * @mbg.generated
     */
    private String updateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund_has_funduser.FDeleteUser
     *
     * @mbg.generated
     */
    private String deleteUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund_has_funduser.FIsDelete
     *
     * @mbg.generated
     */
    private Integer isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_base_fund_has_funduser
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund_has_funduser.FId
     *
     * @return the value of t_base_fund_has_funduser.FId
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund_has_funduser.FId
     *
     * @param id the value for t_base_fund_has_funduser.FId
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund_has_funduser.FFundId
     *
     * @return the value of t_base_fund_has_funduser.FFundId
     *
     * @mbg.generated
     */
    public Integer getFundId() {
        return fundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund_has_funduser.FFundId
     *
     * @param fundId the value for t_base_fund_has_funduser.FFundId
     *
     * @mbg.generated
     */
    public void setFundId(Integer fundId) {
        this.fundId = fundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund_has_funduser.FFundUserId
     *
     * @return the value of t_base_fund_has_funduser.FFundUserId
     *
     * @mbg.generated
     */
    public Integer getFundUserId() {
        return fundUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund_has_funduser.FFundUserId
     *
     * @param fundUserId the value for t_base_fund_has_funduser.FFundUserId
     *
     * @mbg.generated
     */
    public void setFundUserId(Integer fundUserId) {
        this.fundUserId = fundUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund_has_funduser.FStartTime
     *
     * @return the value of t_base_fund_has_funduser.FStartTime
     *
     * @mbg.generated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund_has_funduser.FStartTime
     *
     * @param startTime the value for t_base_fund_has_funduser.FStartTime
     *
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund_has_funduser.FInOffer
     *
     * @return the value of t_base_fund_has_funduser.FInOffer
     *
     * @mbg.generated
     */
    public Byte getInOffer() {
        return inOffer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund_has_funduser.FInOffer
     *
     * @param inOffer the value for t_base_fund_has_funduser.FInOffer
     *
     * @mbg.generated
     */
    public void setInOffer(Byte inOffer) {
        this.inOffer = inOffer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund_has_funduser.FProfitRate
     *
     * @return the value of t_base_fund_has_funduser.FProfitRate
     *
     * @mbg.generated
     */
    public BigDecimal getProfitRate() {
        return profitRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund_has_funduser.FProfitRate
     *
     * @param profitRate the value for t_base_fund_has_funduser.FProfitRate
     *
     * @mbg.generated
     */
    public void setProfitRate(BigDecimal profitRate) {
        this.profitRate = profitRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund_has_funduser.FAverageRate
     *
     * @return the value of t_base_fund_has_funduser.FAverageRate
     *
     * @mbg.generated
     */
    public BigDecimal getAverageRate() {
        return averageRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund_has_funduser.FAverageRate
     *
     * @param averageRate the value for t_base_fund_has_funduser.FAverageRate
     *
     * @mbg.generated
     */
    public void setAverageRate(BigDecimal averageRate) {
        this.averageRate = averageRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund_has_funduser.FRanking
     *
     * @return the value of t_base_fund_has_funduser.FRanking
     *
     * @mbg.generated
     */
    public Integer getRanking() {
        return ranking;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund_has_funduser.FRanking
     *
     * @param ranking the value for t_base_fund_has_funduser.FRanking
     *
     * @mbg.generated
     */
    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund_has_funduser.FCreateTime
     *
     * @return the value of t_base_fund_has_funduser.FCreateTime
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund_has_funduser.FCreateTime
     *
     * @param createTime the value for t_base_fund_has_funduser.FCreateTime
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund_has_funduser.FUpdateTime
     *
     * @return the value of t_base_fund_has_funduser.FUpdateTime
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund_has_funduser.FUpdateTime
     *
     * @param updateTime the value for t_base_fund_has_funduser.FUpdateTime
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund_has_funduser.FDeleteTime
     *
     * @return the value of t_base_fund_has_funduser.FDeleteTime
     *
     * @mbg.generated
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund_has_funduser.FDeleteTime
     *
     * @param deleteTime the value for t_base_fund_has_funduser.FDeleteTime
     *
     * @mbg.generated
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund_has_funduser.FCreateUser
     *
     * @return the value of t_base_fund_has_funduser.FCreateUser
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund_has_funduser.FCreateUser
     *
     * @param createUser the value for t_base_fund_has_funduser.FCreateUser
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund_has_funduser.FUpdateUser
     *
     * @return the value of t_base_fund_has_funduser.FUpdateUser
     *
     * @mbg.generated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund_has_funduser.FUpdateUser
     *
     * @param updateUser the value for t_base_fund_has_funduser.FUpdateUser
     *
     * @mbg.generated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund_has_funduser.FDeleteUser
     *
     * @return the value of t_base_fund_has_funduser.FDeleteUser
     *
     * @mbg.generated
     */
    public String getDeleteUser() {
        return deleteUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund_has_funduser.FDeleteUser
     *
     * @param deleteUser the value for t_base_fund_has_funduser.FDeleteUser
     *
     * @mbg.generated
     */
    public void setDeleteUser(String deleteUser) {
        this.deleteUser = deleteUser == null ? null : deleteUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund_has_funduser.FIsDelete
     *
     * @return the value of t_base_fund_has_funduser.FIsDelete
     *
     * @mbg.generated
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund_has_funduser.FIsDelete
     *
     * @param isDelete the value for t_base_fund_has_funduser.FIsDelete
     *
     * @mbg.generated
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fund_has_funduser
     *
     * @mbg.generated
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fund_has_funduser
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fundId=").append(fundId);
        sb.append(", fundUserId=").append(fundUserId);
        sb.append(", startTime=").append(startTime);
        sb.append(", inOffer=").append(inOffer);
        sb.append(", profitRate=").append(profitRate);
        sb.append(", averageRate=").append(averageRate);
        sb.append(", ranking=").append(ranking);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", deleteUser=").append(deleteUser);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_base_fund_has_funduser
     *
     * @mbg.generated
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fund_has_funduser
         *
         * @mbg.generated
         */
        private FundHasFundUserBase obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund_has_funduser
         *
         * @mbg.generated
         */
        public Builder() {
            this.obj = new FundHasFundUserBase();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund_has_funduser.FId
         *
         * @param id the value for t_base_fund_has_funduser.FId
         *
         * @mbg.generated
         */
        public Builder id(Integer id) {
            obj.setId(id);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund_has_funduser.FFundId
         *
         * @param fundId the value for t_base_fund_has_funduser.FFundId
         *
         * @mbg.generated
         */
        public Builder fundId(Integer fundId) {
            obj.setFundId(fundId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund_has_funduser.FFundUserId
         *
         * @param fundUserId the value for t_base_fund_has_funduser.FFundUserId
         *
         * @mbg.generated
         */
        public Builder fundUserId(Integer fundUserId) {
            obj.setFundUserId(fundUserId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund_has_funduser.FStartTime
         *
         * @param startTime the value for t_base_fund_has_funduser.FStartTime
         *
         * @mbg.generated
         */
        public Builder startTime(Date startTime) {
            obj.setStartTime(startTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund_has_funduser.FInOffer
         *
         * @param inOffer the value for t_base_fund_has_funduser.FInOffer
         *
         * @mbg.generated
         */
        public Builder inOffer(Byte inOffer) {
            obj.setInOffer(inOffer);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund_has_funduser.FProfitRate
         *
         * @param profitRate the value for t_base_fund_has_funduser.FProfitRate
         *
         * @mbg.generated
         */
        public Builder profitRate(BigDecimal profitRate) {
            obj.setProfitRate(profitRate);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund_has_funduser.FAverageRate
         *
         * @param averageRate the value for t_base_fund_has_funduser.FAverageRate
         *
         * @mbg.generated
         */
        public Builder averageRate(BigDecimal averageRate) {
            obj.setAverageRate(averageRate);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund_has_funduser.FRanking
         *
         * @param ranking the value for t_base_fund_has_funduser.FRanking
         *
         * @mbg.generated
         */
        public Builder ranking(Integer ranking) {
            obj.setRanking(ranking);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund_has_funduser.FCreateTime
         *
         * @param createTime the value for t_base_fund_has_funduser.FCreateTime
         *
         * @mbg.generated
         */
        public Builder createTime(Date createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund_has_funduser.FUpdateTime
         *
         * @param updateTime the value for t_base_fund_has_funduser.FUpdateTime
         *
         * @mbg.generated
         */
        public Builder updateTime(Date updateTime) {
            obj.setUpdateTime(updateTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund_has_funduser.FDeleteTime
         *
         * @param deleteTime the value for t_base_fund_has_funduser.FDeleteTime
         *
         * @mbg.generated
         */
        public Builder deleteTime(Date deleteTime) {
            obj.setDeleteTime(deleteTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund_has_funduser.FCreateUser
         *
         * @param createUser the value for t_base_fund_has_funduser.FCreateUser
         *
         * @mbg.generated
         */
        public Builder createUser(String createUser) {
            obj.setCreateUser(createUser);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund_has_funduser.FUpdateUser
         *
         * @param updateUser the value for t_base_fund_has_funduser.FUpdateUser
         *
         * @mbg.generated
         */
        public Builder updateUser(String updateUser) {
            obj.setUpdateUser(updateUser);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund_has_funduser.FDeleteUser
         *
         * @param deleteUser the value for t_base_fund_has_funduser.FDeleteUser
         *
         * @mbg.generated
         */
        public Builder deleteUser(String deleteUser) {
            obj.setDeleteUser(deleteUser);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund_has_funduser.FIsDelete
         *
         * @param isDelete the value for t_base_fund_has_funduser.FIsDelete
         *
         * @mbg.generated
         */
        public Builder isDelete(Integer isDelete) {
            obj.setIsDelete(isDelete);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund_has_funduser
         *
         * @mbg.generated
         */
        public FundHasFundUserBase build() {
            return this.obj;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_base_fund_has_funduser
     *
     * @mbg.generated
     */
    public enum Column {
        id("FId", "id", "INTEGER", false),
        fundId("FFundId", "fundId", "INTEGER", false),
        fundUserId("FFundUserId", "fundUserId", "INTEGER", false),
        startTime("FStartTime", "startTime", "TIMESTAMP", false),
        inOffer("FInOffer", "inOffer", "TINYINT", false),
        profitRate("FProfitRate", "profitRate", "DECIMAL", false),
        averageRate("FAverageRate", "averageRate", "DECIMAL", false),
        ranking("FRanking", "ranking", "INTEGER", false),
        createTime("FCreateTime", "createTime", "TIMESTAMP", false),
        updateTime("FUpdateTime", "updateTime", "TIMESTAMP", false),
        deleteTime("FDeleteTime", "deleteTime", "TIMESTAMP", false),
        createUser("FCreateUser", "createUser", "VARCHAR", false),
        updateUser("FUpdateUser", "updateUser", "VARCHAR", false),
        deleteUser("FDeleteUser", "deleteUser", "VARCHAR", false),
        isDelete("FIsDelete", "isDelete", "TINYINT", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fund_has_funduser
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fund_has_funduser
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fund_has_funduser
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fund_has_funduser
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fund_has_funduser
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fund_has_funduser
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund_has_funduser
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund_has_funduser
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund_has_funduser
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund_has_funduser
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund_has_funduser
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund_has_funduser
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund_has_funduser
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund_has_funduser
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund_has_funduser
         *
         * @mbg.generated
         */
        public static Column[] all() {
            return Column.values();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund_has_funduser
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund_has_funduser
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}