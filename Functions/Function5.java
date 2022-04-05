//Function to calculate the LCM and HCF of the two Numbers

package Functions;

import java.util.Scanner;

public class Function5 {

    public static int calcLCM( int a, int b){
        int LCM;

        int max_num = (a>b)?a:b;
        int i =1;

        while(i!=0){
            if(max_num % a == 0 && max_num % b ==0){

                LCM = max_num;
                return LCM;

            }
            ++max_num;

        }
        return 0;


    }

    public static int calcHCF( int a, int b,int LCM){

        return  (a*b)/LCM;

    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two Numbers  ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int LCM = calcLCM(a,b);


        System.out.println("the LCM of the given numbers is: "+ LCM);
        System.out.println("the HCF of the given numbers is: "+ calcHCF(a,b, LCM));




    }

}

















