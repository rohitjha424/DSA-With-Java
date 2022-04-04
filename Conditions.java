import java.util.*;

public class Conditions {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            switchCondition(a);

        }
        else if(b>c && b>a){
            switchCondition(b);

        }
        else {
            switchCondition(c);

        }


    }
    public static int switchCondition(int r){

        System.out.println(r+ " is greater");
        return 0;




    }
}

