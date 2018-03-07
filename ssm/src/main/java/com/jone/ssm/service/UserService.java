/*
 * @(#)UseServicer.java 2018年1月6日下午8:29:10 ssm Copyright 2018 Thuisoft, Inc. All
 * rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to
 * license terms.
 */
package com.jone.ssm.service;

import java.util.List;

import com.jone.ssm.pojo.User;

/**
 * UseServicer
 * @author Administrator
 * @version 1.0
 *
 */
public interface UserService {
    List<User> selectAll();

    List<User> selectAll2();
}
