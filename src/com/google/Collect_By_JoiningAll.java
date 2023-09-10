package com.google;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.google.model.User;

public class Collect_By_JoiningAll {

	public static void main(String[] args) {

		List<User> users = Arrays.asList( 
				new User("Ramesh", 25, "Nagpur"),
				new User("Suresh", 26, "Pune"),
				new User("Ganesh", 21, "Mumbai"),
				new User("Yash", 24, "Gondia"),
				new User("Ravi", 35, "Bellampalli"),
				new User("Raju", 34, "Mancherial"));
		
		String names = users.stream()
							.map(u -> u.getName())
							.map(str -> str.toUpperCase())
							.collect(Collectors.joining(", "));
		System.out.println(names);
	}

}
