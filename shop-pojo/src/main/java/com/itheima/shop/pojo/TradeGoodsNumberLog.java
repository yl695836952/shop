package com.itheima.shop.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 交易物品数量日志
 * @author yl
 */
public class TradeGoodsNumberLog extends TradeGoodsNumberLogKey implements Serializable {
    /**
     * 商品数量
     */
    private Integer goodsNumber;
    /**
     *  logTime
     */
    private Date logTime;

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }
}