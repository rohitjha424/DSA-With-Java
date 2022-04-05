//Make a function to calculate  Factorial of a number.

package Functions;

import java.util.Scanner;

public class Function4 {

    public static void fact( int n){
        int factorial = 1;

        if(n<0){
            System.out.println("invalid number !!! factorial Doesn't Exists");
            return ;
        }


        for(int i = 1 ; i<=n; i++) {

            factorial = factorial*i;
        }
        System.out.println("The Factorial of the Number is " + factorial );
        return ;
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number  ");
        int n = sc.nextInt();

        fact(n);




    }

}
















