package com.google;

import java.util.stream.Stream;

public class ArmstrongTestDrive {

	public static void main(String[] args) {
		int num = 153;
		System.out.println(num +" is Armstrong: "+isArmstrongByStream(num));
	}

	public static boolean isArmstrongByStream(int number) {
		String numStr = String.valueOf(number);
		int numDigits = numStr.length();
		
		int sum = Stream.of(numStr.split(""))
					.mapToInt(c -> Integer.parseInt(c))
					.map(d -> (int) Math.pow(d, numDigits))
					.sum();
		return sum == number;
	}
	
	public static boolean isArmstrongWithoutStream(int num) {
		int originalNum = num;
		int numDigits = String.valueOf(num).length();
		int sum = 0;
		
		while (num > 0) {
			int d = num % 10;
			sum += Math.pow(d, numDigits);
			num = num / 10;
		}
		
		return sum == originalNum;
	}
}
