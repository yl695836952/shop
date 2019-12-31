package com.itheima.api;

import com.itheima.entity.Result;
import com.itheima.shop.pojo.TradePay;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.remoting.exception.RemotingException;

/**
 * 支付接口
 * @author yl
 */
public interface IPayService {

    /**
     * 创建支付订单
     * @param tradePay 支付
     * @return
     */
    public Result createPayment(TradePay tradePay);

    /**
     *  支付回调
     * @param tradePay
     * @return
     * @throws InterruptedException
     * @throws RemotingException
     * @throws MQClientException
     * @throws MQBrokerException
     */
    public Result callbackPayment(TradePay tradePay) throws InterruptedException, RemotingException, MQClientException, MQBrokerException;

}
