package com.atguigu.consumer.orderconsumer.service.Impl;

import com.atguigu.gmall.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;



@org.springframework.stereotype.Service
public class OrderServiceImpl {


    @Reference
    UserService userService;


    public Object setOrder(){
        return userService.getUserById(1);
    }

}
