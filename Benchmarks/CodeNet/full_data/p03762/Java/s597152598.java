import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final long M = 1_000_000_007;
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] x = new int[n];
    int[] y = new int[m];
    for (int i = 0; i < n; i++) x[i] = scanner.nextInt();
    for (int i = 0; i < m; i++) y[i] = scanner.nextInt();

    System.out.println(compute(x, M) * compute(y, M) % M);
  }

  private static long compute(int[] a, long mod) {
    long ans = 0;
    int n = a.length;
    for (int i = 1; i < n; i++) {
      long d = ((long) a[i] - a[i - 1]) % mod;
      ans += i * (n - i) % mod * d % mod;
      ans %= mod;
    }
    return ans;
  }
}