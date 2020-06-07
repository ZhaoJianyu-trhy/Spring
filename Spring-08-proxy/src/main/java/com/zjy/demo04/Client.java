package com.zjy.demo04;

import com.zjy.demo02.UserService;
import com.zjy.demo02.UserServiceImpl;

public class Client {

    public static void main(String[] args) {


        //真实角色
        UserServiceImpl userService = new UserServiceImpl();

        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //设置要代理的对象
        pih.setProxy(userService);

        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();

        proxy.Create();
        proxy.Delete();
        proxy.Retrieve();
    }
}
