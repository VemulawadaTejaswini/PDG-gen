/*
 *created by Kraken on 27-04-2020 at 11:27
 */
import java.util.*;
import java.io.*;

public class Main {
  private static final long INF = (long) 1e18 + 1;

  public static void main(String[] args) {
    FastReader sc = new FastReader();
    int n = sc.nextInt();
    long w = sc.nextLong();
    long[] weights = new long[n];
    int[] values = new int[n];
    int sum = 0;
    for (int i = 0; i < n; i++) {
      weights[i] = sc.nextLong();
      values[i] = sc.nextInt();
      sum += values[i];
    }
    long[] dp = new long[sum + 1];
    Arrays.fill(dp, INF);
    dp[0] = 0;
    for (int i = 0; i < n; i++) {
      for (int nowValue = sum - values[i]; nowValue >= 0; nowValue--) {
        dp[nowValue + values[i]] = Math.min(dp[nowValue + values[i]], dp[nowValue] + weights[i]);
      }
    }
    long res = 0;
    for (int i = 0; i <= sum; i++) {
      if (dp[i] <= w) res = Math.max(res, i);
    }
    System.out.println(res);
  }

  static class FastReader {

    BufferedReader br;

    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        }
        catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      }
      catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }
  }
}
