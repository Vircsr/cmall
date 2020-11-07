package com.cmall.demo.mbg.mapper;

import com.cmall.demo.mbg.model.OmsCartItem;
import com.cmall.demo.mbg.model.OmsCartItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsCartItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    long countByExample(OmsCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int deleteByExample(OmsCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int insert(OmsCartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int insertSelective(OmsCartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    List<OmsCartItem> selectByExample(OmsCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    OmsCartItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByExampleSelective(@Param("record") OmsCartItem record, @Param("example") OmsCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByExample(@Param("record") OmsCartItem record, @Param("example") OmsCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByPrimaryKeySelective(OmsCartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByPrimaryKey(OmsCartItem record);
}