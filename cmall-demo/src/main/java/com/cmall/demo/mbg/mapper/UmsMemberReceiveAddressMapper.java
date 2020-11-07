package com.cmall.demo.mbg.mapper;

import com.cmall.demo.mbg.model.UmsMemberReceiveAddress;
import com.cmall.demo.mbg.model.UmsMemberReceiveAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberReceiveAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    long countByExample(UmsMemberReceiveAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int deleteByExample(UmsMemberReceiveAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int insert(UmsMemberReceiveAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int insertSelective(UmsMemberReceiveAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    List<UmsMemberReceiveAddress> selectByExample(UmsMemberReceiveAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    UmsMemberReceiveAddress selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByExampleSelective(@Param("record") UmsMemberReceiveAddress record, @Param("example") UmsMemberReceiveAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByExample(@Param("record") UmsMemberReceiveAddress record, @Param("example") UmsMemberReceiveAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByPrimaryKeySelective(UmsMemberReceiveAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByPrimaryKey(UmsMemberReceiveAddress record);
}