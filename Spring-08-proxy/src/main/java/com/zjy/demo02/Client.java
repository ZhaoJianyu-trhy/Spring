package com.zjy.demo02;

public class Client {

    public static void main(String[] args) {

        UserServiceImpl userService1 = new UserServiceImpl();
        Proxy proxy = new Proxy();
        proxy.setUserService(userService1);
        proxy.Delete();
    }
}
