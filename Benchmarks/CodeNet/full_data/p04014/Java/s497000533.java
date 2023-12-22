import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  long f(long b, long n) {
    if (n < b) {
      return n;
    } else {
      return f(b, n / b) + n % b;
    }
  }

  void run() {
    long n = sc.nextLong();
    long s = sc.nextLong();
    if (n == s) {
      System.out.println(n + 1);
      return;
    }
    long ans = Long.MAX_VALUE;
    for (long b = 2; b * b <= n; ++b) {
      if (f(b, n) == s) {
        ans = Math.min(ans, b);
      }
    }
    for (long p = 1; p * p < n; ++p) {
      long b = (n - s) / p + 1;
      if (b < 2) {
        continue;
      }
      if (f(b, n) == s) {
        ans = Math.min(ans, b);
      }
    }
    if (ans != Long.MAX_VALUE) {
      System.out.println(ans);
    } else {
      System.out.println(-1);
    }
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}