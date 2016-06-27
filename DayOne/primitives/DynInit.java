package primitives;

//EXAMPLE 7: Dynamic Variable Initialisation

//Scope of variable is based on a block { }
// - determines what objects are visible to other parts of your program and the lifetime of those objects

//general rule: variable declared inside a scope are not visible to code that is defined outside that scope.

public class DynInit {

	public static void main(String[] args) {
		
		double a = 3.0, b = 4.0;
		// c is dynamically initialized
		double c = Math.sqrt(a * a + b * b);
		System.out.println("Hypotenuse is " + c);

	}

}
