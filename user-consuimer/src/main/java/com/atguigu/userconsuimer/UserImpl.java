package com.atguigu.userconsuimer;

import com.atguigu.gmall.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Service;

@Service
public class UserImpl {

    @Reference
    UserService userService;

    public Object getUser(){
        return userService.getUserById(1);
    }

}
