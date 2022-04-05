
/* Print pattern using for loop

        *
      * *
    * * *
  * * * *


 */



public class Pattern5 {

    public static void main(String [] args){

        for(int i = 1; i<=4; i++){
            int count =i;
            for(int j =1; j<=4; j++) {

                if(count <4) {
                    System.out.print("  ");
                    count++;
                }
                else {
                    System.out.print("* ");
                    count++;
                }

                }
            System.out.println();
            }

        }
    }





