package ControlStatements;

public class JumpStatements {

	public static void main(String[] args) {
		//ContinueLabel();
		Break();
	}
	
	//using break; to exit a loop
	static void BreakLoop()
	{
		
		//break For
		for(int i=0; i<100; i++) {
			if(i == 10) break; // terminate loop if i is 10
				System.out.println("i: " + i);
			}
			System.out.println("For Loop complete.");
		
		//Break While
		int j = 0;
		while(j < 100) {
			if(j == 10) break; // terminate loop if i is 10
				System.out.println("i: " + j);
				j++;
			}
		System.out.println("While Loop complete.");
		
		//Break nested
		for(int a=0; a<3; a++) {
			System.out.print("Pass " + a + ": ");
			for(int b=0; b<100; b++) {
				if(b == 10) break; // terminate loop if j is 10
					System.out.print(b + " ");
				}
				System.out.println();
			}
			System.out.println("Nested Loops complete.");
	}
	
	//Using break; as a form of Goto
	static void Break()
	{
		boolean t = true;
		first: {
			second: {
				third: {
					System.out.println("Before the break.");
					if(t) break second; // break out of second block
						System.out.println("This won't execute");
				}
				System.out.println("This won't execute");
			}
			System.out.println("This is after second block.");
		}
		
		outer: for(int i=0; i<3; i++) {
			System.out.print("Pass " + i + ": ");	
			for(int j=0; j<100; j++) {
				if(j == 10) break outer; // exit both loops
					System.out.print(j + " ");
				}
				System.out.println("This will not print");
			}
			System.out.println("Loops complete.");
	}
	
	static void BreakErr()
	{
		one: for(int i=0; i<3; i++) {
			System.out.print("Pass " + i + ": ");
			}
			for(int j=0; j<100; j++) {
				if(j == 10) break one; // WRONG
				System.out.print(j + " ");
			}
	}
	
	
	//Using Continue
	static void Continue()
	{
		for(int i=0; i<10; i++) {
			System.out.print(i + " ");
			if (i%2 == 0) continue;
			System.out.println("");
		}
		
	}
	
	static void ContinueLabel()
	{
		outer: for (int i=0; i<10; i++) {
					for(int j=0; j<10; j++) {
						if(j > i) {
							System.out.println();
							continue outer;
						}
						System.out.print(" " + (i * j));
					}
				}
			System.out.println();
	
	}
	
	//return
	

}
