package com.zjy.demo03;

//房东，真实角色
public class Host implements Rent {
    public void rents() {
        System.out.println("房东要出租房子");
    }

    public void regret(String s) {
        System.out.println(s);
    }
}
