package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
	// uri1010
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		 int codigo1 = sc.nextInt();
		 int quantidade1 = sc.nextInt();
		 double preco1 = sc.nextDouble();
		    
		 int codigo2 = sc.nextInt();
		 int quantidade2 = sc.nextInt();
		 double preco2 = sc.nextDouble();

		 double total = preco1 * quantidade1 + preco2 * quantidade2;

		 System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}
}
