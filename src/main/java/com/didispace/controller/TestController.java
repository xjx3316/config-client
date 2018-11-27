package com.didispace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xjx on 2018/11/27.
 */
@RestController
public class TestController {

    @Value("${hello}")
    private String hello;
    @Value("${username}")
    private String username;

    //第二种获取配置文件中的值的方式
    @Autowired
    private Environment env;

    @RequestMapping("/hello")
    public String hello(){
        return this.hello;
    }

    @RequestMapping("/username")
    public String username(){
        return this.username;
    }

    @RequestMapping("/neoHello")
    public String neoHello(){
        return env.getProperty("hello","undefined");
    }
}
