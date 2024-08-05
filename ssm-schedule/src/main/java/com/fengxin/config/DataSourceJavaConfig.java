package com.fengxin.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @author FENGXIN
 * @date 2024/8/5
 * @project ssm-integration-part
 * @description 和MapperJavaConfig分开配置 mybatis的SqlSessionFactoryBean和MapperScannerConfigurer会先进行 找不到DataSource
 **/

@Configuration
@PropertySource ("classpath:jdbc.properties")
public class DataSourceJavaConfig {
    
    @Value ("${url}")
    private String url;
    @Value ("${driver}")
    private String driver;
    @Value ("${user}")
    private String user;
    @Value ("${password}")
    private String password;
    
    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource ();
        druidDataSource.setUrl (url);
        druidDataSource.setDriverClassName (driver);
        druidDataSource.setUsername (user);
        druidDataSource.setPassword (password);
        return druidDataSource;
    }
}
