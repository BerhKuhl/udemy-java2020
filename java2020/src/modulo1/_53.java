package modulo1;

import java.util.Locale;
import java.util.Scanner;

public class _53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double F,C;
		char resp;
		
		do {
			System.out.print("D�gite a temperatura em Celsius: ");
			C = sc.nextDouble();
			F = (9*C)/5 + 32;
			System.out.printf("Equilavente em Fahrenheit: %.1f",F);
			System.out.print("\nDeseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while(resp != 'n');
			
		sc.close();
	}

}
