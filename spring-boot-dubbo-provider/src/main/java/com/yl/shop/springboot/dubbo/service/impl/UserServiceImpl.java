package com.yl.shop.springboot.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yl.shop.service.IUserService;
import org.springframework.stereotype.Component;

/**
 * @author yanglin
 * @create 2019-12-26 9:11
 */
@Component
@Service(interfaceClass = IUserService.class)
public class UserServiceImpl implements IUserService {
  @Override
  public String sayHello(String name) {
    return "hello:"+name;
  }
}
