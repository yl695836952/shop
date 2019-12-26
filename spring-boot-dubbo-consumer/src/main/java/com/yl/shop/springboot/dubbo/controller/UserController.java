package com.yl.shop.springboot.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yl.shop.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanglin
 * @create 2019-12-26 10:03
 */
@RestController
@RequestMapping("/user")
public class UserController {
  @Reference
  private IUserService userService;

  @RequestMapping("/sayHello")
  public String sayHello(String name){
    return userService.sayHello(name);
  }
}
