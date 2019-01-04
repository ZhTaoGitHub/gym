package com.bj.group6.service.impl;

import com.bj.group6.model.entity.Department;
import com.bj.group6.model.mappers.DepartmentMapper;
import com.bj.group6.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    @Transactional(propagation=Propagation.SUPPORTS)
    public Department selectDepartmentById(Integer id){
        return departmentMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
    public void addDepartment(Department department){
        departmentMapper.insert(department);
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
    public void removeDepartmentById(Integer id){
        departmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(propagation=Propagation.SUPPORTS)
    public List<Department> listDepartment(){
        return departmentMapper.listDepartments();
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
    public int delDepartment(Integer depId) {
        return departmentMapper.deleteByPrimaryKey(depId);
    }
}
