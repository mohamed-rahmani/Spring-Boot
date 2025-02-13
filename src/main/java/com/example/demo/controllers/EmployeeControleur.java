package com.example.demo.controllers;

import com.example.demo.dao.EmployeeDAOImpl;
import com.example.demo.dao.IEmployeeDAO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.net.http.HttpRequest;

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
        return "view_employees";
    }

    @PostMapping("/addEmployee")
    public String addEmployee(Model model) {

    }

    @RequestMapping("/")
    public RedirectView home() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/employees");
        return redirectView;
    }
}
