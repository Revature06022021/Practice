package Week1;

public class PrimitiveDataType {

	public static void main(String[] args) {
		
		// there are 8 primitives data type
		
		// four data types are returned integer values
		byte b = 1; // 1 byte in size
		System.out.println(b);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		short s = 2; // 2 bytes in size
		System.out.println(s);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		long l = 8888888888L; // 8 bytes in size
		System.out.println(l);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		int i = 4; // 4 bytes in size
		System.out.println(i);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);


		// data type char returns a single letter
		char c = 'a'; // 2 bytes in size
		char c1 = 65;  // will print upper case A
		System.out.println(c);
		System.out.println(c1);
		
		// data type double and float will return decimal values
		double d = 8; // 8 bytes in size
		System.out.println(d); // will print decimal 8.0
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		float f = 4.0f; // 4 bytes in size  
		System.out.println(f); // if with decimals should put f at the end
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		// data type boolean returns true or false
		boolean on = true; // 1 bit in size, where 1 byte = 8 bits
		System.out.println(on);
		
	}

}
