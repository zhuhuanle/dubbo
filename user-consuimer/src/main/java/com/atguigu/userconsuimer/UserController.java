package com.atguigu.userconsuimer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserImpl userImpl;

    @RequestMapping("/id")
    public Object getUser(){
        return userImpl.getUser();
    }
}
