package com.google;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateElementsTestDrive {

	public static void main(String[] args) {

		List<String> myList = Arrays.asList("John", "Rob", "Karin", "Maria", "Karin", "Deepak", "Eric", "Leonel", "Deepak");
		myList.stream()
				.filter(str -> Collections.frequency(myList, str) > 1)
				.distinct()
				.forEach(System.out::println);
		
		String str = "Welcome to Java World";
		List<Character> charList = str.toLowerCase().replace(" ", "").chars()
										  			.mapToObj(c -> (char)c)
										  			.collect(Collectors.toList());
		charList.stream()
				.filter(c -> Collections.frequency(charList, c) > 1)
				.distinct()
				.forEach(System.out::println);
	}

}
