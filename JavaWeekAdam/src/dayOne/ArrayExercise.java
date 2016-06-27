package dayOne;

/**
 * Created by student on 27-Jun-16.
 */
public class ArrayExercise {

    public static void main(String[] args)
    {

        int[] nums = {1, 2, 6};
        int[] firstLast = {1, 2, 3, 1};
        int[] commonEndA = {1, 2, 3}, commonEndB = {7, 3};
        int[] maxEnd3 = {1, 2, 3};
        int[] has23 = {2, 5};
        int[] evenList  = {2, 1, 2, 3, 4};
        System.out.println(firstLast6(nums));
        System.out.println(sameFirstLast(firstLast));
        System.out.println(maxEnd3(maxEnd3)[1]);
        System.out.println(has23(has23));
        System.out.println(evenList(evenList));

    }

    static boolean firstLast6(int[] nums) {
        return (nums[0] == 6) || (nums[nums.length - 1] == 6);

    }

    static boolean sameFirstLast(int[] firstLast){
        return (firstLast.length >= 1) && (firstLast[0] == firstLast[firstLast.length - 1]);

    }

    static boolean commonEnd (int[] commonEndA, int[] commonEndB){
        return  (commonEndA.length >=1 && commonEndB.length >=1) && ((commonEndA[0] == commonEndB[0]) || (commonEndA[commonEndA.length -1] == commonEndB[commonEndB.length -1]));
    }

    static int[] maxEnd3(int[] maxEnd3){
        if(maxEnd3[0] > maxEnd3[maxEnd3.length -1]){
            maxEnd3[1] = maxEnd3[0];
            maxEnd3[2] = maxEnd3[0];
        }
        else {
            maxEnd3[0] = maxEnd3[maxEnd3.length -1];
            maxEnd3[1] = maxEnd3[maxEnd3.length -1];
        }
        return maxEnd3;
    }

    static boolean has23(int[] has23){

            if(has23.length >= 2)
                return (has23[0] == 2 || has23[0] == 3 || has23[1] == 2 || has23[1] == 3);

                return false;

    }

    static int evenList (int [] evenList){
        int evenCount = 0;
        for(int i = 0; i < evenList.length; i++){
            if(evenList[i]%2 == 0){
                evenCount++;
            }

        }
        return evenCount;
    }


}
