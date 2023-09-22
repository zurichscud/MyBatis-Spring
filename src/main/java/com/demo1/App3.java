package com.demo1;

import com.alibaba.druid.pool.DruidDataSource;
import com.demo1.config.SpringConfig;
import com.demo1.pojo.User;
import com.demo1.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 使用Spring启动MyBatis
 */
public class App3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = ac.getBean(UserService.class);
        userService.function();

    }
}
