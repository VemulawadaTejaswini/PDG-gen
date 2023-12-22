import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int w = sc.nextInt();
    int[] weights = new int[n];
    long[] values = new long[n];
    for(int i = 0; i<n; i++) {
        weights[i] = sc.nextInt();
        values[i] = sc.nextInt();
    }
    long[][] dp = new long[n+1][w+1];
    for(int i = 1; i<=n; i++) {
        for(int j = 1; j<=w; j++) {
            int currWeight = weights[i-1];
            dp[i][j] = dp[i-1][j];
            if(j-currWeight>=0)
                dp[i][j] = Math.max(dp[i][j], dp[i-1][j-currWeight]+values[i-1]);
        }
    }
    System.out.println(dp[n][w]);
  }
}