package com.atguigu.userconsuimer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class UserConsuimerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserConsuimerApplication.class, args);
    }

}
