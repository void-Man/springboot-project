package com.cmj.example.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class FundBase implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund.FId
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund.FFundTypeId
     *
     * @mbg.generated
     */
    private Integer fundTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund.FNumber
     *
     * @mbg.generated
     */
    private String number;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund.FName
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund.FCreateTime
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund.FUpdateTime
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund.FDeleteTime
     *
     * @mbg.generated
     */
    private Date deleteTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund.FCreateUser
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund.FUpdateUser
     *
     * @mbg.generated
     */
    private String updateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund.FDeleteUser
     *
     * @mbg.generated
     */
    private String deleteUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_base_fund.FIsDelete
     *
     * @mbg.generated
     */
    private Integer isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_base_fund
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund.FId
     *
     * @return the value of t_base_fund.FId
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund.FId
     *
     * @param id the value for t_base_fund.FId
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund.FFundTypeId
     *
     * @return the value of t_base_fund.FFundTypeId
     *
     * @mbg.generated
     */
    public Integer getFundTypeId() {
        return fundTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund.FFundTypeId
     *
     * @param fundTypeId the value for t_base_fund.FFundTypeId
     *
     * @mbg.generated
     */
    public void setFundTypeId(Integer fundTypeId) {
        this.fundTypeId = fundTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund.FNumber
     *
     * @return the value of t_base_fund.FNumber
     *
     * @mbg.generated
     */
    public String getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund.FNumber
     *
     * @param number the value for t_base_fund.FNumber
     *
     * @mbg.generated
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund.FName
     *
     * @return the value of t_base_fund.FName
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund.FName
     *
     * @param name the value for t_base_fund.FName
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund.FCreateTime
     *
     * @return the value of t_base_fund.FCreateTime
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund.FCreateTime
     *
     * @param createTime the value for t_base_fund.FCreateTime
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund.FUpdateTime
     *
     * @return the value of t_base_fund.FUpdateTime
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund.FUpdateTime
     *
     * @param updateTime the value for t_base_fund.FUpdateTime
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund.FDeleteTime
     *
     * @return the value of t_base_fund.FDeleteTime
     *
     * @mbg.generated
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund.FDeleteTime
     *
     * @param deleteTime the value for t_base_fund.FDeleteTime
     *
     * @mbg.generated
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund.FCreateUser
     *
     * @return the value of t_base_fund.FCreateUser
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund.FCreateUser
     *
     * @param createUser the value for t_base_fund.FCreateUser
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund.FUpdateUser
     *
     * @return the value of t_base_fund.FUpdateUser
     *
     * @mbg.generated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund.FUpdateUser
     *
     * @param updateUser the value for t_base_fund.FUpdateUser
     *
     * @mbg.generated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund.FDeleteUser
     *
     * @return the value of t_base_fund.FDeleteUser
     *
     * @mbg.generated
     */
    public String getDeleteUser() {
        return deleteUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund.FDeleteUser
     *
     * @param deleteUser the value for t_base_fund.FDeleteUser
     *
     * @mbg.generated
     */
    public void setDeleteUser(String deleteUser) {
        this.deleteUser = deleteUser == null ? null : deleteUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_fund.FIsDelete
     *
     * @return the value of t_base_fund.FIsDelete
     *
     * @mbg.generated
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_fund.FIsDelete
     *
     * @param isDelete the value for t_base_fund.FIsDelete
     *
     * @mbg.generated
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fund
     *
     * @mbg.generated
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fund
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
        sb.append(", fundTypeId=").append(fundTypeId);
        sb.append(", number=").append(number);
        sb.append(", name=").append(name);
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
     * This class corresponds to the database table t_base_fund
     *
     * @mbg.generated
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fund
         *
         * @mbg.generated
         */
        private FundBase obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund
         *
         * @mbg.generated
         */
        public Builder() {
            this.obj = new FundBase();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund.FId
         *
         * @param id the value for t_base_fund.FId
         *
         * @mbg.generated
         */
        public Builder id(Integer id) {
            obj.setId(id);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund.FFundTypeId
         *
         * @param fundTypeId the value for t_base_fund.FFundTypeId
         *
         * @mbg.generated
         */
        public Builder fundTypeId(Integer fundTypeId) {
            obj.setFundTypeId(fundTypeId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund.FNumber
         *
         * @param number the value for t_base_fund.FNumber
         *
         * @mbg.generated
         */
        public Builder number(String number) {
            obj.setNumber(number);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund.FName
         *
         * @param name the value for t_base_fund.FName
         *
         * @mbg.generated
         */
        public Builder name(String name) {
            obj.setName(name);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund.FCreateTime
         *
         * @param createTime the value for t_base_fund.FCreateTime
         *
         * @mbg.generated
         */
        public Builder createTime(Date createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund.FUpdateTime
         *
         * @param updateTime the value for t_base_fund.FUpdateTime
         *
         * @mbg.generated
         */
        public Builder updateTime(Date updateTime) {
            obj.setUpdateTime(updateTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund.FDeleteTime
         *
         * @param deleteTime the value for t_base_fund.FDeleteTime
         *
         * @mbg.generated
         */
        public Builder deleteTime(Date deleteTime) {
            obj.setDeleteTime(deleteTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund.FCreateUser
         *
         * @param createUser the value for t_base_fund.FCreateUser
         *
         * @mbg.generated
         */
        public Builder createUser(String createUser) {
            obj.setCreateUser(createUser);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund.FUpdateUser
         *
         * @param updateUser the value for t_base_fund.FUpdateUser
         *
         * @mbg.generated
         */
        public Builder updateUser(String updateUser) {
            obj.setUpdateUser(updateUser);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund.FDeleteUser
         *
         * @param deleteUser the value for t_base_fund.FDeleteUser
         *
         * @mbg.generated
         */
        public Builder deleteUser(String deleteUser) {
            obj.setDeleteUser(deleteUser);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column t_base_fund.FIsDelete
         *
         * @param isDelete the value for t_base_fund.FIsDelete
         *
         * @mbg.generated
         */
        public Builder isDelete(Integer isDelete) {
            obj.setIsDelete(isDelete);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund
         *
         * @mbg.generated
         */
        public FundBase build() {
            return this.obj;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_base_fund
     *
     * @mbg.generated
     */
    public enum Column {
        id("FId", "id", "INTEGER", false),
        fundTypeId("FFundTypeId", "fundTypeId", "INTEGER", false),
        number("FNumber", "number", "VARCHAR", false),
        name("FName", "name", "VARCHAR", false),
        createTime("FCreateTime", "createTime", "TIMESTAMP", false),
        updateTime("FUpdateTime", "updateTime", "TIMESTAMP", false),
        deleteTime("FDeleteTime", "deleteTime", "TIMESTAMP", false),
        createUser("FCreateUser", "createUser", "VARCHAR", false),
        updateUser("FUpdateUser", "updateUser", "VARCHAR", false),
        deleteUser("FDeleteUser", "deleteUser", "VARCHAR", false),
        isDelete("FIsDelete", "isDelete", "TINYINT", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fund
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fund
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fund
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fund
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fund
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_base_fund
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund
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
         * This method corresponds to the database table t_base_fund
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund
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
         * This method corresponds to the database table t_base_fund
         *
         * @mbg.generated
         */
        public static Column[] all() {
            return Column.values();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_base_fund
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
         * This method corresponds to the database table t_base_fund
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}