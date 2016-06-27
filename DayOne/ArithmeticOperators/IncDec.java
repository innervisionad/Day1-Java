package ArithmeticOperators;

//EXAMPLE 4: Demonstrate Increment (++) and Decrement (--) Operators
	
//Increase or Decrease by 1

public class IncDec {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c;
		int d;
		
		c = ++b; //previous value is obtained and then the operand is modified
		d = a++; //value a is obtained before the increment operator is executed
		//d = 1, a = 2
		
		c++;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);

	}

}
