package modulo1;

import java.util.Scanner;

public class exFor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N;
		int in = 0;
		int out = 0;
		System.out.println("Este programa classificar� os numeros d�gitados em IN \npara os valores dentro do intervalo [10,20] e OUT para \nos que n�o estiverem no intervalo\n");
		System.out.print("D�gite a quantidade de vezes que deseja classificar os \nnumeros digitados futuramente: ");
		N=sc.nextInt();

		for (int i = 0; i < N; i++) {
			int x;
			System.out.print("\nD�gite um numero para ser classificado: ");
			x=sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			} else {
				out = out + 1;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();
	}

}
