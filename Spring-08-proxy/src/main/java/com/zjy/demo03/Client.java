package com.zjy.demo03;

public class Client {

    public static void main(String[] args) {

        //真实角色
        Host host = new Host();

        //代理角色:现在没有
        ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler();
        invocationHandler.setRent(host);
        Rent proxy = (Rent) invocationHandler.getProxy();
        proxy.regret("我不干了");
    }
}
