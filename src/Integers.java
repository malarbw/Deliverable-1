import java.util.Scanner;

public class Integers {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number ");
		int num1 = input.nextInt();
		System.out.println("Enter second number ");
		int num2 = input.nextInt();
		
		int length = String.valueOf(num1).length();
		
		while (String.valueOf(num2).length() != (String.valueOf(num1).length())) {
			
			System.out.print("Length of second number must = length of first number. Please try again.");
			num2 = input.nextInt();
			
		}
		
		String num1str = Integer.toString(num1);
		String num2str = Integer.toString(num2);
		int colSum = 0;
		
		
		for (int i = 0; i < length; ++i) {
			int currentSum = 0;
			if (i == 0) { 
				colSum = Character.getNumericValue(num1str.charAt(i)) + Character.getNumericValue(num2str.charAt(i));
			}
			currentSum = Character.getNumericValue(num1str.charAt(i)) + Character.getNumericValue(num2str.charAt(i));
			if (currentSum != colSum) {
				System.out.print("False.");
				break;
			} 
			else if(i == (length - 1) && currentSum == colSum) {
				System.out.print("True.");

			}
			
		}
		
	}
}
