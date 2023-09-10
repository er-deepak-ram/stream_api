package com.google;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.google.model.User;

public class GroupAndOrderUsersWRTAge {

	public static void main(String[] args) {

		List<User> users = new ArrayList<>(); 
		users.add(new User("Ramesh", 25, "Nagpur"));
		users.add(new User("Suresh", 25, "Pune"));
		users.add(new User("Ganesh", 24, "Mumbai"));
		users.add(new User("Yash", 24, "Gondia"));
		users.add(new User("Ravi", 37, "Bellampalli"));
		users.add(new User("Raju", 34, "Mancherial"));
		users.add(new User("Raj", 36, "Khandesh"));
		users.add(new User("Badal", 37, "Chandrapur"));
		users.add(new User("Arun", 37, "Chandrapur"));
		
		users.stream()
			 .collect(Collectors.groupingBy(u -> u.getAge(), TreeMap::new, Collectors.toList()))
  			 .entrySet()
			 .forEach(e -> System.out.println(e.getKey()+": "+e.getValue()));
	}
}