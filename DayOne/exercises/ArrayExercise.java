package arrays;

public class ArrayExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {1,2,1,2};
		
		boolean a = has22(test);
		System.out.println(a);
		
	}
	
	//Question 1
	public static boolean firstLast6(int[] nums) {
		  return (nums[0] == 6) || (nums[nums.length - 1] == 6);
		}

	//Question 2
	public static boolean sameFirstLast(int[] nums) {
		  return (nums.length >= 1) && (nums[0] == nums[nums.length-1]);
	}

	//Question 3
	public static boolean commonEnd(int[] a, int[] b) {
		  return (a[0] == b[0]) || (a[a.length-1] == b[b.length-1]);
		}
	
	//Question 4
	public static int[] maxEnd3(int[] nums) {
		  int max;
		   
		  if (nums[0] > nums[nums.length - 1])
		    max = nums[0];
		  else
		    max = nums[nums.length - 1];
		     
		  nums[0] = max;
		  nums[1] = max;
		  nums[2] = max;
		   
		  return nums;
	}
	
	//Question 5
	public static boolean has23(int[] nums) {
		  return (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3);
		}
	
	//Question 6
	public int countEvens(int[] nums) {
		  int count = 0, num;
		  for (int i = 0; i < nums.length; i++) {
		     num = nums[i];
		     if (num % 2 == 0) {
		       count++;
		     }
		  }
		  return count;
		}

	//Question 7
	public static int bigDiff(int[] nums) {
		  int max = nums[0], min = nums[0];
		  for (int i = 0; i < nums.length; i++) {
		    if (nums[i] > max) 
		      max = nums[i];
		    if (nums[i] < min)
		      min = nums[i];
		  }
		  return max - min;
		}

	//Question 8
	public static int sum13(int[] nums) {
		  int last = 0, sum = 0, num;
		  for (int i = 0; i < nums.length; i++) {
		    num = nums[i];
		    if (num == 13) {
		      i++;
		    } else {
		      sum += num;
		    }
		  }
		  return sum;
		}

	//Question 9
	public int sum67(int[] nums) {
		  boolean inSection = false;
		  int num, sum = 0;
		  for (int i = 0; i < nums.length; i++) {
		    num = nums[i];
		    if (num == 6 && !inSection)
		      inSection = true;
		    else if (num == 7 && inSection)
		      inSection = false;
		    else if (!inSection) 
		      sum += num;
		  }
		  return sum;
		}

	//Question 10
	public static boolean has22(int[] nums) {
		  int num, last = 0;
		  for (int i = 0; i < nums.length; i++) {
		    num = nums[i];
		    if (num == 2 && last == 2)
		      return true;
		    last = num;
		  }
		  return false;
		}

}
