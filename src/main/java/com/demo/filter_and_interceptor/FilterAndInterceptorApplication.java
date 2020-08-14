package com.demo.filter_and_interceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan("com.demo.filter_and_interceptor.config")//注解配置，扫描包注解包 过滤器拦截器扫描注解   监听器
@SpringBootApplication
public class FilterAndInterceptorApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilterAndInterceptorApplication.class, args);
    }

}
