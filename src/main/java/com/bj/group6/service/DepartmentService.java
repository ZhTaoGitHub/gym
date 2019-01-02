package com.bj.group6.service;

import com.bj.group6.model.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department selectDepartmentById(Integer id);

    void addDepartment(Department department);

    void removeDepartmentById(Integer id);

    List<Department> listDepartment();
}
