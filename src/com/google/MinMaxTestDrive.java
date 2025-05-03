package com.google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.model.Product;

public class MinMaxTestDrive {

	public static void main(String[] args) {
	
		List<Product> productsList = new ArrayList<>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenovo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		
		List<Integer> nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
		
		Product productA = productsList.stream()
									   .max((p1, p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1)
									   .get();
		System.out.println(productA);
		
		Product productB = productsList.stream()
									   .min((p1, p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1)
									   .get();
		System.out.println(productB);
		
		Integer max_value = nums.stream()
								.max(Integer::compare)
								.orElse(null);
		Integer min_value = nums.stream()
								.min(Integer::compare)
								.orElse(null);
		System.out.println("Max value in int list: " + max_value);
		System.out.println("Min value in int list: " + min_value);
	}
}