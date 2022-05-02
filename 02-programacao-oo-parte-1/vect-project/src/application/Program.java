package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int x = 0; x < vect.length; x++) {
			vect[x] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for (int x = 0; x < vect.length; x++) {
			sum += vect[x];
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE HEIGTH: %.2f", avg);
		
		sc.close();
	}
}
