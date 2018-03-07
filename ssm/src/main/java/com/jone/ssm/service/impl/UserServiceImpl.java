/*
 * @(#)UserServiceImpl.java 2018年1月6日下午8:32:44 ssm Copyright 2018 Thuisoft, Inc.
 * All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to
 * license terms.
 */
package com.jone.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jone.ssm.component.MultipleDataSource;
import com.jone.ssm.dao.UserMapper;
import com.jone.ssm.pojo.User;
import com.jone.ssm.service.UserService;

/**
 * UserServiceImpl
 * @author Administrator
 * @version 1.0
 *
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MultipleDataSource multipleDataSource;

    /** (non-Javadoc)
     * @see com.jone.ssm.service.UseServicer#selectAll()
     */
    @Override
    public List<User> selectAll() {
        multipleDataSource.setDataSourceKey("dataSource");
        System.out.println(userMapper.selectAll().size());
        return null;
    }

    @Override
    public List<User> selectAll2() {
        multipleDataSource.setDataSourceKey("postgreDataSource");
        System.out.println(userMapper.selectAll2().size());
        return null;
    }
}
