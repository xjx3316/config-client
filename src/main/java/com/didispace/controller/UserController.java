package com.didispace.controller;

import com.didispace.service.UserService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xjx on 2018/12/10.
 */
@RefreshScope
@RestController
public class UserController {

    @Value("${spring.datasource.driver-class-name}")
    private String driver;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;

    @Autowired
    private UserService userService;

    @RequestMapping("/queryUser")
    public Object queryUser(String id){
       return userService.queryUser(id);
    }
}
