import java.util.Scanner;

public class Exercise06_37 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		// Prompt the user to enter a number and its width
		System.out.print("Enter a number and its width: ");
		int number = input.nextInt();
		int width = input.nextInt();

		// Display a string of formatted number
		System.out.println(
			number + " formatted to width " + width + ": " + format(number, width));
		
		input.close();
		
	}

	public static String format(int number, int width) {
		String num = number + ""; // String representation for the number
		
		
		if (num.length() < width) {
			for (int i = width - num.length(); i > 0; i--) {
				num = 0 + num;
			}
		}
		return num;
	}
}