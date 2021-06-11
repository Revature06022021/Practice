package Week1;

public class Methods {

	public static void main(String[] args) {

		Methods m = new Methods();

		// call your method here
		double d = m.convertIntToDouble(44);

		// print the value to the console
		System.out.println(d);

		// call the 2nd method here
		System.out.println(m.sum(1.0, 2, 3));

		// this call method could get any return type
		System.out.println(m.multiplication(4.0));

		// call the boolean method and print the return value here
		System.out.println(m.returnBoolean());

		// call the void method
		m.noReturn();
	}

	// return a boolean value
	private boolean returnBoolean() {
		return true;

	}

	// return nothing if the method sets to void
	private void noReturn() {
		System.out.println("Void method does not have return type");

	}

	// return a integer value
	private int multiplication(double w) {
		return (int) (w * w);
	}

	// create your first method here
	public double convertIntToDouble(int num) {
		return (double) num;
	}

	// new sum method here
	public double sum(double num1, int num2, int num3) {
		return num1 + num2 + num3;

	}

}
