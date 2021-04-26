import java.util.Scanner;

public class JavaExercise5 {

	public static void main(String[] args) {
		
		/* 		Write a Java program which reads two integers from the user and prints the sum and difference both in their own line. 
		 * 
		 * Example
		 * Enter first number: 7
		 * Enter second number: 6
		 * Sum: 13
		 * Difference: 1
		 * */

		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a first integer ");
		int value1 = input.nextInt();
		
		System.out.println("Enter a second integer ");
		int value2 = input.nextInt();
		
		int add = value1 + value2;
		int sub = value1 - value2;
		
		System.out.println("Sum of your input is " + add);
		System.out.println("Difference of your input is " + sub );
		
	}

}
