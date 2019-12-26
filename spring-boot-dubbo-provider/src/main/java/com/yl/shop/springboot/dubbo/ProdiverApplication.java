package com.yl.shop.springboot.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yanglin
 * @create 2019-12-26 9:07
 */

@SpringBootApplication
@EnableDubboConfiguration
public class ProdiverApplication {
  public static void main(String[] args) {
    SpringApplication.run(ProdiverApplication.class, args);
  }
}
