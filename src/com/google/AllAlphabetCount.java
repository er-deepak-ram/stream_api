package com.google;

import java.util.stream.Collectors;

public class AllAlphabetCount {

	public static void main(String[] args) {

	String str = "Deepak";
			
	str.chars()
		.mapToObj(c -> (char)c)
		.collect(Collectors.groupingBy(c -> c, Collectors.counting()))
		.entrySet()
		.forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
	}
}
/* Output:
 * p : 1
 * a : 1
 * D : 1
 * e : 2
 * k : 1
 * */