package primitives;

//EXAMPLE 6: Literals

public class LiteralsExample {

	public static void main(String[] args) {
		
		//INTEGER LITERALS
		
		//for long literals, you requires to explicity append upper or lower-case L.
		long l = 9223372036854775807L;
		System.out.println(l);
		
		//specify integer literal using binary
		int x = 0b1010;
		System.out.println(x);
		
		//embed one or more underscores in an integer literal, easier to read
		int x1 = 123_456_789;
		int x2 = 123___456___789;
		int x3 = 0b1101_0101_0001_1010;
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		
		//FLOATING-POINT LITERALS
		
		//default to (double) if wants to use float must append F
		
		//hexadecimal floating-point. P is called "binary exponent" indicates the power-of-two
		//by which number is multiplied.
		double num = 0x12.2P2;
		System.out.println(num);
		
		double num1 = 9_423_497_862.0;
		double num2 = 9_423_497.1_0_9;
		System.out.println(num1);
		System.out.println(num2);
		
		
		
		
	}

}
