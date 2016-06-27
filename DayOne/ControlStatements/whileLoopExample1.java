package ControlStatements;

public class whileLoopExample1 {

	public static void main(String[] args) {
		WhileLoop();
	}
	
	static void WhileLoop()
    {
        System.out.println("Starting to count (while loop).");

        int counter = 0;
        while (counter <= 100)
        {
            System.out.println(counter);

            counter++; //counter = counter + 1;
        }

        System.out.println("Finished counting!");
    }

}
