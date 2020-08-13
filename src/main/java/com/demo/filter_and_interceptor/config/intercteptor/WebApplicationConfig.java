package com.demo.filter_and_interceptor.config.intercteptor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器配置
 */
@Configuration
public class WebApplicationConfig implements WebMvcConfigurer {

    @Autowired
    private HandlerInterceptor myInterceptor;

    //定义一个开放api
    String openUrl = "";

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor).addPathPatterns("/**").excludePathPatterns(openUrl);
    }

}
