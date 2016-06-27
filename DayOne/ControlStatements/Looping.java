package ControlStatements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		//WhileLoop();
		//WhileLoopInfinite();
		//ForEachLoop();
		ForVar();
	}
	
	static void WhileLoop()
	{
		int counter = 0;
		while (counter <= 100)
		{
			System.out.println(counter);
			counter++;
		}
		
		System.out.println("Finished counting!");
	}
	
	static void WhileLoopInfinite()
	{
		int index = 0;
		
		out:
		while(true){
			int value = ++index;
			
			System.out.println(value);
			
			if(value == 5)
			{
				System.out.println("You found me!");
				break out;
			}
			if (value == 10)
			{
				System.out.println("While loop break!");
				break;
			}
		}
		
	}
	
	static void DoWhileLoop()
	{
		Scanner scan = new Scanner(System.in);
		char userChar = scan.next().charAt(0);
		
		System.out.println("Startting to count (Do While loop...");
		
		boolean keepgoing = true;
		int counter = 0;
		
		do
		{
			System.out.println(counter);
			if ((counter % 100) == 0 && counter != 0)
			{
				System.out.println("keep counting? (y/n)");
				if(userChar != 'y')
					keepgoing = false;
			}
			
			counter++;
		} while (keepgoing == true);
		
		System.out.println("Finish couting!");
		
	}
	
	static void ForLoop()
    {
        System.out.println("Starting to count (for loop).");

        for (int i = 0; i < 100; i++)
        {
            System.out.println(i);
        }

        System.out.println("Finish Counting!");

    }
	
	static void ForComma()
	{
		//this loop iterate based on two variables
		int a, b;
		for(a=1, b=4; a<b; a++, b--) {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}
	}
	
	static void ForVar()
	{
		//run until the boolean variable done is set to true
		int i;
		boolean done = false;
		i = 0;
		for( ; !done; ) {
			System.out.println("i is " + i);
			if(i == 10) done = true;
			i++;
		}
	}
	
	 static void ForEachLoop()
	 {
	     String[] data = { "This", "is", "a", "string", "array", "." };
	     //declar and empty string
	     String resultData = "";
	
	     //variable is a place holder for the item in collection (data)
	     //For example, when the lop first start s="This"
	     for (String s : data)
	     {
	         resultData += String.format(s + " ");
	     }
	     System.out.println(resultData);
	 }
	 
	 static void ForEachMulti()
	 {
		 int sum = 0;
		 int nums[][] = new int[3][5];
		 
		 // give nums some values
		 for(int i = 0; i < 3; i++)
			 for(int j = 0; j < 5; j++)
				 nums[i][j] = (i+1)*(j+1);
		 
		 // use for-each for to display and sum the values
		 //in case of two-dimensional array, the the iteration variable must be a reference to a one-dimensional array
		 for(int x[] : nums) {
			 for(int y : x) {
				 System.out.println("Value is: " + y);
				 sum += y;
			 }
		 }
		 System.out.println("Summation: " + sum);
	 }
	 
	 static void SearchArray()
	 {
		 int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
		 int val = 5;
		 boolean found = false;
		 
		 // use for-each style for to search nums for val
		 for(int x : nums) {
			 if(x == val) {
				 found = true;
				 break;
			 }
		 }
		 
		 if(found)
			 System.out.println("Value found!");
	 }

     static void ForEachLoop2()
     {
         ArrayList<String> list = new ArrayList<String>();
         list.add("John Doe");
         list.add("Jane Doe");
         list.add("Alex Kennedy");
         
         System.out.println("For-each loop count:");
         for ( String name : list)
             System.out.println(name);
         
         System.out.println("For loop count:");
         for (int counter=0; counter < list.size(); counter++)
        	 System.out.println(list.get(counter));
         
         System.out.println("Using Iterator:");
         Iterator iter = list.iterator();
         while (iter.hasNext()) {
            System.out.println(iter.next());
         }
         
         Enumeration<String> e = Collections.enumeration(list);
         
         // Enumerate through the ArrayList elements
         System.out.println("Using Enumeration: ");
         while(e.hasMoreElements())
         System.out.println(e.nextElement());
         
         
     }

}
