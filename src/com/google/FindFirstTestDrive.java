package com.google;

import java.util.Arrays;
import java.util.List;

public class FindFirstTestDrive {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1,3,5,7,9,11,13,15,17,19,21,23,25,24,22,20,18,16,14,12,10,8,6,4,2);
		
		int f1 = intList.stream()
							.findFirst()
							.orElse(0);
		System.out.println(f1);
		
		int f2 = intList.stream()
						.reduce((first, second) -> first)
						.orElse(0);
		System.out.println(f2);
	}

}
