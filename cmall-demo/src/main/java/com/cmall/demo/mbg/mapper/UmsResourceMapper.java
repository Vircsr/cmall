package com.cmall.demo.mbg.mapper;

import com.cmall.demo.mbg.model.UmsResource;
import com.cmall.demo.mbg.model.UmsResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    long countByExample(UmsResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int deleteByExample(UmsResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int insert(UmsResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int insertSelective(UmsResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    List<UmsResource> selectByExample(UmsResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    UmsResource selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByExampleSelective(@Param("record") UmsResource record, @Param("example") UmsResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByExample(@Param("record") UmsResource record, @Param("example") UmsResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByPrimaryKeySelective(UmsResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByPrimaryKey(UmsResource record);
}