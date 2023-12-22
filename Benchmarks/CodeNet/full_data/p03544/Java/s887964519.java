import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        long ans = fib(n);


        System.out.println(ans);
    }

    public static long fib(long n) {
       long dp[] = new long[(int)(n+1)];

       dp[0] = 2;
       dp[1] = 1;

       for (long i = 2; i < n + 1; i++) {
           dp[(int)i] = dp[(int)(i - Long.valueOf(1))] + dp[(int)(i - 2)];
       }

       return dp[(int)n];

    }
}
