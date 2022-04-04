//Sum of N Natural Numbers using for loop

import java.util.Scanner;

public class Loop4_SumNaturals {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Limit upto which Sum uis to be Calculated");
        int num = sc.nextInt();
        int sum =0;
        for(int i = 1; i<=num; i++){
            sum= sum+i;
        }
        System.out.println("the Sum of " + num +  " Natural Numbers is : "+ sum);
    }
}
