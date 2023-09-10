package com.google;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.google.model.User;

public class NaturalSortOrdering {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>(); 
		users.add(new User("Ramesh", 25, "Nagpur"));
		users.add(new User("Suresh", 26, "Pune"));
		users.add(new User("Ganesh", 21, "Mumbai"));
		users.add(new User("Yash", 24, "Gondia"));
		users.add(new User("Ravi", 35, "Bellampalli"));
		users.add(new User("Raju", 34, "Mancherial"));
		
		List<User> ascOrdList = users.stream()
									 .sorted(Comparator.comparingInt(User::getAge))
									 .collect(Collectors.toList());
		ascOrdList.forEach(System.out::println);
		
		List<User> descOrdList = users.stream()
									  .sorted((u1, u2) -> u2.getAge() - u1.getAge())
									  .collect(Collectors.toList());
		descOrdList.forEach(System.out::println);
		
		List<User> orderedNameList = users.stream()
										  .sorted(Comparator.comparing(User::getName))
										  .collect(Collectors.toList());
		orderedNameList.forEach(System.out::println);
		
	}

}
