//Printing the name using function call

package Functions;

import java.util.Scanner;

public class Function1 {

    public static void printMyName(String name){
        System.out.println(name); return;
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name ");
        String name = sc.nextLine();
        printMyName(name);

    }


}

