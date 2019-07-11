package org.lba.springboot1.service;

import java.util.List;

import org.lba.springboot1.model.Employee;

public interface EmployeeService {

	//C
	Employee saveEmployee(Employee employee);

	//R
	List<Employee> listAllEmployees();
	Employee findById(long id);

	//U
	
	//D
	void deleteEmployeeById(long id);

}
