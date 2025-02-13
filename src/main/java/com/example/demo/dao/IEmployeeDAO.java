package com.example.demo.dao;

import com.example.demo.beans.Employee;

import java.util.List;

public interface IEmployeeDAO {
    List<Employee> findAll();
    void add(Employee employee);
}
