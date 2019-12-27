package com.itheima.api;

import com.itheima.entity.Result;
import com.itheima.shop.pojo.TradeUser;
import com.itheima.shop.pojo.TradeUserMoneyLog;

/**
 * 用户接口
 * @author yl
 */
public interface IUserService {
    /**
     * 根据用户ID查找该用户
     * @param userId
     * @return
     */
    TradeUser findOne(Long userId);

    /**
     *  更新余额
     * @param userMoneyLog
     * @return
     */
    Result updateMoneyPaid(TradeUserMoneyLog userMoneyLog);
}
