import java.io.*;
import java.util.*;

public class Main {
  private static boolean debug = false;
  private static boolean elapsed = false;

  private static PrintWriter _err = new PrintWriter(System.err);

  private int N;
  private int[] x;

  private void solve(Scanner sc, PrintWriter out) {
    N = sc.nextInt();
    x = new int[N];
    int[] a = new int[N * N];
    int[] cnt = new int[N];
    for (int i = 0; i < N; ++i) {
      x[i] = sc.nextInt() - 1;

      if (a[x[i]] > 0) {
        out.println("No");
        return;
      }
      a[x[i]] = i + 1;
      ++cnt[i];
    }

    for (int i = 0; i < N; ++i) {
      for (int j = 0; j < x[i]; ++j) {
        if (cnt[i] >= i + 1) {
          break;
        }
        if (a[j] == 0) {
          a[j] = i + 1;
          ++cnt[i];
        }
      }
      for (int j = x[i] + 1; j < N * N; ++j) {
        if (cnt[i] >= N) {
          break;
        }
        if (a[j] == 0) {
          a[j] = i + 1;
          ++cnt[i];
        }
      }
    }
    for (int i = 0; i < N * N; ++i) {
      if (a[i] == 0) {
        out.println("No");
        return;
      }
    }
    out.println("Yes");
    for (int i = 0; i < a.length; ++i) {
      if (i > 0) {
        out.print(" ");
      }
      out.print(a[i]);
    }
    out.println();
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