package fr.devavance.employee.employeecore.core.service.implementation;

import fr.devavance.employee.employeecore.core.entity.Employee;
import fr.devavance.employee.employeecore.core.repository.IEmployeeRepository;
import fr.devavance.employee.employeecore.core.service.IEmployeeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private IEmployeeRepository repository;

    @Override
    public List<Employee> findAll() {
        return (List<Employee>) repository.findAll();
    }

    @Override
    public void save(Employee employee) {
        repository.save(employee);
    }

    @Override
    public Employee findById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    // ...

}

