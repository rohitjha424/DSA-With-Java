//print table og a given Number

import java.util.*;

public class Loop5Table {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
            System.out.print("Table of Number: ");
            int num = sc.nextInt();

            for(int i =1; i<=10; i++){
                System.out.println(num*i);
            }



    }
}
