package com.lucifer.sharding.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Lucifer
 */
@TableName(value = "t_order")
@Data
public class Order implements Serializable {
    /**
     * 订单id
     */
    @TableId(type=IdType.ID_WORKER)
    private Long orderId;

    /**
     * 订单价格
     */
    private BigDecimal price;

    /**
     * 下单用户id
     */
    private Long userId;

    /**
     * 订单状态
     */
    private String status;

    private static final long serialVersionUID = 1L;
}