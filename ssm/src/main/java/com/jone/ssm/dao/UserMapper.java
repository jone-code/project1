/*
 * @(#)UserMapper.java 2018年1月6日下午8:34:21 ssm Copyright 2018 Thuisoft, Inc. All
 * rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to
 * license terms.
 */
package com.jone.ssm.dao;

import java.util.List;

import com.jone.ssm.pojo.User;

/**
 * UserMapper
 * @author Administrator
 * @version 1.0
 *
 */
public interface UserMapper {
    List<User> selectAll();

    List<User> selectAll2();
}
