package com.didispace.controller;

import com.didispace.service.UserService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xjx on 2018/12/10.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryUser")
    public Object queryUser(String id){
       return userService.queryUser(id);
    }
}
