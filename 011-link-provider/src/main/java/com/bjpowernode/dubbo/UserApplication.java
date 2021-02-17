package com.bjpowernode.dubbo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class UserApplication {

    public static void main(String[] args) throws IOException {
        String path = "dubbo-link-provider.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);

        ((ClassPathXmlApplicationContext)applicationContext).start();
        //系统阻塞
        System.in.read();
    }
}
