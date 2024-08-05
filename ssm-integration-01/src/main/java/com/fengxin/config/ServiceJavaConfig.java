package com.fengxin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author FENGXIN
 * @date 2024/8/5
 * @project ssm-integration-part
 * 1.service<br>
 * 2.开启aop注解的支持 @Before @Aspect @Order...<br>
 * 3.tx<br>
 **/
@Configuration
@EnableAspectJAutoProxy
@EnableTransactionManagement
@ComponentScan({"com.fengxin.service"})
public class ServiceJavaConfig {
    /**
     * 指定具体的事务管理器
     * @return dataSourceTransactionManager
     */
    public TransactionManager transactionManager(DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager ();
        dataSourceTransactionManager.setDataSource (dataSource);
        return dataSourceTransactionManager;
    }
}
