import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long C = scan.nextLong();
        long[] x = new long[N+1];
        long[] m = new long[N+1];
        long[] cum = new long[N+1];
        for (int i = 1; i <= N; i++) {
            x[i] = scan.nextLong();
            m[i] = scan.nextLong();
            cum[i] = cum[i-1] + m[i];
        }
        long[] dp = new long[N+1];
        dp[0] = 0;
        for (int i = 1; i <= N; i++) {
            dp[i] = Math.max(dp[i-1],cum[i]-x[i]);
        }
        System.out.println(dp[N]);
    }
}
