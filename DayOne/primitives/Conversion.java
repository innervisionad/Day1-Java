package primitives;

//EXAMPLE 10: Demonstrate casts

public class Conversion {

	public static void main(String[] args) {
		byte b;
		int i = 257;
		double d = 323.142;
		
		//int cast into byte, result is remainder of the division (257/256 = 1)
		System.out.println("\nConversion of int to byte.");
		b = (byte) i;
		System.out.println("i and b " + i + " " + b);
		
		//double convert to int, fractional component is lost.
		System.out.println("\nConversion of double to int.");
		i = (int) d;
		System.out.println("d and i " + d + " " + i);
		
		//double convert to byte, fractional component is lost, and the value is reduced modulo 256 = 67
		System.out.println("\nConversion of double to byte.");
		b = (byte) d;
		System.out.println("d and b " + d + " " + b);

	}

}
