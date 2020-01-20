package com.myshop.common.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewNameInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
        String viewName = getViewName(request);
    }

    private String getViewName(HttpServletRequest request) throws {
        String contextPath = request.getContextPath();
        String uri = (String) request.getAttribute("javax.servlet.include.request_uro");
        if(uri == null || uri.trim().equals("")){
            uri = request.getRequestURI();
        }
    }
}
