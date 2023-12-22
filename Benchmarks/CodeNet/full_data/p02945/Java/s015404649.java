import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();

        int wa = A + B;
        int sa = A - B;
        int seki = A * B;

        int max1 = Math.max(wa, sa);
        int max2 = Math.max(max1, seki);
        System.out.println(max2);
        sc.close();
    }
}