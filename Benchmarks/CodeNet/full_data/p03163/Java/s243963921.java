import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    static int n;
    static int W;
    static long[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        W = sc.nextInt();
        dp = new long[n+1][W+1];
        for (int i = 0; i < n; i++) {
            int w = sc.nextInt();
            int v = sc.nextInt();
            for (int j = 0; j < w; j++) {
                dp[i+1][j] = dp[i][j];
            }
            for (int j = w; j <= W; j++) {
                dp[i+1][j] = Math.max(dp[i][j], dp[i][j-w] + v);
            }
        }
        System.out.println(LongStream.of(dp[n]).max().getAsLong());
     }

}
