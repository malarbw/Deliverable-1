import java.util.Scanner; 

public class Integers {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); //allows for user input
		
		System.out.println("Enter first number "); //establish prompt for user input
		int num1 = input.nextInt();
		System.out.println("Enter second number ");
		int num2 = input.nextInt();
		
		int length = String.valueOf(num1).length(); //used this to deterimine number of digits that the user inputs
		
		while (String.valueOf(num2).length() != (String.valueOf(num1).length())) { //while loop  ensures the numbers are of equal length for the task to work properly
			
			System.out.print("Length of second number must = length of first number. Please try again."); 
			num2 = input.nextInt();
			
		}
		//convert string back to integer for calculations
		String num1str = Integer.toString(num1);
		String num2str = Integer.toString(num2);
		int colSum = 0;
		
		
		for (int i = 0; i < length; ++i) {
			int currentSum = 0;
			if (i == 0) { //establishes reference point to compare other sums against
				colSum = Character.getNumericValue(num1str.charAt(i)) + Character.getNumericValue(num2str.charAt(i));
			}
			currentSum = Character.getNumericValue(num1str.charAt(i)) + Character.getNumericValue(num2str.charAt(i));
			if (currentSum != colSum) {
				System.out.print("False."); //if system finds the sums are not equal output will be false
				break;
			} 
			else if(i == (length - 1) && currentSum == colSum) {
				System.out.print("True."); //if system finds sums are equal output will be true

			}
			
		}
		
	}
}
