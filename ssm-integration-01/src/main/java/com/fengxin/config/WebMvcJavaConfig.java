package com.fengxin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author FENGXIN
 * @date 2024/8/5
 * @project ssm-integration-part
 * 1.controller层<br>
 * 2.全局异常处理器<br>
 * 3.json处理器 handlerAdapter handlerMapping<br>
 * 4.静态资源<br>
 * 5.jsp 视图解析器<br>
 * 6.拦截器<br>
 * ...<br>
 **/
@Configuration
@EnableWebMvc
@ComponentScan({"com.fengxin.controller"})
public class WebMvcJavaConfig implements WebMvcConfigurer {
    /**
     * 开启静态资源访问
     */
    @Override
    public void configureDefaultServletHandling (DefaultServletHandlerConfigurer configurer) {
        configurer.enable ();
    }
    
    // /**
    //  * 拦截器
    //  */
    // @Override
    // public void addInterceptors (InterceptorRegistry registry) {
    //     registry.addInterceptor ("");
    // }
}
