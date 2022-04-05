//Make a function to add two numbers

package Functions;

import java.util.Scanner;

public class Function2 {

    public static int clcSum( int a , int b){

        return a+b;
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two Numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();


       System.out.println("The sum of the two Numbers is " + clcSum(a,b) );

    }


}



