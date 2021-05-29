package com.yunhe.controller;

import com.yunhe.mapper.DepartmentMapper;
import com.yunhe.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {

    @RequestMapping("/hello")
    public String index(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session){
        //StringUtils的判断是否为空StringUtils工具类
        if (!StringUtils.isEmpty(username)&&"123456".equals(password)){
            session.setAttribute("loginUser",username);
            //username不为空并且password是123456则重定向main.html
            //如果此处不使用main.html,直接使用index页面地址的话显示的是localhost:8080/hello
            return "redirect:main.html";
        }else {
            //文字赋给msg传到前端页面
            model.addAttribute("msg","用户名或密码错误");
            //如果此出用了重定向，则不能打印msg的信息
            return "login";
        }
    }
}
