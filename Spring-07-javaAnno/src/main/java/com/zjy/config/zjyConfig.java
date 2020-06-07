package com.zjy.config;

import com.zjy.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//这个也会被Spring容器托管，注册到容器中，因为他本来就是一个Component
//Configuration，和xml功能一样
@Configuration
@ComponentScan("com.zjy")
@Import(zjyConfig2.class)
public class zjyConfig {

    /**
     * bean，相当于xml中的<bean></bean>
     * 方法的名字，相当于bean中的id属性
     * class属性，即方法的返回值
     * @return
     */
    @Bean
    public User user() {
        return new User();
    }
}
