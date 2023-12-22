import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (Math.abs(n - m) > 1) {
            System.out.println(0);
            return;
        }

        long ln = 1;
        long mod = 1000000007;

        for (int i = 2; i <= n ; i++) {
            ln *= i % mod;
            ln %= mod;
        }

        for (int i = 2; i <= m ; i++) {
            ln *= i % mod;
            ln %= mod;
        }

        if (Math.abs(n - m) == 0) {
            ln *= 2;
        }

        System.out.println(ln % mod);
    }
}