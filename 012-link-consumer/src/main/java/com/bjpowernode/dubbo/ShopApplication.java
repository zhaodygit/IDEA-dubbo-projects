package com.bjpowernode.dubbo;

import com.bjpowernode.dubbo.service.ShopService;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShopApplication {
    public static void main(String[] args) {
        String path = "dubbo-link-consumer.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);

        ((ClassPathXmlApplicationContext)applicationContext).start();

        ShopService shopService = (ShopService) applicationContext.getBean("shopService");

        String hello = shopService.hello();

        System.out.println(hello);
    }
}
