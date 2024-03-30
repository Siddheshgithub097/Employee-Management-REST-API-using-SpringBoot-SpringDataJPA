package com.qsp.springboot_employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.springboot_employee.dao.EmployeeDao;
import com.qsp.springboot_employee.dto.Employee;

import net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName;

@Service
public class EmployeeService
{
	@Autowired
	 private EmployeeDao dao;
	  public Employee saveEmployee(Employee employee)
	   {
		  double sal=employee.getSalary();
		  if(sal<=10000)
		  {
			  employee.setGrade('D');
		  }
		  else if(sal>10000 && sal<=20000)
		  {
			  employee.setGrade('C');
		  }
		  else if(sal>20000 && sal<=35000)
		  {
			  employee.setGrade('B');
		  }
		  else {
			employee.setGrade('A');
		}
		  return dao.saveEmployee(employee);
		   
	   }
	public Employee findEmployee(int id) {
		return dao.findEmployee(id);
	}
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllEmployee();
	}
	public Employee deleteEmployee(int id)
	{
		return dao.deleteEmployee(id);
	}
	public Employee updateEmployee(int id, Employee employee)
	{
		double sal=employee.getSalary();
		if(sal<10000)
		{
			employee.setGrade('D');
		}
		else if(sal>10000 && sal<=20000)
		{
			employee.setGrade('C');
		}
		else if(sal>20000 && sal<=35000)
		{
			employee.setGrade('B');
		}
		else {
			employee.setGrade('A');
		}
		return dao.updateEmployee(id, employee);
	}
	public Employee updatePhone(int id, long phone) 
	{
		return dao.updatePhone(id, phone);
	}
	public Employee updateName(int id, String name)
	{
		return dao.updateName(id, name);
	}
	public Employee updateSalary(int id, double salary)
	{
		
		return dao.updateSalary(id, salary);
	}
	public Employee getEmployeeByPhone(long phone)
	{
		return dao.getEmployeeByPhone(phone);
	}
	public Employee findEmployeeByEmail(String email) 
	{
		return dao.findEmployeeByEmail(email);
	}
	
	public List<Employee> getByName(String name) 
	{
		return dao.getByName(name);
	}
	public List<Employee> getEmployeeBySalaryLessThan(double salary)
	{
	  return dao.getEmployeeBySalaryLessThan(salary);
	}
	public List<Employee> getEmployeeBySalaryGreaterThan(double salary)
	{
		return dao.getEmployeeBySalaryGreaterThan(salary);
	}
	public List<Employee> getEmployeeBySalaryBetween(double salary1, double salary2)
	{
		return dao.getEmployeeBySalaryBetween(salary1, salary2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
