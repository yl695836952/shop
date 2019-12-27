package com.itheima.api;

import com.itheima.entity.Result;
import com.itheima.shop.pojo.TradeGoods;
import com.itheima.shop.pojo.TradeGoodsNumberLog;

/**
 * 商品接口
 * @author yl
 */
public interface IGoodsService {
    /**
     * 根据ID查询商品对象
     * @param goodsId 商品ID
     * @return  TradeGoods
     */
    TradeGoods findOne(Long goodsId);

    /**
     * 扣减库存
     * @param goodsNumberLog   商品数量日志
     * @return  Result
     */
    Result reduceGoodsNum(TradeGoodsNumberLog goodsNumberLog);
}
