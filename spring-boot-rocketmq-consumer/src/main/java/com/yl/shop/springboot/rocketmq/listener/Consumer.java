package com.yl.shop.springboot.rocketmq.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author yanglin
 * @create 2019-12-25 15:56
 */
@Slf4j
@Component
@RocketMQMessageListener(topic = "springboot-rocket",
        consumerGroup = "${rocketmq.consumer.group}")
public class Consumer implements RocketMQListener<String> {
  @Override
  public void onMessage(String s) {
    System.out.println("接收到消息："+s);
    log.info("消费者启动成功");
  }
}
