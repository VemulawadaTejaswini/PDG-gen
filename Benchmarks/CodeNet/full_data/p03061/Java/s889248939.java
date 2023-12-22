import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();

    long[] a = new long[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    long globalMinGcd = Long.MAX_VALUE;
    int globalMinGcdRoot = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      long minGcd = Long.MAX_VALUE;
      for (int j = i; j < n; j++) {
        long g = gcd(a[i], a[j]);
        if (g <= minGcd) {
          minGcd = g;
        }
      }
      if (minGcd <= globalMinGcd) {
        globalMinGcd = minGcd;
        globalMinGcdRoot = i;
      }
    }

    globalMinGcd = Long.MAX_VALUE;

    for (int i = 0; i < n; i++) {
      if (i == globalMinGcdRoot) {
        continue;
      }
      long minGcd = Long.MAX_VALUE;
      for (int j = i; j < n; j++) {

        if (j == globalMinGcdRoot) {
          continue;
        }
        long g = gcd(a[i], a[j]);
        if (g < minGcd) {
          minGcd = g;
        }
      }
      if (minGcd < globalMinGcd) {
        globalMinGcd = minGcd;
      }
    }

    os.println(globalMinGcd);
  }

  private static long gcd(long m, long n) {
    if (m < n) {
      return gcd(n, m);
    }
    if (n == 0) {
      return m;
    }
    return gcd(n, m % n);
  }

}