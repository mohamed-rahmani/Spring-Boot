package fr.devavance.employee.employeeweb.controller.implementation;

import fr.devavance.employee.employeecore.core.service.implementation.EmployeeService;
import fr.devavance.employee.employeeweb.controller.IEmloyeeController;
import fr.devavance.employee.employeecore.core.entity.Employee;
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
    private EmployeeService service;

    @Autowired
    public EmployeeController(EmployeeService employeeDAO) {
        this.service = employeeDAO;
    }

    @GetMapping
    public String findAllEmployee(Model model) {
        model.addAttribute("employees", this.service.findAll());
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
        service.save(employee);
        return "redirect:/employee";
    }

    @Override
    @RequestMapping(value = "/{id}")
    public String displayEmployee(@PathVariable(name="id") Long id, Model model) {
        model.addAttribute("employee", this.service.findById(id));
        return "view_employee";
    }
}
