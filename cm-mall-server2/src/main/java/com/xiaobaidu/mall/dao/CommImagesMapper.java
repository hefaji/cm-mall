package com.xiaobaidu.mall.dao;

import com.xiaobaidu.mall.entity.CommImages;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CommImagesMapper extends IQuery {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_images
     *
     * @mbg.generated Thu Sep 14 11:30:14 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_images
     *
     * @mbg.generated Thu Sep 14 11:30:14 CST 2017
     */
    int insert(CommImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_images
     *
     * @mbg.generated Thu Sep 14 11:30:14 CST 2017
     */
    CommImages selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_images
     *
     * @mbg.generated Thu Sep 14 11:30:14 CST 2017
     */
    List<CommImages> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_images
     *
     * @mbg.generated Thu Sep 14 11:30:14 CST 2017
     */
    int updateByPrimaryKey(CommImages record);
}