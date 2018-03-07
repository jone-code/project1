/*
 * @(#)Main.java 2018年1月6日下午11:35:41 ssm Copyright 2018 Thuisoft, Inc. All
 * rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to
 * license terms.
 */
package ssm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jone.ssm.component.MultipleDataSource;
import com.jone.ssm.dao.UserMapper;

/**
 * Main
 * @author Administrator
 * @version 1.0
 *
 */
public class Main {
    public static void main(String[] args) {
        //初始化ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");

        UserMapper userMapper = applicationContext.getBean(UserMapper.class);

        MultipleDataSource.setDataSourceKey("dataSource");
        userMapper.selectAll();
        MultipleDataSource.setDataSourceKey("postgreDataSource");
        userMapper.selectAll2();
    }
}
