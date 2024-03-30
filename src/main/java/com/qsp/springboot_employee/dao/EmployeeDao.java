package com.qsp.springboot_employee.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.springboot_employee.dto.Employee;
import com.qsp.springboot_employee.repo.EmployeeRepository;

@Repository
public class EmployeeDao 
{
	@Autowired
   private EmployeeRepository repo;
   
   public Employee saveEmployee(Employee employee)
   {
	   return repo.save(employee);
   }

public Employee findEmployee(int id)
{
	//return repo.findById(id).get();
	//avoid no NoSuchelementError elementError 
	Optional<Employee>optional=repo.findById(id);
	if(optional.isPresent())
	{
		return optional.get();
	}
	return null;
	
	
	
	/* if(optional.isEmpty())
	{
		return null;
	}
	return optional.get(); */
	
}

public List<Employee> getAllEmployee() {
	// TODO Auto-generated method stub
	return repo.findAll();
}

public Employee deleteEmployee(int id) {
	// TODO Auto-generated method stub
	Optional<Employee>optional=repo.findById(id);
//	if(optional.isEmpty())
//	{
//		return null;
//	}
//	repo.deleteById(id);
//	return optional.get();
	if(optional.isEmpty())
	{
		return null;
	}
	Employee employee=optional.get();
	repo.delete(employee);
	return employee;
}

public Employee updateEmployee(int id, Employee employee) {
	Optional<Employee>optional=repo.findById(id);
	if(optional.isPresent())
	{
		employee.setId(id);
		return repo.save(employee);
	}
	return null;
}

public Employee updatePhone(int id, long phone) {
	// TODO Auto-generated method stub
	Optional<Employee>optional=repo.findById(id);
	if(optional.isEmpty())
	{
		return null;
	}
	Employee employee=optional.get();
	employee.setPhone(phone);
	return repo.save(employee);
}

public Employee updateName(int id, String name) {
	// TODO Auto-generated method stub
	Optional<Employee>optional=repo.findById(id);
	if(optional.isEmpty())
	{
		return null;
	}
	Employee employee=optional.get();
	employee.setName(name);
	return repo.save(employee);
}
public Employee updateEmail(int id, String email) {
	// TODO Auto-generated method stub
	Optional<Employee>optional=repo.findById(id);
	
	if(optional.isEmpty())
	{
		return null;
	}
	Employee employee=optional.get();
	employee.setEmail(email);
	return repo.save(employee);
}
public Employee updateSalary(int id, double salary) {
	// TODO Auto-generated method stub
	Optional<Employee>optional=repo.findById(id);
	if(optional.isEmpty())
	{
		return null;
	}
	Employee employee=optional.get();
	employee.setSalary(salary);
	return repo.save(employee);
}


public Employee getEmployeeByPhone(long phone) {
	// TODO Auto-generated method stub
	return repo.findEmployeeByPhone(phone);
}

public Employee findEmployeeByEmail(String email) {
	// TODO Auto-generated method stub
	//return repo.getEmployeeByEmail(email);
	return repo.employeeByEmail(email);
}

//public Employee updateSalary1(int id, double salary) {
//	// TODO Auto-generated method stub
//	Optional<Employee>optional=repo.findById(id);
//	if(optional.isEmpty())
//	{
//		return null;
//	}
//	Employee employee=optional.get();
//	employee.setSalary(salary);
//	return repo.save(employee);
//}

public List<Employee> getByName(String name) {
	// TODO Auto-generated method stub
	return repo.findEmployeeByName(name);
	
}

public List<Employee> getEmployeeBySalaryLessThan(double salary) {
	// TODO Auto-generated method stub
	return repo.findEmployeeBySalaryLessThan(salary);
}

public List<Employee> getEmployeeBySalaryGreaterThan(double salary) {
	// TODO Auto-generated method stub
	return repo.findEmployeeBySalaryGreaterThan(salary);
}

public List<Employee> getEmployeeBySalaryBetween(double salary1, double salary2) {
	// TODO Auto-generated method stub
	return repo.findEmployeeBySalaryBetween(salary1, salary2);
}

 



 

}
