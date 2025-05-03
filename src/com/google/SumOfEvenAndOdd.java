package com.google;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		sum of even numbers
		int sumOfEvenNumbers = numbers.stream()
									.filter(num -> num % 2 == 0)
									.mapToInt(Integer::intValue)
									.sum();
		System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
		
//		sum of odd numbers
		int sumOfOddNumbers = numbers.stream()
									.filter(num -> num % 2 != 0)
									.mapToInt(Integer::intValue)
									.sum();
		System.out.println("Sum of odd numbers: " + sumOfOddNumbers);
	}

}
