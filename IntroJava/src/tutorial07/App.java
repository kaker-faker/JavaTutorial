package tutorial07;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt and receive user input
		//System.out.println("Enter a line of text: ");
		//String line = input.nextLine();
		
		//output user inputM
		//System.out.println("You entered: " + line);
		
		System.out.println("Enter a digit: ");
		int value = input.nextInt();
		System.out.println("You entered: " + value);
		input.close();
	}

}
