import java.util.*;

public class Main{

     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int number = 5;
        int max = 0, min = 123;
        while(number-- > 0){
            int k = in.nextInt();
            max = Math.max(k, max);
            min = Math.min(k, min);
        }
        int j = in.nextInt();
        if(max-min > j) System.out.println(":(");
        else System.out.println("Yay!");
     }
}