package ArithmeticOperators;

//EXAMPLE 3: Demonstrate serveral assignment operators

//Compound Assignment Operators
public class OpEquals {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		a =+ 1; //one did not add to a
		a += 5; //a = a + 5 : 6
		
		b *= 4; //b = b * 4 : 8
		System.out.println(c += a * b);
		c %= 6;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

	}

}
