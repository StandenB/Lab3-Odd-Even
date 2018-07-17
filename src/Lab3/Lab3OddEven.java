package Lab3;

import java.util.Scanner;

public class Lab3OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scnr = new Scanner(System.in);
			int userInput;
			String cont = "y";
			
			System.out.println("Please enter your name:");
			String userName = scnr.next();
		
			do {			
				System.out.println(userName + " please enter an integer between 1 and 100");
				userInput = scnr.nextInt();
				
				if (userInput % 2 != 0) {
					System.out.println(userInput + " Odd.");
					if (userInput > 60) {
						System.out.println(userInput + " Odd and over 60.");
					}
				}
				else if (userInput < 26) {
					System.out.println("Even and less than 25.");
				}	
				else if (userInput > 60) {
					System.out.println(userInput + " Even.");	
				}
				else {
					System.out.println("Even.");
				}
				
				System.out.print(userName + " do you want to continue? (y/n): ");
				cont = scnr.next();
				System.out.println("");

			} while (cont.equals("y"));
			System.out.println("Bye!");
		
	}
}

