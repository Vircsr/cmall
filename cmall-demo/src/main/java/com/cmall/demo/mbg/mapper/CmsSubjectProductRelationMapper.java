package com.cmall.demo.mbg.mapper;

import com.cmall.demo.mbg.model.CmsSubjectProductRelation;
import com.cmall.demo.mbg.model.CmsSubjectProductRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsSubjectProductRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    long countByExample(CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int deleteByExample(CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int insert(CmsSubjectProductRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int insertSelective(CmsSubjectProductRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    List<CmsSubjectProductRelation> selectByExample(CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    CmsSubjectProductRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByExampleSelective(@Param("record") CmsSubjectProductRelation record, @Param("example") CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByExample(@Param("record") CmsSubjectProductRelation record, @Param("example") CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByPrimaryKeySelective(CmsSubjectProductRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByPrimaryKey(CmsSubjectProductRelation record);
}