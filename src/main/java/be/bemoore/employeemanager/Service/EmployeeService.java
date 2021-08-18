package be.bemoore.employeemanager.Service;

import be.bemoore.employeemanager.model.Employee;
import be.bemoore.employeemanager.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EmployeeService  {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeId(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

}
