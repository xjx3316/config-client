package com.didispace.controller;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by xjx on 2018/12/10.
 */
/*
@Configuration
public class JdbcController {
    @Value("${url}")
    private String url;
    @Value("${driver}")
    private String driverClass;
    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;
    @Bean
    //获取数据源
    public DataSource getDataSource() {
        //数据库连接池
        DruidDataSource dds = new DruidDataSource();
        dds.setUrl(url);
        dds.setDriverClassName(driverClass);
        dds.setUsername(username);
        dds.setPassword(password);
        return dds;
    }
}*/
