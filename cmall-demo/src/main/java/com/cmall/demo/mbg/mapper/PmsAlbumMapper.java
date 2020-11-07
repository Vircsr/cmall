package com.cmall.demo.mbg.mapper;

import com.cmall.demo.mbg.model.PmsAlbum;
import com.cmall.demo.mbg.model.PmsAlbumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsAlbumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    long countByExample(PmsAlbumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int deleteByExample(PmsAlbumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int insert(PmsAlbum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int insertSelective(PmsAlbum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    List<PmsAlbum> selectByExample(PmsAlbumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    PmsAlbum selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByExampleSelective(@Param("record") PmsAlbum record, @Param("example") PmsAlbumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByExample(@Param("record") PmsAlbum record, @Param("example") PmsAlbumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByPrimaryKeySelective(PmsAlbum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album
     *
     * @mbg.generated Thu Nov 05 21:07:36 CST 2020
     */
    int updateByPrimaryKey(PmsAlbum record);
}