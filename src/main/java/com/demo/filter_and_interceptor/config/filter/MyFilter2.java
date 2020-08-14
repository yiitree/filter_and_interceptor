package com.demo.filter_and_interceptor.config.filter;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import java.io.IOException;

//@WebFilter(urlPatterns = "/**" ,filterName = "myFilter2")
//@Order(2)
public class MyFilter2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("过滤器---初始化2");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器---执行2");
        //执行下一个filter
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器---销毁2");
    }

}
