package com.bj.group6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller("/test1")
@RequestMapping("test1")
public class TestController1 {
    @RequestMapping("/t1")
    public String t1(@ModelAttribute("a")String a, HttpServletRequest request,HttpSession session){
        System.out.println(session.getAttribute("c"));
        System.out.println(a);
        System.out.println(request.getParameter("b"));
        return "success";
    }
}
