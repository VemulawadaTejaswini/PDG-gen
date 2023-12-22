import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long n = scanner.nextLong();
    long s = scanner.nextLong();

    if (n < s) {
      System.out.println(-1);
      return;
    }

    for (int d = 39; d > 1; d--) {
      long b = lowerBound(d, n);
      while (d * Math.log(b) <= Math.log(n)) {
        if (test(b, n, s)) {
          System.out.println(b);
          return;
        }
        b++;
      }
    }

    // d = 1
    for (int a1 = (int) Math.sqrt(n - s); a1 >= 1; a1--) {
      if ((n - s) % a1 == 0) {
        long b = (n - s) / a1 + 1;
        long a0 = n - a1 * b;
        if (a0 >= 0 && a0 < b && a0 + a1 == s) {
          System.out.println(b);
          return;
        }
      }
    }

    // d = 0
    if (n == s) {
      System.out.println(n + 1);
    } else {
      System.out.println(-1);
    }
  }

  private static boolean test(long b, long n, long s) {
    if (b < 2) return false;
    long sum = 0;
    while (n > 0) {
      sum += n % b;
      n /= b;
    }
    return sum == s;
  }

  private static long lowerBound(int d, long n) {
    long left = 1;
    long right = n;
    double logn = Math.log(n);
    while (right - left > 1) {
      long mid = (left + right) / 2;
      double logm = (d + 1) * Math.log(mid);
      if (logm > logn) {
        right = mid;
      } else {
        left = mid;
      }
    }
    return right;
  }
}
