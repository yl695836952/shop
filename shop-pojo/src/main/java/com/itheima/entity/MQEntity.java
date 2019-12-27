package com.itheima.entity;

import java.math.BigDecimal;

/**
 * 消息实体
 * @author yl
 */
public class MQEntity {

    /**
     * 订单ID
     */
    private Long orderId;
    /**
     * 优惠券ID
     */
    private Long couponId;
    /**
     * 用户iD
     */
    private Long userId;
    /**
     * 余额
     */
    private BigDecimal userMoney;
    /**
     * 商品ID
     */
    private Long goodsId;
    /**
     * 商品数量
     */
    private Integer goodsNum;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }
}
