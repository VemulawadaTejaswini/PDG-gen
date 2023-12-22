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

    long maxGcd = Long.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      long gcd = 0;
      for (int j = 0; j < n; j++) {
        if (i == j) {
          continue;
        }
        gcd = gcd(gcd, a[j]);
      }
      if (maxGcd < gcd) {
        maxGcd = gcd;
      }
    }

    os.println(maxGcd);

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