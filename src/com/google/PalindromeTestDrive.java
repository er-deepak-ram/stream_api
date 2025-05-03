package com.google;

import java.util.stream.IntStream;

public class PalindromeTestDrive {

	public static void main(String[] args) {
		String str = "Madam";
		System.out.println(str + " is Palindrome: " + isPalindromeWithStream(str));
	}

	public static boolean isPalindromeWithStream(String input) {
		String str = input.replace(" ", "").toLowerCase();
		return IntStream.range(0, str.length() / 2)
				.allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
	}
	
	public static boolean isPalindromeWithoutStream(String input) {
		String str = input.replace(" ", "").toLowerCase();
		int left = 0, right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
