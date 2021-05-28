package com.yunhe.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class OutController {

    @RequestMapping("/out")
    public String out(HttpSession session){
        //通过调用session的名字删除
        session.removeAttribute("loginUser");
        System.out.println(session);
        return "login";
    }

}
