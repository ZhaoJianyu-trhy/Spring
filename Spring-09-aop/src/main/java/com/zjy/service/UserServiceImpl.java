package com.zjy.service;

import org.aspectj.lang.annotation.Pointcut;

public class UserServiceImpl implements UserService {

    public void add() {
        System.out.println("增加用户");
    }

    public void delete() {
        System.out.println("删除用户");
    }

    public void update() {
        System.out.println("更新用户");
    }

    public void select() {
        System.out.println("查询用户");
    }
}
