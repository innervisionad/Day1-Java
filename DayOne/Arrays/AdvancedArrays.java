package arrays;

//EXAMPLE 7: Advanced Arrays example

//import java.util.ArrayList;

public class AdvancedArrays {

	public static void main(String[] args) {
		NumbersArray();

	}
	
	
    static void NumbersArray()
    {
        //int[] nums = new int[] { 5, 10, 15, 20 };
        //Data type followed by the brackets and initialised with the storage value (4)
        int[] nums = new int[6];

        nums[0] = 492;
        nums[1] = 21;
        nums[2] = 400;
        nums[3] = 234;
        nums[4] = 10;
        nums[5] = 2;

        BubbleSort(nums);
        


       for (int i=0; i<nums.length; i++)
    	   System.out.println(nums[i]);
    }
	
  //create a bubble sort that accepts and array.
	static void BubbleSort(int[] ar)
    {
        //first loop is about looping through an array based on the length
        for (int pass = 1; pass < ar.length; pass++)
            //it will take the first element compared to all the elements
            for (int i = 0; i < ar.length - 1; i++)
                if (ar[i] > ar[i + 1])
                    Swap(ar, i);
    }

    static void Swap(int[] ar, int item)
    {
        int hold;

        hold = ar[item];
        ar[item] = ar[item + 1];
        ar[item + 1] = hold;
    }
}
