package com.bj.group6.test;


import com.bj.group6.model.entity.Department;
import com.bj.group6.service.DepartmentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-context.xml");
        Department department = new Department();
        department.setDepName("部门3");
        context.getBean(DepartmentService.class).addDepartment(department);
    }
    @Test
    public void testDelete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-context.xml");

        context.getBean(DepartmentService.class).removeDepartmentById(37);
    }

    @Test
    public void testSelect(){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-context.xml");
        System.out.println(context.getBean(DepartmentService.class).selectDepartmentById(29).getDepName());
    }
}
