//Sum of N Natural Numbers

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Limit upto which Sum uis to be Calculated");
        int num = sc.nextInt();

        int sum = (num*(num+1))/2;
        System.out.println("the Sum of " + num +  " Natural Numbers is : "+ sum);
    }
}
