package org.lba.springboot1.service;

import java.util.List;

import org.lba.springboot1.model.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> listAllEmployees();

}
