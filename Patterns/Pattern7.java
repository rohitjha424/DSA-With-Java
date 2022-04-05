
/* Print pattern using for loop

 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1

 */


// ########### Way1 ##########


// /*

public class Pattern7 {


    public static void main(String [] args){

        int n =5;

        for(int i = 1; i<=n; i++){
            for(int j =1; j<=(n-i+1); j++) {

                System.out.print(j+" ");

            }
            System.out.println();
        }

    }

}

// */


// ########### 2nd way to Print the pattern ##########



/*



public class Pattern7 {


    public static void main(String [] args){

        for(int i = 5; i>=1; i--){
            for(int j =1; j<=i; j++) {

                System.out.print(j+" ");

            }
            System.out.println();
        }

    }

}

 */



