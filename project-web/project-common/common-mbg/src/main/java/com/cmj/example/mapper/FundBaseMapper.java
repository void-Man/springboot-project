package com.cmj.example.mapper;

import com.cmj.example.base.FundBase;
import com.cmj.example.base.FundBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundBaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fund
     *
     * @mbg.generated
     */
    long countByExample(FundBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fund
     *
     * @mbg.generated
     */
    int insert(FundBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fund
     *
     * @mbg.generated
     */
    int insertSelective(@Param("record") FundBase record, @Param("selective") FundBase.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fund
     *
     * @mbg.generated
     */
    FundBase selectOneByExample(FundBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fund
     *
     * @mbg.generated
     */
    FundBase selectOneByExampleSelective(@Param("example") FundBaseExample example, @Param("selective") FundBase.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fund
     *
     * @mbg.generated
     */
    List<FundBase> selectByExampleSelective(@Param("example") FundBaseExample example, @Param("selective") FundBase.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fund
     *
     * @mbg.generated
     */
    List<FundBase> selectByExample(FundBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fund
     *
     * @mbg.generated
     */
    FundBase selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") FundBase.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fund
     *
     * @mbg.generated
     */
    FundBase selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fund
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FundBase record, @Param("example") FundBaseExample example, @Param("selective") FundBase.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fund
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FundBase record, @Param("example") FundBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fund
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(@Param("record") FundBase record, @Param("selective") FundBase.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fund
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FundBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fund
     *
     * @mbg.generated
     */
    int batchInsert(@Param("list") List<FundBase> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_fund
     *
     * @mbg.generated
     */
    int batchInsertSelective(@Param("list") List<FundBase> list, @Param("selective") FundBase.Column ... selective);
}