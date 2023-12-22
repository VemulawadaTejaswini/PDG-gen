import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int X = sc.nextInt();
      long[] x = new long[N];
      for (int i = 0; i < N; i++) {
        x[i] = sc.nextLong();
      }
      System.out.println(solve(X, x));
    }
  }

  public static long solve(int X, long[] x) {
    long init = Math.abs(X - x[0]);
    for (int i = 1; i < x.length; i++) {
        init = gcd(init,  Math.abs(X - x[i]));
    }
    return init;
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