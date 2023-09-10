package com.google;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.google.model.User;

public class SliceOfStream {

	public static void main(String[] args) {

		List<User> users = Arrays.asList( 
						new User("Ramesh", 25, "Nagpur"),
						new User("Suresh", 26, "Pune"),
						new User("Ganesh", 21, "Mumbai"),
						new User("Yash", 24, "Gondia"),
						new User("Ravi", 35, "Bellampalli"),
						new User("Raju", 34, "Mancherial"));
		
//		Use case: Find 2nd and 3rd youngest
		users.stream()
			 .sorted(Comparator.comparingInt(User::getAge))
			 .skip(1)
			 .limit(2)
			 .forEach(System.out::println);
		
	}

}
