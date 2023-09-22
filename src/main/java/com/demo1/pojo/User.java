package com.demo1.pojo;

import org.springframework.stereotype.Component;

@Component("user")
public class User {
    private String username;
    private String password;
    private Integer userid;

    public User() {
    }

    public User(String username, String password, Integer userid) {
        this.username = username;
        this.password = password;
        this.userid = userid;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return userid
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String toString() {
        return "User{username = " + username + ", password = " + password + ", userid = " + userid + "}";
    }
}
