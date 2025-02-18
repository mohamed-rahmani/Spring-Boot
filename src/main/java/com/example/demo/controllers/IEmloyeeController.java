package com.example.demo.controllers;

import com.example.demo.entity.Employee;
import org.springframework.ui.Model;

public interface IEmloyeeController {
    public String displayHome(Model model);
    public String addEmployee(Employee employee);

    public String displayEmployee(Long id,  Model model);
}
