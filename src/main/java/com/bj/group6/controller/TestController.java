package com.bj.group6.controller;

import com.bj.group6.exception.GlobalException;
import com.bj.group6.model.entity.Department;
import com.bj.group6.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
    public String testMvc(HttpServletRequest request){
        List<Department> departmentList = departmentService.listDepartment();
        request.setAttribute("deps",departmentList);
        return "success";
    }

    @RequestMapping(value = "/delDep",method = {RequestMethod.GET,RequestMethod.POST})
    public String testDelDepartment(Integer depId){
        int rs = departmentService.delDepartment(depId);
        if(rs<=0){
            try {
                throw new GlobalException("删除失败");
            } catch (GlobalException e) {
                e.printStackTrace();
            }
        }

        return "redirect:/test/test";
    }

    @RequestMapping(value = "/test1")
    public ModelAndView toTest(RedirectAttributes attributes){
//        跳转controller两种传参方式
//        方式一
        attributes.addAttribute("a","a");
        attributes.addFlashAttribute("c","c");
//        方式二
        ModelAndView modelAndView = new ModelAndView("redirect:/test1/t1");
        modelAndView.addObject("b","b");
        return modelAndView;
    }
}
