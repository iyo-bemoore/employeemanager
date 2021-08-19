package be.bemoore.employeemanager.Controllers;

import be.bemoore.employeemanager.Service.EmployeeService;
import be.bemoore.employeemanager.Util.Mappings;
import be.bemoore.employeemanager.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Mappings.BASE_URL)
public class EmployeeResource {
    private final EmployeeService employeeService;
    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(Mappings.ALL_EMPLOYEES)
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.ACCEPTED);
    }

}
