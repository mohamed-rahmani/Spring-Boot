package com.example.demo.controllers;

import com.example.demo.beans.Employee;
import com.example.demo.dao.IEmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeControleur {

    @Autowired
    private IEmployeeDAO employeeDAO;

    public EmployeeControleur(IEmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/employees")
    public String findAllEmployee(Model model) {
        model.addAttribute("employees", this.employeeDAO.findAll());
        model.addAttribute("employee", new Employee());
        return "view_employees";
    }

    @PostMapping("/addEmployee")
    public String addEmployee(Employee employee) {
        employeeDAO.add(employee);
        return "redirect:/";
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/employees";
    }
}
