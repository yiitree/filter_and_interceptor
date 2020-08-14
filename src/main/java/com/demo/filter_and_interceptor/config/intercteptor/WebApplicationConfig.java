package com.demo.filter_and_interceptor.config.intercteptor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器配置
 */
@Configuration
public class WebApplicationConfig implements WebMvcConfigurer {

    /**
     * 注意为HandlerInterceptor，而不是自定义的拦截器
     */
    @Autowired
    private MyInterceptor myInterceptor;

    //定义一个开放api
    String openUrl = "";

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor).addPathPatterns("/**").excludePathPatterns(openUrl);
    }

}
