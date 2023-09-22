package com.demo1.mapper;

import com.demo1.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {

    @Select("select * from user where userid=#{id}")
    User getUserById(Integer id);

    @Select("select * from user")
    List<User>getAllUser();

    @Select("select * from user where username=#{name}")
    User getUserByUsername(@Param("name") String username);

}
