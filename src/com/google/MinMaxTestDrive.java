package com.google;

import java.util.ArrayList;
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
		
		Product productA = productsList.stream()
									   .max((p1, p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1)
									   .get();
		System.out.println(productA);
		
		Product productB = productsList.stream()
									   .min((p1, p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1)
									   .get();
		System.out.println(productB);
	}
}