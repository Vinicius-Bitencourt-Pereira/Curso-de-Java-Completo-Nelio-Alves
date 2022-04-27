package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
	// uri1002
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.141559;
		
		double raio = sc.nextDouble();
		double area = pi * (raio * raio);
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();
	}
}
