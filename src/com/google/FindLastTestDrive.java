package com.google;

import java.util.Arrays;
import java.util.List;

public class FindLastTestDrive {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1,3,5,7,9,11,13,15,17,19,21,23,25,24,22,20,18,16,14,12,10,8,6,4,2);
		
		int l1 = intList.stream()
						.skip(intList.size()-1)
						.findFirst()
						.orElse(0);
		System.out.println(l1);
		
		int l2 = intList.stream()
						.reduce((first, last) -> last)
						.orElse(0);
		System.out.println(l2);
	}

}
