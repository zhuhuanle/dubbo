package com.atguigu.consumer.orderconsumer.controller;

import com.atguigu.consumer.orderconsumer.service.Impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderServiceImpl orderServiceImpl;

    @RequestMapping("/i")
    public Object createOrder(){
        return orderServiceImpl.setOrder();
    }
}
