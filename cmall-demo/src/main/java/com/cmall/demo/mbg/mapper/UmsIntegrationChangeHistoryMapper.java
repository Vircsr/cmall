package com.cmall.demo.mbg.mapper;

import com.cmall.demo.mbg.model.UmsIntegrationChangeHistory;
import com.cmall.demo.mbg.model.UmsIntegrationChangeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsIntegrationChangeHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    long countByExample(UmsIntegrationChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int deleteByExample(UmsIntegrationChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int insert(UmsIntegrationChangeHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int insertSelective(UmsIntegrationChangeHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    List<UmsIntegrationChangeHistory> selectByExample(UmsIntegrationChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    UmsIntegrationChangeHistory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByExampleSelective(@Param("record") UmsIntegrationChangeHistory record, @Param("example") UmsIntegrationChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByExample(@Param("record") UmsIntegrationChangeHistory record, @Param("example") UmsIntegrationChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByPrimaryKeySelective(UmsIntegrationChangeHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_change_history
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByPrimaryKey(UmsIntegrationChangeHistory record);
}