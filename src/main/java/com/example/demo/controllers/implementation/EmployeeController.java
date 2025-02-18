package com.example.demo.controllers.implementation;

import com.example.demo.entity.Employee;
import com.example.demo.controllers.IEmloyeeController;
import com.example.demo.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController implements IEmloyeeController {
    private IEmployeeRepository employeeDAO;

    @Autowired
    public EmployeeController(IEmployeeRepository employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping
    public String findAllEmployee(Model model) {
        model.addAttribute("employees", this.employeeDAO.findAll());
        model.addAttribute("employee", new Employee());
        return "view_home";
    }

    @Override
    @GetMapping("/home")
    public String displayHome(Model model) {
        return "redirect:/employee";
    }

    @Override
    @PostMapping("/addemployee")
    public String addEmployee(Employee employee) {
        System.out.println("POST MAPPING IN addemployee");
        employeeDAO.save(employee);
        return "redirect:/employee";
    }

    @Override
    @RequestMapping(value = "/{id}")
    public String displayEmployee(@PathVariable(name="id") Long id, Model model) {
        if(this.employeeDAO.findById(id).isPresent()) {
            model.addAttribute("employee", this.employeeDAO.findById(id).get());
        }
        return "view_employee";
    }
}
