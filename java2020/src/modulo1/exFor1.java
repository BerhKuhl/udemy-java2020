package modulo1;

import java.util.Scanner;

public class exFor1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		System.out.print("D�gite um n�mero entre 1 e 1000: ");
		x = sc.nextInt();

		if(1 <= x && x <= 1000) {
			for (int i = 1; i < x; i++) {
				if(i % 2 != 0) {
					System.out.println("\nN�meros impares at� o n�mero d�gitado: "+i);
				}

			}
		}else {
			System.out.println("N�mero inv�lido");
		}
		
		sc.close();
	}

}
