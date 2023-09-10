package com.google;

import java.util.stream.IntStream;

public class VowelsWithIndexTestDrive {

	public static void main(String[] args) {

		String str = "summer vacation";
		System.out.println("Vowels in string \'"+str+"\'");
		IntStream.range(0, str.length())
				.mapToObj(i -> str.charAt(i) + " at index " + i)
				.filter(s -> str.startsWith("a") || s.startsWith("e") || 
						s.startsWith("i") || s.startsWith("o") ||
						s.startsWith("u"))
				.forEach(System.out::println);
	}

}
