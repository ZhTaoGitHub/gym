package com.bj.group6.controller;

import com.bj.group6.model.entity.Department;
import com.bj.group6.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
    public String testMvc(HttpServletRequest request){
        List<Department> departmentList = departmentService.listDepartment();
        request.setAttribute("deps",departmentList);
        return "success";
    }
}
