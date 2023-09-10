package com.google;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Changing_the_Map_ValueType {

	static class Employee {
		private int empId;
		private String firstName;
		private String lastName;
		private String department;
		private int salary;
		
		Employee(int empId, String firstName, String lastName, String department, int salary) {
			this.empId = empId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.department = department;
			this.salary = salary;
		}

		public int getEmpId() {
			return empId;
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public String getDepartment() {
			return department;
		}

		public int getSalary() {
			return salary;
		}
	}
	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(new Employee(101, "Ramesh", "Kumar", "IT", 27000),
												new Employee(102, "Suresh", "Sharma", "ACC", 25000),
												new Employee(103, "Ekta", "Waghmare", "HR", 30000),
												new Employee(104, "Ganesh", "Sharma", "IT", 28000),
												new Employee(105, "Dev", "Gupta", "IT", 26000),
												new Employee(106, "Poonam", "Verma", "IT", 30000),
												new Employee(104, "Ravi", "Verma", "IT", 29000)); 
		empList.stream()
				.filter(e -> e.getDepartment().equalsIgnoreCase("IT"))
				.collect(Collectors.groupingBy(emp -> emp.getLastName(), 
													Collectors.mapping(emp -> emp.getFirstName()+" "+emp.getLastName(), Collectors.toList())))
				.entrySet()
				.forEach(e -> System.out.println(e.getKey()+": "+e.getValue()));
	}
}
