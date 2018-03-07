/*
 * @(#)MultipleDataSource.java 2018年1月6日下午11:33:35 ssm Copyright 2018 Thuisoft,
 * Inc. All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject
 * to license terms.
 */
package com.jone.ssm.component;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.jdbc.datasource.lookup.DataSourceLookup;

/**
 * MultipleDataSource
 * @author Administrator
 * @version 1.0
 *
 */
public class MultipleDataSource extends AbstractRoutingDataSource {
    private static final ThreadLocal<String> dataSourceKey = new InheritableThreadLocal<String>();

    public static void setDataSourceKey(String dataSource) {
        dataSourceKey.set(dataSource);
    }

    /** (non-Javadoc)
     * @see org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#setTargetDataSources(java.util.Map)
     */
    @Override
    public void setTargetDataSources(Map<Object, Object> targetDataSources) {
        // TODO Auto-generated method stub
        super.setTargetDataSources(targetDataSources);
    }

    /** (non-Javadoc)
     * @see org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#setDefaultTargetDataSource(java.lang.Object)
     */
    @Override
    public void setDefaultTargetDataSource(Object defaultTargetDataSource) {
        // TODO Auto-generated method stub
        super.setDefaultTargetDataSource(defaultTargetDataSource);
    }

    /** (non-Javadoc)
     * @see org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#setLenientFallback(boolean)
     */
    @Override
    public void setLenientFallback(boolean lenientFallback) {
        // TODO Auto-generated method stub
        super.setLenientFallback(lenientFallback);
    }

    /** (non-Javadoc)
     * @see org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#setDataSourceLookup(org.springframework.jdbc.datasource.lookup.DataSourceLookup)
     */
    @Override
    public void setDataSourceLookup(DataSourceLookup dataSourceLookup) {
        // TODO Auto-generated method stub
        super.setDataSourceLookup(dataSourceLookup);
    }

    /** (non-Javadoc)
     * @see org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() {
        // TODO Auto-generated method stub
        super.afterPropertiesSet();
    }

    /** (non-Javadoc)
     * @see org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#resolveSpecifiedLookupKey(java.lang.Object)
     */
    @Override
    protected Object resolveSpecifiedLookupKey(Object lookupKey) {
        // TODO Auto-generated method stub
        return super.resolveSpecifiedLookupKey(lookupKey);
    }

    /** (non-Javadoc)
     * @see org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#resolveSpecifiedDataSource(java.lang.Object)
     */
    @Override
    protected DataSource resolveSpecifiedDataSource(Object dataSource) throws IllegalArgumentException {
        // TODO Auto-generated method stub
        return super.resolveSpecifiedDataSource(dataSource);
    }

    /** (non-Javadoc)
     * @see org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#getConnection()
     */
    @Override
    public Connection getConnection() throws SQLException {
        // TODO Auto-generated method stub
        return super.getConnection();
    }

    /** (non-Javadoc)
     * @see org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#getConnection(java.lang.String, java.lang.String)
     */
    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        // TODO Auto-generated method stub
        return super.getConnection(username, password);
    }

    /** (non-Javadoc)
     * @see org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#unwrap(java.lang.Class)
     */
    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        // TODO Auto-generated method stub
        return super.unwrap(iface);
    }

    /** (non-Javadoc)
     * @see org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#isWrapperFor(java.lang.Class)
     */
    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        // TODO Auto-generated method stub
        return super.isWrapperFor(iface);
    }

    /** (non-Javadoc)
     * @see org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#determineTargetDataSource()
     */
    @Override
    protected DataSource determineTargetDataSource() {
        // TODO Auto-generated method stub
        return super.determineTargetDataSource();
    }

    @Override
    protected Object determineCurrentLookupKey() {
        return dataSourceKey.get();
    }
}
