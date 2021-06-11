package Week1;

public class Casting {

	public static void main(String[] args) {
		
		// initialize the integer value
		int num = 200;
		
		// Downcasting since the size of integer is 4 bytes and short is 2 bytes
		short s = (short)num;
		System.out.println(s);
		
		// Upcasting since the size of double is 8 bytes
		double d = (double)num;
		System.out.println(d);
		
		// Downcasting since the size of byte is 1 byte
		byte b = (byte)num;
		System.out.println(b);
		
		/*
		 * Casting integer to byte that the value -56 is printed to the console .
		 * 
		 * How did this happen?
		 * 
		 * In order to understand this, we need to think back to how Java interprets
		 * numbers using bits. An integer is a 32-bit binary number; meaning we have 32
		 * bits each representing a power of 2.
		 * 
		 * So, the number 200 as a 32-bit binary number is represented as:
		 * 
		 * 0000 0000 0000 0000 0000 0000 1100 1000.
		 * 
		 * When we convert this number to a byte (which is an 8-bit type), we must
		 * truncate the extra bits. This leaves us with:
		 * 
		 * 1100 1000.
		 * 
		 * A byte follows two’s complement numbering system, thus the leading 1
		 * indicates a negative number. To find out what number this is we must find the
		 * two’s complement by inverting the bits and adding 1 to the number.
		 * 
		 * Inverting the bits gives us:
		 * 
		 * 0011 0111.
		 * 
		 * Adding one gives us:
		 * 
		 * 0011 1000.
		 * 
		 * This value represents (32 + 16 + 8 or 56). Thus, our number 1100 1000
		 * represents -56.
		 */

	}

}
