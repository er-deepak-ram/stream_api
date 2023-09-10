package com.google;

import java.util.Arrays;
import java.util.List;

import com.google.model.Employee;

public class SummaryStatisticsTestDrive {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
					new Employee("Ramesh", "IT", 27000),
					new Employee("Suresh", "ACC", 25000),
					new Employee("Ekta", "HR", 30000),
					new Employee("Ganesh", "IT", 28000),
					new Employee("Dev", "IT", 26000),
					new Employee("Poonam", "HR", 30000),
					new Employee("Ravi", "ACC", 29000));
		
		long totalSalary = empList.stream()
								  .mapToInt(e -> (int)e.getSalary())
								  .summaryStatistics()
								  .getSum();
		System.out.println("Sum of salaries of all employees: "+totalSalary);
		
		double averageSalary = empList.stream()
									  .mapToInt(e -> (int)e.getSalary())
									  .summaryStatistics()
									  .getAverage();
		System.out.println("Average salary of employee: "+averageSalary);
		
		long highestSalary = empList.stream()
									.mapToInt(e -> (int)e.getSalary())
									.summaryStatistics()
									.getMax();
		System.out.println("Highest salary: "+highestSalary);
		
		long lowestSalary = empList.stream()
								   .mapToInt(e -> (int)e.getSalary())
								   .summaryStatistics()
								   .getMin();
		System.out.println("Lowest Salary: "+lowestSalary);
	}
}
