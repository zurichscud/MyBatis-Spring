package com.demo1.mapper;

import com.demo1.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    User getUserById(Integer id);
    @Select("select * from user")
    List<User>getAllUser();
}
