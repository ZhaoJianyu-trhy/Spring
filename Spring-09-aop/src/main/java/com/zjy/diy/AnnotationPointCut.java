package com.zjy.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//方式三，使用注解方式
@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.zjy.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("====方式执行前====");
    }

    @After("execution(* com.zjy.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("====方法执行后====");
    }


    //在环绕增强中，可以给定一个参数，代表我们要处理切入的点
    @Around("execution(* com.zjy.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        Signature signature = joinPoint.getSignature();//获得签名
//执行方法
        System.out.println("signature: " + signature);

        //执行方法
        Object proceed = joinPoint.proceed();
        System.out.println(proceed);

        System.out.println("环绕后");
    }
}
