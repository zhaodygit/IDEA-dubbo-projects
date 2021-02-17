package com.bjpowernode.dubbo.service.impl;

import com.bjpowernode.dubbo.service.ShopService;
import com.bjpowernode.dubbo.service.UserService;

public class ShopServiceImpl implements ShopService {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String hello() {
        String sayHello = userService.sayHello();
        return sayHello;
    }
}
