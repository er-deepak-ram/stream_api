package com.google;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.google.model.Employee;

public class GroupEmployeeWRTDept {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Ramesh", "IT", 27000));
		empList.add(new Employee("Suresh", "ACC", 25000));
		empList.add(new Employee("Ekta", "HR", 30000));
		empList.add(new Employee("Ganesh", "IT", 28000));
		empList.add(new Employee("Dev", "IT", 26000));
		empList.add(new Employee("Poonam", "HR", 30000));
		empList.add(new Employee("Ravi", "ACC", 29000));
		
		empList.stream()
 			   .collect(Collectors.groupingBy(e -> e.getDepartment()))
 			   .entrySet()
			   .forEach(e -> System.out.println(e.getKey()+": "+e.getValue()));
	}
}
