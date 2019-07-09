package org.lba.springboot1.repository;

import org.lba.springboot1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Employee findById(Long id);

	Employee findByName(String name);


}