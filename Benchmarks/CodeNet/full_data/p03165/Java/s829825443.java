/*
 *created by Kraken on 27-04-2020 at 18:05
 */
import java.util.*;
import java.io.*;

public class Main {
  static class Pair {
    int x;
    String s;
    Pair() {
      this.x = 0;
      this.s = "";
    }

    @Override
    public String toString() {
      return "Pair{" +
        "x=" + x +
        ", s='" + s + '\'' +
        '}';
    }
  }

  public static void main(String[] args) {
    FastReader sc = new FastReader();
    String s = sc.next(), t = sc.next();
    int n = s.length(), m = t.length();
    Pair[][] dp = new Pair[n + 1][m + 1];
    for (int i = 0; i <= n; i++) for (int j = 0; j <= m; j++) dp[i][j] = new Pair();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        if (s.charAt(i - 1) == t.charAt(j - 1)) {
          dp[i][j].x = dp[i - 1][j - 1].x + 1;
          dp[i][j].s = dp[i - 1][j - 1].s + s.charAt(i - 1);
        }
        else {
          if (dp[i][j - 1].x > dp[i - 1][j].x) {
            dp[i][j].x = dp[i][j - 1].x;
            dp[i][j].s = dp[i][j - 1].s;
          } else {
            dp[i][j].x = dp[i - 1][j].x;
            dp[i][j].s = dp[i - 1][j].s;
          }
        }
      }
    }
    System.out.println(dp[n][m].s);
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
