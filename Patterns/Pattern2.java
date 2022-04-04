/* Print pattern using for loop

 * * * * *
 *       *
 *       *
 * * * * *

 */

  // Way 1

/*


public class Pattern2 {
    public static void main(String[]args){
        int row = 4;
        int col = 5;
        for(int i =0; i<row;i++){
            for (int j=0; j<col; j++){
                if(( j>0 ) && (j<col-1)){
                    if(( i>0 ) && (i<row-1)) {
                        System.out.print("  ");
                        continue;
                    }
                }
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}



*/

// 2nd way to Print the pattern


public class Pattern2 {
    public static void main(String[]args){
        int row = 4;
        int col = 5;
        for(int i =1; i<=row;i++){
            for (int j=1; j<=col; j++){
                if( i==1 || j ==1  || i==row || j== col) {
                    System.out.print("* ");
                }
                else{
                        System.out.print("  ");

                    }
                }
            System.out.println();

            }


        }
    }


