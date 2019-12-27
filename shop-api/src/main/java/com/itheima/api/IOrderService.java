package com.itheima.api;

import com.itheima.entity.Result;
import com.itheima.shop.pojo.TradeOrder;

/**
 * 商品接口
 * @author DELL
 */
public interface IOrderService {

    /**
     * 下单接口
     * @param order 订单对象
     * @return
     */
    public Result confirmOrder(TradeOrder order);

}
