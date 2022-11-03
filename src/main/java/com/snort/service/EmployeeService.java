package com.snort.service;

import java.util.List;

import com.snort.entity.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees(); 
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);
	
	void deleteEmployeeById(long id);

}
