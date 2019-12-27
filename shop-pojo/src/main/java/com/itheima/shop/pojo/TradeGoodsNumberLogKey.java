package com.itheima.shop.pojo;

import java.io.Serializable;

public class TradeGoodsNumberLogKey implements Serializable {
    /**
     * 商品ID
     */
    private Long goodsId;
    /**
     * 库存ID
     */
    private Long orderId;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}