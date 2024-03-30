package com.qsp.springboot_employee.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.qsp.springboot_employee.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{

	Employee findEmployeeByPhone(long phone);
	//Employee getEmployeeByEmail(String email);
	@Query("select e from Employee e where e.email=?1")
	Employee employeeByEmail(String email);
	List<Employee>findEmployeeByName(String name);
	List<Employee>findEmployeeBySalaryLessThan(double salary);
	List<Employee>findEmployeeBySalaryGreaterThan(double salary);
	@Query("select s from Employee s where s.salary between ?1 and ?2")
	List<Employee>findEmployeeBySalaryBetween(double salary1,double salary2);

}
