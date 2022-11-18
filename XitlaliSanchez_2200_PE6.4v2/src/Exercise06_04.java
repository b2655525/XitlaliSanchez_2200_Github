/*********
 * 
 * @author Xitlali Sanchez
 * Date: 11/18/2022 [F]
 *
 */

import java.util.Scanner;

public class Exercise06_04 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		// Prompt user to enter an integer
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		// Display the reversal
		reverse(number);
		
		input.close();
	}

	public static void reverse(int number) {
		
		if (number == 0) {
			System.out.print(number);
		}
		
		if (number < 0) {
			System.out.print("-");
			number = (-1) * number;
		}
		
		while (number != 0) {
			System.out.print(number % 10);
			number = number /10;
		}
		
	}
}