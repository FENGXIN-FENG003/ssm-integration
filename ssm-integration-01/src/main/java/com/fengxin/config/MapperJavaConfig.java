package com.fengxin.config;

import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.logging.slf4j.Slf4jImpl;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.AutoMappingBehavior;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author FENGXIN
 * @date 2024/8/5
 * @project ssm-integration-part
 * @description
 **/
@Configuration
public class MapperJavaConfig {
    // 创建SqlSessionFactory
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean ();
        sqlSessionFactoryBean.setDataSource (dataSource);
        
        // 设置配置
        // setting == configuration 在configuration中设置驼峰映射 日志 resultMap映射等
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration ();
        configuration.setMapUnderscoreToCamelCase (true);
        configuration.setLogImpl (Slf4jImpl.class);
        configuration.setAutoMappingBehavior (AutoMappingBehavior.FULL);
        sqlSessionFactoryBean.setConfiguration (configuration);
        // typeAliases
        sqlSessionFactoryBean.setTypeAliasesPackage ("com.fengxin.pojo");
        //分页插件配置
        //  2.
        Interceptor interceptor = new PageInterceptor ();
        //  3.
        Properties properties = new Properties ();
        properties.setProperty ("helperDialect","mysql");
        interceptor.setProperties (properties);
        //  1.
        sqlSessionFactoryBean.addPlugins (interceptor);
        
        return sqlSessionFactoryBean;
    }
    /**
     * 配置Mapper实例扫描工厂,设置mapper接口和xml文件所在的共同包
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer ();
        // 设置mapper接口和xml文件所在的共同包
        mapperScannerConfigurer.setBasePackage ("com.fengxin.mapper");
        return mapperScannerConfigurer;
    }
}
