package com.yunhe.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("login.html").setViewName("login");
        registry.addViewController("404").setViewName("error");
        registry.addViewController("main.html").setViewName("index");
    }

    //拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器
        registry.addInterceptor(new LoginhandlerInterceptor())
                //拦截哪些路径
                .addPathPatterns("/**")
                //排除哪些路径
                .excludePathPatterns("/login.html","/404","/hello","/","/css/**","/fonts/**","/images/**","/js/**","/lib/**");

    }
}
