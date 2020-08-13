package com.demo.filter_and_interceptor.config.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean registerFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new MyFilter());
        registrationBean.setName("myFilter");
        registrationBean.addUrlPatterns("/**");
        registrationBean.setOrder(1);
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean registerFilter2() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new MyFilter2());
        registrationBean.setName("myFilter2");
        registrationBean.addUrlPatterns("/**");
        registrationBean.setOrder(2);
        return registrationBean;
    }

}
