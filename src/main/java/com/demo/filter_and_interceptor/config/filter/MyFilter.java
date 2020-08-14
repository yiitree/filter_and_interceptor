package com.demo.filter_and_interceptor.config.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebFilter(urlPatterns = "/**" ,filterName = "myFilter")
//@Order(1)
public class MyFilter implements Filter {

//    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器---初始化1");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String uri = request.getRequestURI();
        String method = request.getMethod();
        System.out.println(uri + method);
        System.out.println("过滤器---过滤器1");
        //执行下一个filter

        filterChain.doFilter(servletRequest, servletResponse);
//        if(true){
//            // 放行，交给下一个过滤器
//
//        }else {
//            response.sendRedirect("/getUser/1");
//        }
    }

    @Override
    public void destroy() {
        System.out.println("过滤器---销毁1");
    }

}
