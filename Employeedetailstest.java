package com.junit.employeefactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junittesting.Employee;
import com.junittesting.salaryHike;

class Employeedetailstest {
	Employee employee=new Employee();
	Employee employee1=new Employee();
	salaryHike hike= new salaryHike();
	

	@Test
public	void testSalaryHike() {

employee.setName("Roger");
employee.setRole("Manager");
employee.setSalary(50000);
double Hike=hike.Salary(50000);
assertEquals(55000,Hike);
	}
	{
employee1.setName("Joe");
employee1.setRole("HR");
employee1.setSalary(40000);
double Hike=hike.Salary(40000);
assertEquals(44000,Hike);
	}
	
	
}
