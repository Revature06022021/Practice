package Week2;

public class Constructor {
	
	String firstName;
	String lastName;
	
	Constructor c;
	public static String getting = "Hello";
	
	public Constructor(){
		this.firstName = "James";
		this.lastName = "Brown";
	}
	
	public Constructor(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		
		
	}
	
	public static void change(Constructor c) {
		c.firstName = "Tony";
		c.lastName = "Williams";
		System.out.println(c.firstName + " " + c.lastName);
	}


	public static void main(String[] args) {
		
		Constructor c = new Constructor();
		System.out.println(c.firstName + " " + c.lastName);
		
		Constructor c1 = new Constructor("Marry", "Smith");
		System.out.println(c1.firstName + " " + c1.lastName );
		
		Constructor.change(c);
		
		System.out.println(getting.charAt(1));
		System.out.println(getting.compareTo("Hello"));
		System.out.println(getting.toUpperCase().charAt(3));
		System.out.println(getting.toLowerCase());
	    System.out.println(getting.indexOf('o'));
	    
	    Integer in = 52243;
	    System.out.println(in.toString().length()); // in is a string with 5 length
	                                                // toString using for wrap types

	}

}
