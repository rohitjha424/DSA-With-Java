//Make a function to calculate product of two numbers

package Functions;

import java.util.Scanner;

public class Function3 {

    public static int clcProduct( int a , int b){

        return a*b;
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two Numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();


        System.out.println("The Product of the two Numbers is " + clcProduct(a,b) );

    }


}








