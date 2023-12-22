import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if(n < k) {
            System.out.println(n);
            return;
        } else if(n == k || k == 1) {
            System.out.println(0);
            return;
        } else if(k == 2) {
            if(n%2 ==0) System.out.println(0);
            else System.out.println(1);
            return;
        }
        while(true) {
             n -= k;
             if(n <= 0) {
                 n = Math.min(Math.abs(n), n + k);
                 System.out.println(n);
                 return;
             }
        }
    }
}