package com.zjy.demo02;

public class UserServiceImpl implements UserService {
    public void Create() {
        System.out.println("增加了一个用户");
    }

    public void Retrieve() {
        System.out.println("查询了一个用户");
    }

    public void Update() {
        System.out.println("更新了一个用户");
    }

    public void Delete() {
        System.out.println("删除了一个用户");
    }
}
