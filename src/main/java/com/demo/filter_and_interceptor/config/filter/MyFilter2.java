package com.demo.filter_and_interceptor.config.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

//@WebFilter(urlPatterns = "/**" ,filterName = "myFilter2")
//@Order(2)
//@Component
public class MyFilter2 implements Filter {

//    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("过滤器---初始化2");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String uri = request.getRequestURI();
        String method = request.getMethod();
        System.out.println(uri + method);
        System.out.println("过滤器---过滤器2");
        //执行下一个filter
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器---销毁2");
    }

}
