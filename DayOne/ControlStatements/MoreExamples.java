package ControlStatements;

//EXAMPLE 2

import java.util.Scanner;
import java.io.IOException;

public class MoreExamples {

	public static void main(String[] args) {
		
		//ComplexIf();
		//Switch2(10,20,'*');
		//Switch1();
		//SimpleIf();
		Menu();
	}
	
	//Check whether int number is less than or equal to 100, 1000 or greater
	static void SimpleIf()
	{
		System.out.println("Enter an int number: ");
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		if (number < 100 && number > 20)
			System.out.println("Your number is less than 100");
		else if (number == 100)
			System.out.println("Your number is equal to 100");
		else if (number < 1000)
			System.out.println("Your number is less than 1000");
		else
			System.out.println("Your number is greater than 1000");		
	}
	
	//check if a character is upper case, lower case, or a digit
	static void ComplexIf()
	{
		System.out.println("Enter a character: ");
		
		Scanner scan = new Scanner(System.in);
		char yourChar = (char)scan.next().charAt(0);
		
		if(Character.isLetter(yourChar) || Character.isDigit(yourChar))
		{
			if (Character.isUpperCase(yourChar))
				System.out.println("Your character is Uppercase");
			else if (Character.isLowerCase(yourChar))
				System.out.println("YOur character is Lowercase");
			else if (Character.isDigit(yourChar))
				System.out.println("Your character is a number");
		}
		else
			System.out.println("Your character is not a letter of a number");		
		
	}

	static void Switch1()
	{
		System.out.println("What size ice cream cone would you like? <1 = small, 2 = medium, 3 = large, 4 - huge>");
		
		Scanner scan = new Scanner(System.in);
		int scoops = scan.nextInt();
		double cost = 0;

		switch (scoops)
		{
		case 1:
            cost = 1.25;
            break;
        case 2:
            cost = 2.25;
            break;
        case 3:
            cost = 3.25;
            break;
        case 4:
            cost = 4.00;
            break;
        default:
        	System.out.println("We don't carry that size");
        	break;
		}
		if (scoops > 0 && scoops < 5)
			System.out.println("Total cost with " + scoops + " is: " + cost);
	}
	
	//switch operation that accept 2 integer and an operator to perform computation
	static void Switch2(int op1, int op2, char opr)
	{
		int result = 0;
		switch (opr)
		{
			case '+':
				result = op1 + op2;
				break;
			case '-':
				result = op1 - op2;
				break;	
			case '*':
				result = op1 * op2;
				break;
			case '/':
				result = op1 + op2;
				break;
			default:
				System.out.println("Unknown operator");
		}
		System.out.println("Result: " + result);
	}
	
	static void Menu()
	{
		try
		{
			char choice;
			do {
			System.out.println("Help on: ");
			System.out.println(" 1. if");
			System.out.println(" 2. switch");
			System.out.println(" 3. while");
			System.out.println(" 4. do-while");
			System.out.println(" 5. for\n");
			System.out.println("Choose one:");
			choice = (char) System.in.read();
			} 
			while( choice < '1' || choice > '5');
				System.out.println("\n");
			
			switch(choice) {
				case '1':
				System.out.println("The if:\n");
				System.out.println("if(condition) statement;");
				System.out.println("else statement;");
				break;
				case '2':
				System.out.println("The switch:\n");
				System.out.println("switch(expression) {");
				System.out.println(" case constant:");
				System.out.println(" statement sequence");
				System.out.println(" break;");
				System.out.println(" //...");
				System.out.println("}");
				break;
				case '3':
				System.out.println("The while:\n");
				System.out.println("while(condition) statement;");
				break;
				case '4':
				System.out.println("The do-while:\n");
				System.out.println("do {");
				System.out.println(" statement;");
				System.out.println("} while (condition);");
				break;
				case '5':
				System.out.println("The for:\n");
				System.out.print("for(init; condition; iteration)");
				System.out.println(" statement;");
				break;
			}
		
		} catch (IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}
	}

}
