/*
 * @(#)UserController.java 2018年1月6日下午7:40:02 ssm Copyright 2018 Thuisoft, Inc.
 * All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to
 * license terms.
 */
package com.jone.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jone.ssm.service.UserService;

/**
 * UserController
 * @author Administrator
 * @version 1.0
 *
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/show")
    public void show() {
        userService.selectAll();
        userService.selectAll2();
        System.out.println("123");
    }
}
