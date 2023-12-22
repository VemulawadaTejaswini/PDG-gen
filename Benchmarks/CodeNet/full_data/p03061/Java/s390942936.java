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

    long[] minGcds = new long[n];
    long[] secondMinGcds = new long[n];

    long globalMinGcd = Long.MAX_VALUE;
    int toRemoveIndex = 0;

    for (int i = 0; i < n; i++) {
      long minGcd = Long.MAX_VALUE;
      long secondMinGcd = Long.MAX_VALUE;
      for (int j = i; j < n; j++) {
        long gcd = gcd(a[i], a[j]);
        if (gcd < minGcd) {
          secondMinGcd = minGcd;
          minGcd = gcd;
        } else if (gcd < secondMinGcd) {
          secondMinGcd = gcd;
        }
      }
      minGcds[i] = minGcd;
      secondMinGcds[i] = secondMinGcd;

      if (minGcd <= globalMinGcd) {
        toRemoveIndex = i;
        globalMinGcd = minGcd;
      }
    }

    long ret = Long.MAX_VALUE;
    for (int i = 0; i < toRemoveIndex; i++) {
      if (secondMinGcds[i] < ret) {
        ret = secondMinGcds[i];
      }
    }

    for (int i = toRemoveIndex + 1; i < n; i++) {
      if (minGcds[i] < ret) {
        ret = minGcds[i];
      }
    }
    os.println(ret);

    /**
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
     */
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