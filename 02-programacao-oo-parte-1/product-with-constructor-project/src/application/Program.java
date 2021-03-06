package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		double price;
		int quantity;
				
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		name = sc.nextLine();
		
		System.out.print("Price: ");
		price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int newQuantity = sc.nextInt();
		product.addProducts(newQuantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		newQuantity = sc.nextInt();
		product.removeProducts(newQuantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}
}