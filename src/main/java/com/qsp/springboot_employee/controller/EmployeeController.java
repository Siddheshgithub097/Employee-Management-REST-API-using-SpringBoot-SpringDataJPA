package com.qsp.springboot_employee.controller;

import java.util.List;

import javax.annotation.processing.SupportedAnnotationTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.springboot_employee.dao.EmployeeDao;
import com.qsp.springboot_employee.dto.Employee;
import com.qsp.springboot_employee.service.EmployeeService;

@RestController
public class EmployeeController 
{
	@Autowired
   private EmployeeDao dao;
	@Autowired
	private EmployeeService service;
	@PostMapping("/save")
	 public Employee saveEmployee( @RequestBody Employee employee)
	 {
		return dao.saveEmployee(employee);
		
	 }
	@GetMapping("/find")
	public Employee findEmployee(@RequestParam int id)
	{
		return service.findEmployee(id);
	}
	@GetMapping("/findAll")
	public List<Employee> getAllEmployee()
	{
		return service.getAllEmployee();
	}
	@DeleteMapping("/delete/{id}")
	public Employee deletEmployee(@PathVariable int id)
	{
		return service.deleteEmployee(id);
	}
	@PutMapping("/update")
	public Employee updateEmployee(@RequestParam int id,@RequestBody Employee employee)
	{
		return service.updateEmployee(id,employee);
	}
	@PatchMapping("/updatePhone")
	public Employee updatePhone(@RequestParam int id,@RequestParam long phone)
	{
		return service.updatePhone(id,phone);
	}
	@PatchMapping("updateName")
	public Employee updateName(@RequestParam int id,@RequestParam String name)
	{
		return service.updateName(id,name);
	}
	@PatchMapping("updateEmail")
	public Employee updateEmail(@RequestParam int id,@RequestParam String email)
	{
		return service.updateName(id,email);
	}
	@PatchMapping("/updateSalary/{id}/{salary}")
	public Employee updateSalary(@PathVariable int id,@PathVariable double salary)
	{
		return service.updateSalary(id,salary);
	}
	@GetMapping("/findByPhone")
	public Employee getEmployeeByPhone(@RequestParam long phone)
	{
		return service.getEmployeeByPhone(phone);
	}
	@GetMapping("/findByEmail/{email}")
	public Employee findEmployeeByEmail(@PathVariable String email)
	{
		return service.findEmployeeByEmail(email);
	}
//	@PatchMapping("/updateSalary1/{id}/{salary}")
//	public Employee updateSalary1(@PathVariable int id,@PathVariable double salary)
//	{
//		return service.updateSalary1(id,salary);
//	}
	@GetMapping("/findName")
	public List<Employee> getByName(@RequestParam String name)
	{
		return service.getByName(name);
	}
	@GetMapping("/findLessThan")
	public List<Employee> getEmployeeBySalaryLessThan(@RequestParam double salary)
	{
		return service.getEmployeeBySalaryLessThan(salary);
	}
	@GetMapping("/findGreaterThan")
	public List<Employee> getEmployeeBySalaryGreaterThan(@RequestParam double salary)
	{
		return service.getEmployeeBySalaryGreaterThan(salary);
	}
	@GetMapping("/findBetween")
	public List<Employee> getEmployeeBySalaryBetween(@RequestParam double salary1,@RequestParam double  salary2)
	{
		return service.getEmployeeBySalaryBetween(salary1,salary2);
	}

	
	
   
}
