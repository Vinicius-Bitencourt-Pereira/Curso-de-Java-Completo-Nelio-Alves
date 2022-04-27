package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
	// uri1003
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = x + y;
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}
}
