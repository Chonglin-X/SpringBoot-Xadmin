package com.yunhe.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginhandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        登入成功后，用户才有sessoin
        Object loginUser = request.getSession().getAttribute("loginUser");
        if (loginUser==null){//如果等于null说明没有获取到session
//            msg信息返回前端页面
            request.setAttribute("msg","没有权限，请先登入");
            //请求到登入页面
            request.getRequestDispatcher("/login.html").forward(request,response);
            return false;
        }else {
            return true;
        }

    }
}
