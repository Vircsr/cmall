package com.cmall.demo.mbg.mapper;

import com.cmall.demo.mbg.model.CmsTopicCategory;
import com.cmall.demo.mbg.model.CmsTopicCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsTopicCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    long countByExample(CmsTopicCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int deleteByExample(CmsTopicCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int insert(CmsTopicCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int insertSelective(CmsTopicCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    List<CmsTopicCategory> selectByExample(CmsTopicCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    CmsTopicCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByExampleSelective(@Param("record") CmsTopicCategory record, @Param("example") CmsTopicCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByExample(@Param("record") CmsTopicCategory record, @Param("example") CmsTopicCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByPrimaryKeySelective(CmsTopicCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByPrimaryKey(CmsTopicCategory record);
}