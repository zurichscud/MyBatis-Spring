package com.demo1.mapper;

import com.demo1.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    User getUserById(Integer id);

    @Select("select * from user")
    List<User>getAllUser();
    @Select("select * from user where username=#{name}")
    User getUserByUsername(@Param("name") String username);
}
