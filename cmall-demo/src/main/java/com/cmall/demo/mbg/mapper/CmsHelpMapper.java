package com.cmall.demo.mbg.mapper;

import com.cmall.demo.mbg.model.CmsHelp;
import com.cmall.demo.mbg.model.CmsHelpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsHelpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    long countByExample(CmsHelpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int deleteByExample(CmsHelpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int insert(CmsHelp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int insertSelective(CmsHelp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    List<CmsHelp> selectByExampleWithBLOBs(CmsHelpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    List<CmsHelp> selectByExample(CmsHelpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    CmsHelp selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByExampleSelective(@Param("record") CmsHelp record, @Param("example") CmsHelpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") CmsHelp record, @Param("example") CmsHelpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByExample(@Param("record") CmsHelp record, @Param("example") CmsHelpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByPrimaryKeySelective(CmsHelp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(CmsHelp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByPrimaryKey(CmsHelp record);
}