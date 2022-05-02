package application;

import java.util.Locale;
import java.util.Scanner;

import triangle.Triangle;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle triangle = new Triangle();
		
		System.out.println("Enter the vales for the Triangle:");
		
		triangle.a = sc.nextDouble();
		triangle.b = sc.nextDouble();
		triangle.c = sc.nextDouble();
		
		System.out.println("AREA = " + triangle.area());
		
		sc.close();
	}
}
