import java.util.*;
 
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt();
        long t = sc.nextLong();
        long a = sc.nextLong();
        long T = 0,A = 0;
        for (int i = 1;i < n;i++) {
            T = sc.nextLong();
            A= sc.nextLong();
            long m = Math.max((t-1)/T+1,(a-1)/A+1);
            t = T*m;
            a = A*m;
        }
        
        System.out.println(t+a);
    }
}