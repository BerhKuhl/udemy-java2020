package modulo1;

import java.util.Scanner;

public class _59 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,higher;
		System.out.print("D�gite um numero: ");
		a = sc.nextInt();
		System.out.print("D�gite outro numero: ");
		b = sc.nextInt();
		System.out.print("D�gite outro numero: ");
		c = sc.nextInt();
		
		higher=max(a,b,c);
		
		showResult(higher);
	 	
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Maior: "+value);
	}

}
