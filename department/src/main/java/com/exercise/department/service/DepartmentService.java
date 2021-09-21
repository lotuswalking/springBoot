package com.exercise.department.service;

import java.util.List;

import com.exercise.department.entity.Department;
import com.exercise.department.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> findAll() {
        List<Department> departments = departmentRepository.findAll();
        return departments;
    }

    public Department findDepartmentById(Long departmentId) {
        return departmentRepository.findByDepartmentId(departmentId);
    }

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

}
