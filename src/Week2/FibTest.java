package Week2;

/*
 * fibonacci sequence formula: f0=0, f1=1, f2=f0+f1, f3=f2+f1
 * The sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 .........
 */
public class FibTest {

	public static void main(String[] args) {
		
		Fib f = new Fib();
		int result = f.fibonacci(2);
		System.out.println(result);
		
		result = f.fibonacci(5);
		System.out.println(result);
		
		result = f.fibonacci(10);
		System.out.println(result);
				
	}

}
