package com.demo1;

import com.demo1.mapper.UserMapper;
import com.demo1.pojo.User;
import com.demo1.util.SqlSessionUtil;

public class App2 {
    public static UserMapper mapper=SqlSessionUtil.getSqlSession().getMapper(UserMapper.class);
    public static void main(String[] args) {
        User user = mapper.getUserByUsername("bing");
        System.out.println(user);
    }
}
