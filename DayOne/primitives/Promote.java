package primitives;

//EXAMPLE 11: 

public class Promote {

	public static void main(String[] args) {
		
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;
		
		/*
		 * f * b - b is promoted to float
		 * i / c - c is promoted to int
		 * d * s - s is promoted to double
		 * 
		 * result - float plus in is float, float minus double is double, thus double
		 */
		double result = (f * b) + (i / c) - (d * s);
		
		System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
		System.out.println("result = " + result);

	}

}
