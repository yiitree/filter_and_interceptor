package com.demo.filter_and_interceptor.config.filter;


import javax.servlet.FilterConfig;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebFilter(urlPatterns = "/**" ,filterName = "myFilter")
//@Order(1)
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器---初始化1");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        System.out.println("过滤器---执行1");
//        response.setHeader("content-type", "text/html;charset=utf-8");
//        User user = new User();
//        user.setName("bravo");
//        user.setAge(18);
//        user.setAddress("wenzhou");
//        JSON json = JSONUtil.parse(user);
//        response.getWriter().print(json.toString());
        //执行下一个filter
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器---销毁1");
    }

}
