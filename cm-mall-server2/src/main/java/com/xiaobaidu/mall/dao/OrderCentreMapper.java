package com.xiaobaidu.mall.dao;

import com.xiaobaidu.mall.entity.OrderCentre;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OrderCentreMapper extends IQuery {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_centre
     *
     * @mbg.generated Thu Sep 14 11:30:14 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_centre
     *
     * @mbg.generated Thu Sep 14 11:30:14 CST 2017
     */
    int insert(OrderCentre record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_centre
     *
     * @mbg.generated Thu Sep 14 11:30:14 CST 2017
     */
    OrderCentre selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_centre
     *
     * @mbg.generated Thu Sep 14 11:30:14 CST 2017
     */
    List<OrderCentre> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_centre
     *
     * @mbg.generated Thu Sep 14 11:30:14 CST 2017
     */
    int updateByPrimaryKey(OrderCentre record);
}