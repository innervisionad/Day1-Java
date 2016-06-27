package arrays;

//EXAMPLE 3: Demonstrate a two-dimension array.

public class TwoDArray {

	public static void main(String[] args) {
		
		//4 by 5 - 2 dimension array
		//left index - row (4), right index - column (5)
		int twoD[][] = new int[4][5];
		System.out.println(twoD.length);
		int i, j, k = 0;
		
		for(i=0; i<4; i++) //loop for row
			for(j=0; j<5; j++) { //loop for column
				twoD[i][j] = k;
				k++;
			}
		
		for(i=0; i<4; i++) 
		{
			for(j=0; j<5; j++)
				System.out.print(twoD[i][j] + " ");
			System.out.println();
		}
	}
}
