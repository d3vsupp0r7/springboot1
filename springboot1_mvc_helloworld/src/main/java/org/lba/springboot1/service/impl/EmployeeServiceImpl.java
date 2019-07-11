package org.lba.springboot1.service.impl;

import java.util.List;

import org.lba.springboot1.model.Employee;
import org.lba.springboot1.repository.EmployeeRepository;
import org.lba.springboot1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRespository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
	
		Employee savedEmployee = employeeRespository.save(employee);
		return savedEmployee;
	}

	@Override
	public List<Employee> listAllEmployees() {
		return employeeRespository.findAll();
	}

	@Override
	public Employee findById(long id) {
		return employeeRespository.findById(id);
	}

	@Override
	public void deleteEmployeeById(long id) {
		employeeRespository.delete(id);
	}

}
