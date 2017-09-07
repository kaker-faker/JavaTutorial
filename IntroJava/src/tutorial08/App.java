package tutorial08;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.println("enter a number: ");
		int value = scanner.nextInt();
		while (value != 5) {
			System.out.println("Enter another number: ");
			value = scanner.nextInt();
		}
		*/
		int value;
		do {
			System.out.println("enter a number: ");
			value = scanner.nextInt();			
		}
		while (value != 5);
		System.out.println("Got 5!");
		scanner.close();
	}
}
