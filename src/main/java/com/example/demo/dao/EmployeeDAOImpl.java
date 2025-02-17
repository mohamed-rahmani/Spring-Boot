package com.example.demo.dao;

import com.example.demo.Fonction;
import com.example.demo.beans.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component
public class EmployeeDAOImpl implements IEmployeeDAO {

    private ArrayList<Employee> employees;

    public EmployeeDAOImpl() {
        Employee employee1 = new Employee("Karim Mahmoud", "kmshawky20@gmail.com", "0097450413948", "Egypt", Fonction.DEV_WEB);
        Employee employee2 = new Employee("Fran Wilson", "franwilson@mail.com", "(204) 619-5731", "C/ Araquil, 67, Madrid, Spain", Fonction.DEV_OPS);
        Employee employee3 = new Employee("Maria Anders", "mariaanders@mail.com", "(503) 555-9931", "25, rue Lauriston, Paris, France", Fonction.CHEF_PROJET);
        Employee employee4 = new Employee("Thomas Hardy", "thomashardy@mail.com", "(171) 555-2222", "89 Chiaroscuro Rd, Portland, USA", Fonction.DEV_AI);
        Employee employee5 = new Employee("Ahmed Omar", "amhedoomar@gmail.com", "0096650413948", "KSA", Fonction.SOFTWARE_ARCHITECT);
        Employee employee6 = new Employee("Idam Wilson", "idamwilson@mail.com", "(204) 619-5331", "C/ Araquil, 67, Madrid, Spain", Fonction.DEV_AI);
        Employee employee7 = new Employee("Peter Perrier", "peterperrier@mail.com", "(313) 555-5735", "Obere Str. 57, Berlin, Germany", Fonction.DEV_WEB);
        Employee employee8 = new Employee("Mark Hardy", "markshardy@mail.com", "(171) 555-2222", "89 Chiaroscuro Rd, Portland, USA", Fonction.DEV_OPS);

        this.employees = new ArrayList<>();
        this.employees.add(employee1);
        this.employees.add(employee2);
        this.employees.add(employee3);
        this.employees.add(employee4);
        this.employees.add(employee5);
        this.employees.add(employee6);
        this.employees.add(employee7);
        this.employees.add(employee8);
    }

    @Override
    public ArrayList<Employee> findAll() {
        return this.employees;
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }
}
