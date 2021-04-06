package com.cmj.example.base;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class FundPositionEntryBase implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fundpositionentry.FId
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fundpositionentry.FFundId
     *
     * @mbg.generated
     */
    private Integer fundId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fundpositionentry.FStockId
     *
     * @mbg.generated
     */
    private Integer stockId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fundpositionentry.FAmount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fundpositionentry.FStockQuantity
     *
     * @mbg.generated
     */
    private Integer stockQuantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fundpositionentry.FStockRate
     *
     * @mbg.generated
     */
    private BigDecimal stockRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fundpositionentry.FCreateTime
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fundpositionentry.FUpdateTime
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fundpositionentry.FDeleteTime
     *
     * @mbg.generated
     */
    private Date deleteTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fundpositionentry.FCreateUser
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fundpositionentry.FUpdateUser
     *
     * @mbg.generated
     */
    private String updateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fundpositionentry.FDeleteUser
     *
     * @mbg.generated
     */
    private String deleteUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fundpositionentry.FIsDelete
     *
     * @mbg.generated
     */
    private Integer isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_base_fundpositionentry
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fundpositionentry.FId
     *
     * @return the value of t_base_fundpositionentry.FId
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fundpositionentry.FId
     *
     * @param id the value for t_base_fundpositionentry.FId
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fundpositionentry.FFundId
     *
     * @return the value of t_base_fundpositionentry.FFundId
     *
     * @mbg.generated
     */
    public Integer getFundId() {
        return fundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fundpositionentry.FFundId
     *
     * @param fundId the value for t_base_fundpositionentry.FFundId
     *
     * @mbg.generated
     */
    public void setFundId(Integer fundId) {
        this.fundId = fundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fundpositionentry.FStockId
     *
     * @return the value of t_base_fundpositionentry.FStockId
     *
     * @mbg.generated
     */
    public Integer getStockId() {
        return stockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fundpositionentry.FStockId
     *
     * @param stockId the value for t_base_fundpositionentry.FStockId
     *
     * @mbg.generated
     */
    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fundpositionentry.FAmount
     *
     * @return the value of t_base_fundpositionentry.FAmount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fundpositionentry.FAmount
     *
     * @param amount the value for t_base_fundpositionentry.FAmount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fundpositionentry.FStockQuantity
     *
     * @return the value of t_base_fundpositionentry.FStockQuantity
     *
     * @mbg.generated
     */
    public Integer getStockQuantity() {
        return stockQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fundpositionentry.FStockQuantity
     *
     * @param stockQuantity the value for t_base_fundpositionentry.FStockQuantity
     *
     * @mbg.generated
     */
    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fundpositionentry.FStockRate
     *
     * @return the value of t_base_fundpositionentry.FStockRate
     *
     * @mbg.generated
     */
    public BigDecimal getStockRate() {
        return stockRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fundpositionentry.FStockRate
     *
     * @param stockRate the value for t_base_fundpositionentry.FStockRate
     *
     * @mbg.generated
     */
    public void setStockRate(BigDecimal stockRate) {
        this.stockRate = stockRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fundpositionentry.FCreateTime
     *
     * @return the value of t_base_fundpositionentry.FCreateTime
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fundpositionentry.FCreateTime
     *
     * @param createTime the value for t_base_fundpositionentry.FCreateTime
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fundpositionentry.FUpdateTime
     *
     * @return the value of t_base_fundpositionentry.FUpdateTime
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fundpositionentry.FUpdateTime
     *
     * @param updateTime the value for t_base_fundpositionentry.FUpdateTime
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fundpositionentry.FDeleteTime
     *
     * @return the value of t_base_fundpositionentry.FDeleteTime
     *
     * @mbg.generated
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fundpositionentry.FDeleteTime
     *
     * @param deleteTime the value for t_base_fundpositionentry.FDeleteTime
     *
     * @mbg.generated
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fundpositionentry.FCreateUser
     *
     * @return the value of t_base_fundpositionentry.FCreateUser
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fundpositionentry.FCreateUser
     *
     * @param createUser the value for t_base_fundpositionentry.FCreateUser
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fundpositionentry.FUpdateUser
     *
     * @return the value of t_base_fundpositionentry.FUpdateUser
     *
     * @mbg.generated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fundpositionentry.FUpdateUser
     *
     * @param updateUser the value for t_base_fundpositionentry.FUpdateUser
     *
     * @mbg.generated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fundpositionentry.FDeleteUser
     *
     * @return the value of t_base_fundpositionentry.FDeleteUser
     *
     * @mbg.generated
     */
    public String getDeleteUser() {
        return deleteUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fundpositionentry.FDeleteUser
     *
     * @param deleteUser the value for t_base_fundpositionentry.FDeleteUser
     *
     * @mbg.generated
     */
    public void setDeleteUser(String deleteUser) {
        this.deleteUser = deleteUser == null ? null : deleteUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fundpositionentry.FIsDelete
     *
     * @return the value of t_base_fundpositionentry.FIsDelete
     *
     * @mbg.generated
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fundpositionentry.FIsDelete
     *
     * @param isDelete the value for t_base_fundpositionentry.FIsDelete
     *
     * @mbg.generated
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fundpositionentry
     *
     * @mbg.generated
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fundpositionentry
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
        sb.append(", stockId=").append(stockId);
        sb.append(", amount=").append(amount);
        sb.append(", stockQuantity=").append(stockQuantity);
        sb.append(", stockRate=").append(stockRate);
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
     * This class corresponds to the database table t_base_fundpositionentry
     *
     * @mbg.generated
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fundpositionentry
         *
         * @mbg.generated
         */
        private FundPositionEntryBase obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fundpositionentry
         *
         * @mbg.generated
         */
        public Builder() {
            this.obj = new FundPositionEntryBase();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fundpositionentry.FId
         *
         * @param id the value for t_base_fundpositionentry.FId
         *
         * @mbg.generated
         */
        public Builder id(Integer id) {
            obj.setId(id);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fundpositionentry.FFundId
         *
         * @param fundId the value for t_base_fundpositionentry.FFundId
         *
         * @mbg.generated
         */
        public Builder fundId(Integer fundId) {
            obj.setFundId(fundId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fundpositionentry.FStockId
         *
         * @param stockId the value for t_base_fundpositionentry.FStockId
         *
         * @mbg.generated
         */
        public Builder stockId(Integer stockId) {
            obj.setStockId(stockId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fundpositionentry.FAmount
         *
         * @param amount the value for t_base_fundpositionentry.FAmount
         *
         * @mbg.generated
         */
        public Builder amount(BigDecimal amount) {
            obj.setAmount(amount);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fundpositionentry.FStockQuantity
         *
         * @param stockQuantity the value for t_base_fundpositionentry.FStockQuantity
         *
         * @mbg.generated
         */
        public Builder stockQuantity(Integer stockQuantity) {
            obj.setStockQuantity(stockQuantity);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fundpositionentry.FStockRate
         *
         * @param stockRate the value for t_base_fundpositionentry.FStockRate
         *
         * @mbg.generated
         */
        public Builder stockRate(BigDecimal stockRate) {
            obj.setStockRate(stockRate);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fundpositionentry.FCreateTime
         *
         * @param createTime the value for t_base_fundpositionentry.FCreateTime
         *
         * @mbg.generated
         */
        public Builder createTime(Date createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fundpositionentry.FUpdateTime
         *
         * @param updateTime the value for t_base_fundpositionentry.FUpdateTime
         *
         * @mbg.generated
         */
        public Builder updateTime(Date updateTime) {
            obj.setUpdateTime(updateTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fundpositionentry.FDeleteTime
         *
         * @param deleteTime the value for t_base_fundpositionentry.FDeleteTime
         *
         * @mbg.generated
         */
        public Builder deleteTime(Date deleteTime) {
            obj.setDeleteTime(deleteTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fundpositionentry.FCreateUser
         *
         * @param createUser the value for t_base_fundpositionentry.FCreateUser
         *
         * @mbg.generated
         */
        public Builder createUser(String createUser) {
            obj.setCreateUser(createUser);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fundpositionentry.FUpdateUser
         *
         * @param updateUser the value for t_base_fundpositionentry.FUpdateUser
         *
         * @mbg.generated
         */
        public Builder updateUser(String updateUser) {
            obj.setUpdateUser(updateUser);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fundpositionentry.FDeleteUser
         *
         * @param deleteUser the value for t_base_fundpositionentry.FDeleteUser
         *
         * @mbg.generated
         */
        public Builder deleteUser(String deleteUser) {
            obj.setDeleteUser(deleteUser);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fundpositionentry.FIsDelete
         *
         * @param isDelete the value for t_base_fundpositionentry.FIsDelete
         *
         * @mbg.generated
         */
        public Builder isDelete(Integer isDelete) {
            obj.setIsDelete(isDelete);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fundpositionentry
         *
         * @mbg.generated
         */
        public FundPositionEntryBase build() {
            return this.obj;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_base_fundpositionentry
     *
     * @mbg.generated
     */
    public enum Column {
        id("FId", "id", "INTEGER", false),
        fundId("FFundId", "fundId", "INTEGER", false),
        stockId("FStockId", "stockId", "INTEGER", false),
        amount("FAmount", "amount", "DECIMAL", false),
        stockQuantity("FStockQuantity", "stockQuantity", "INTEGER", false),
        stockRate("FStockRate", "stockRate", "DECIMAL", false),
        createTime("FCreateTime", "createTime", "TIMESTAMP", false),
        updateTime("FUpdateTime", "updateTime", "TIMESTAMP", false),
        deleteTime("FDeleteTime", "deleteTime", "TIMESTAMP", false),
        createUser("FCreateUser", "createUser", "VARCHAR", false),
        updateUser("FUpdateUser", "updateUser", "VARCHAR", false),
        deleteUser("FDeleteUser", "deleteUser", "VARCHAR", false),
        isDelete("FIsDelete", "isDelete", "TINYINT", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fundpositionentry
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fundpositionentry
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fundpositionentry
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fundpositionentry
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fundpositionentry
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fundpositionentry
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fundpositionentry
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fundpositionentry
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fundpositionentry
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fundpositionentry
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fundpositionentry
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
         * This method corresponds to the database table t_base_fundpositionentry
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fundpositionentry
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fundpositionentry
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
         * This method corresponds to the database table t_base_fundpositionentry
         *
         * @mbg.generated
         */
        public static Column[] all() {
            return Column.values();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fundpositionentry
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
         * This method corresponds to the database table t_base_fundpositionentry
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}