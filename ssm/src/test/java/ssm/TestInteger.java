/*
 * @(#)TestInteger.java 2018年1月7日下午11:25:54 ssm Copyright 2018 Thuisoft, Inc.
 * All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to
 * license terms.
 */
package ssm;

/**
 * TestInteger
 * @author Administrator
 * @version 1.0
 *
 */
public class TestInteger {
    public static void main(String[] args) {
        Integer a = 128, b = 128;
        Integer c = 127, d = 127;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
        System.out.println(c == d);

        int aa = 129123;
        System.out.println(aa);

        System.out.println(Integer.MAX_VALUE);
    }
}
