package com.yl.shop.test;

import com.yl.shop.springboot.rocketmq.ProducerApplication;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author yanglin
 * @create 2019-12-25 14:40
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ProducerApplication.class})
@Slf4j
public class ProducerTest {

  @Autowired
  private RocketMQTemplate rocketMQTemplate;

  /**
   * 发送消息
   */
  @Test
  public void testSendMessage(){
    rocketMQTemplate.convertAndSend("springboot-rocket","Hello Spring-boot-rocketMQ");
    log.info("消息发送成功！");
  }
}
