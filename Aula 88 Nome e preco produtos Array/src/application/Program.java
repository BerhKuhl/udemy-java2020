package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products and prices you will insert: ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i=0;i<vect.length;i++) {
			sc.nextLine();
			System.out.print("Enter the name of product: ");
			String name = sc.nextLine();
			System.out.print("Enter the price of product: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name,price);
		}
		
		double sum = 0.0;
		for (int i=0;i<vect.length;i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum/vect.length;
		System.out.printf("The avarage of prices is: %.2f",avg);
		
		sc.close();
	}

}
