package com.fengxin.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author FENGXIN
 * @date 2024/8/5
 * @project ssm-integration-part
 * @description
 **/

public class MvcInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    // ioc父 service mapper
    @Override
    protected Class<?>[] getRootConfigClasses () {
        return new Class[]{
                ServiceJavaConfig.class, MapperJavaConfig.class, DataSourceJavaConfig.class
        };
    }
    // ioc子 controller
    @Override
    protected Class<?>[] getServletConfigClasses () {
        return new Class[]{WebMvcJavaConfig.class};
    }
    
    @Override
    protected String[] getServletMappings () {
        return new String[]{"/"};
    }
}