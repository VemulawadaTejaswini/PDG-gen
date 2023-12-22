import java.io.*;
import java.util.*;

public class Main {
  private static boolean debug = false;
  private static boolean elapsed = false;

  private static PrintWriter _err = new PrintWriter(System.err);

  private int N;
  private int A;
  private int[] x;

  private int X;

  private int[][][] dp;

  private void solve(Scanner sc, PrintWriter out) {
    N = sc.nextInt();
    A = sc.nextInt();
    sc.nextLine();
    x = new int[N];

    X = A;

    for (int i = 0; i < N; ++i) {
      x[i] = sc.nextInt();
      if (x[i] > X) {
        X = x[i];
      }
    }

    dp = new int[N + 1][N + 1][N * X + 1];
    for (int j = 0; j <= N; ++j) {
      for (int k = 0; k <= N; ++k) {
        for (int s = 0; s <= N * X; ++s) {
          if (j == 0 && k == 0 && s == 0) {
            dp[j][k][s] = 1;
          } else if (j >= 1 && s < x[j - 1]) {
            dp[j][k][s] = dp[j - 1][k][s];
          } else if (j >= 1 && k >= 1 && s >= x[j - 1]) {
            dp[j][k][s] = dp[j - 1][k][s] + dp[j - 1][k - 1][s - x[j - 1]];
          } else {
            dp[j][k][s] = 0;
          }
        }
      }
    }
    long sum = 0;
    for (int k = 1; k <= N; ++k) {
      sum += dp[N][k][k * A];
    }
    out.println(sum);
  }
  private long C(long n, long r) {
    long res = 1;
    for (long i = n; i > n - r; --i) {
      res *= i;
    }
    for (long i = r; i > 1; --i) {
      res /= i;
    }
    return res;
  }
  private long P(long n, long r) {
    long res = 1;
    for (long i = n; i > n - r; --i) {
      res *= i;
    }
    return res;
  }
  private long ceil2pow(long n) {
    if (n == 0) {
      return 1;
    }
    n--;
    n |= (n >>> 1);
    n |= (n >>> 2);
    n |= (n >>> 4);
    n |= (n >>> 8);
    n |= (n >>> 16);
    n++;
    return n;
  }
  /*
   * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
   * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
   */
  public static void main(String[] args) {
    long S = System.currentTimeMillis();

    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(sc, out);
    out.flush();

    long G = System.currentTimeMillis();
    if (elapsed) {
      _err.println((G - S) + "ms");
    }
    _err.flush();
  }
}