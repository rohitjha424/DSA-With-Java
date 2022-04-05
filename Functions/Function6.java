//Function to Print the fibonacci series


package Functions;

import java.util.Scanner;

public class Function6 {

    public static void printFibonacci( int n){

        int num1 =0;
        int num2 =1;

        int next =0;

        System.out.print("The Fibonacci Series of " + n + " terms is: " + num1+ " " + num2 + " ");

        for(int i=1; i<n-1; i++){
          next = num2 + num1;
            System.out.print( next + " ");
            num1= num2;
            num2= next;
        }
        return;



    }


    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Numbers of terms of Fibonacci Series");

        int n = sc.nextInt();

        printFibonacci(n);

    }

}






