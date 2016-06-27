package primitives;

//Integer types: byte(8), short(16), int(32), long(64)

/*
 * byte: 	-128 to 127
 * short:	-32,768 to 32,767
 * int:		-2,147,483,648 to 2,147,483,647
 * long:	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
 */

//EXAMPLE 1: Compute distance light travels using long variables.

public final class Light {

	public static void main(String[] args) {
		int lightspeed;
		long days;
		long seconds;
		long distance;
		
		// Evenson et all - calculated 299,792,458 metres / second
		// 1 mile = 1609.34 metres
		// approximate speed of light in miles per second
		lightspeed = 186000;
		days = 1000; // specify number of days here
		seconds = days * 24 * 60 * 60; // convert to seconds (1 day = 24 * 60 * 60)
		distance = lightspeed * seconds; // compute distance
		
		System.out.print("In " + days);
		System.out.print(" days light will travel about ");
		System.out.println(distance + " miles.");

	}

}
