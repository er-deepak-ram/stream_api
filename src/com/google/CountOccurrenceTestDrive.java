package com.google;

public class CountOccurrenceTestDrive {

	public static void main(String[] args) {

		String str = "Oppenheimer";
		char ch = 'e';
		long count = str.chars()
						.filter(c -> c == ch)
						.count();
		System.out.println("e appeared " + count + " times in " + str);
	}

}
