package com.demo.filter_and_interceptor.config.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.FilterConfig;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = "/**" ,filterName = "myFilter")
@Order(1)
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化1");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String uri = request.getRequestURI();
        String method = request.getMethod();
        System.out.println(uri + method);
        System.out.println("过滤器1");
        //执行下一个filter
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("销毁1");
    }

}
