import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    int[] h = new int[n];
    for (int i = 0; i < n; i++) {
        h[i] = sc.nextInt();
    }

    long[] dp = new long[n];
    for (int i = 0; i < dp.length; i++) {
        dp[i] = Long.MAX_VALUE;
    }

    dp[0] = 0;
    dp[1] = h[1] - h[0];

    for (int i = 2; i < h.length; i++) {
        long p = Math.abs(dp[i-1] + Math.abs(h[i] - h[i-1]));
        long q = Math.abs(dp[i-2] + Math.abs(h[i] - h[i-2]));
        dp[i] = Math.min(dp[i], Math.min(p, q));
    }
    
    System.out.println(dp[n-1]);
  }
}