package exercises;

import java.util.Scanner;


public class BinaryApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get int of binary digits
        String binary = input.nextLine();

        BinaryConversion(binary);
    }


    static void BinaryConversion(String binary)
    {
        int result = 0, mult = 1;
        for(int i=binary.length()-1; i >= 0 ;i--){
            if(binary.charAt(i) == '1'){
                result += mult;
            }
            mult = mult * 2;
        };
        System.out.println("Decimal value: " + result);
    }
   
}