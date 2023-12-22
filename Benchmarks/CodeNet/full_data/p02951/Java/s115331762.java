import java.util.*;
public class Main {
    public static void main (String[]args){
        // 標準入力
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        sc.close();

        int full = A - B;
        int rest = C - full;

        if (rest >= 0){
            System.out.println(rest);
        } else{
            System.out.println(0);
        }
        

    }   
}