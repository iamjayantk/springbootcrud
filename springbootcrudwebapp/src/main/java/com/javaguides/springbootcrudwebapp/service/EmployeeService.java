package com.javaguides.springbootcrudwebapp.service;

import java.util.List;

import com.javaguides.springbootcrudwebapp.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	//void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	
	//void deleteEmployeeById(long id);
	void deleteEmployeeById(long id);

}
