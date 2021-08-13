package application;

import java.util.Locale;
import java.util.Scanner;

import entities.service.PrintService;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		PrintService<Integer> service = new PrintService<>();

		System.out.print("How many values? ");
		int limit = sc.nextInt();

		for (int i = 0; i < limit; i++) {
			service.addValue(sc.nextInt());
			sc.nextLine();
		}

		service.print();
		System.out.println("\nFirst: " + service.first());

		sc.close();
	}
}
