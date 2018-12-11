package com.didispace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//此注解用于动态加载配置中心内容，如果没有此注解，
//即使执行http://localhost:7002/refresh刷新后，请求的配置文件也不会改变
//@RefreshScope
@RestController
public class TestController {

    /*@Value("${spring.datasource.username}")
    private String username;*/

    @Value("${spring.datasource.password}")
    private String password;

    //第二种获取配置文件中的值的方式
    @Autowired
    private Environment env;

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("配置文件信息为: " + this.password);
        return this.password;
    }

    /*@RequestMapping("/jdbcDriver")
    public String jdbcDriver(){
        return env.getProperty("jdbc.driver","undefined");
    }

    @RequestMapping("/jdbcUrl")
    public String jdbcUrl(){
        return env.getProperty("jdbc.url","undefined");
    }

    @RequestMapping("/jdbcUsername")
    public String jdbcUsername(){
        return env.getProperty("jdbc.username","undefined");
    }

    @RequestMapping("/jdbcPassword")
    public String jdbcPassword(){
        return env.getProperty("jdbc.password","undefined");
    }

    @RequestMapping("/username")
    public String username(){
        return this.username;
    }*/

}
