import java.util.*;
import java.io.*;

public class Main {

  static long[][] dp;
  static long[] arr;
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    arr = new long[n];
    dp = new long[n][n];
    for(int i = 0; i < n; ++i) arr[i] = in.nextInt();

    System.out.println(dp(0, n - 1));
  }

  static long dp(int i, int j) {
    if (i > j) return 0;
    if (dp[i][j] != 0) return dp[i][j]; // check this shit 
    return dp[i][j] = Math.max(arr[i] - dp(i + 1, j), arr[j] - dp(i, j - 1));
  }
}