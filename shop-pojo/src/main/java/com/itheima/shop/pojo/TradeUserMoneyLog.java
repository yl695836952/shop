package com.itheima.shop.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 操作用户交易金额日志
 * @author yl
 */
public class TradeUserMoneyLog extends TradeUserMoneyLogKey implements Serializable {
    /**
     *  使用了多少钱
     */
    private BigDecimal useMoney;
    /**
     *  日志时间
     */
    private Date createTime;

    public BigDecimal getUseMoney() {
        return useMoney;
    }

    public void setUseMoney(BigDecimal useMoney) {
        this.useMoney = useMoney;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}