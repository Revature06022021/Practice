package Week1;

import java.util.Scanner;

/*nextBoolean()	Reads a boolean value from the user
nextByte()	Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	Reads a float value from the user
nextInt()	Reads a int value from the user
nextLine()	Reads a String value from the user
nextLong()	Reads a long value from the user
nextShort()	Reads a short value from the user*/
public class UserInputs {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please type in a line and hit Enter.");

		String line = input.nextLine();
		System.out.println("You have typed: " + line);
		
		// using the three String methods
		System.out.println("The index of the letter from the input is: " + line.indexOf("e"));
		System.out.println("The letter at the index 1 from the input is: " + line.charAt(0));
		System.out.println("Return true if the input equals to the given value, otherwise return false: " + line.equals("Revature"));
		

		input.close();

		String numbers = "1 2 3 5 7 9";

		input = new Scanner(numbers); // create a new object instance with assigned values

		while (input.hasNextInt()) { // .hasNext is the same for this case
			System.out.println(input.nextInt()); // .next is the same result
		}

		input.close();
	}
}
