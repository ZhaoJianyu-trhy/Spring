package com.zjy.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//等价于在beans.xml里面注册了，component——组件
@Component("uu")
@Scope("singleton")
public class User {

    @Value("小军")
    public String name;

    @Value("12")
    public int age;
}
