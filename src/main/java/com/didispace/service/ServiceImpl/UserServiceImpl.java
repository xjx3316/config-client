package com.didispace.service.ServiceImpl;

import com.didispace.mapper.UserMapper;
import com.didispace.pojo.User;
import com.didispace.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xjx on 2018/12/10.
 */
@Service
public class UserServiceImpl implements UserService {

    private final Logger logger = Logger.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUser(String id) {
       User user = userMapper.queryUser(id);
       logger.info("user: "+user);
       return user;
    }
}
