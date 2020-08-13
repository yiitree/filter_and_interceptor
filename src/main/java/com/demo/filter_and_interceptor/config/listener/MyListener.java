package com.demo.filter_and_interceptor.config.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("---------------------------->请求销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("---------------------------->请求创建");
    }
}
