import java.util.Scanner;

public class Main {
  static final long M = 998244353L;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    long K = scanner.nextLong();

    System.out.println(solve(N, A, B, K));
  }

  private static long solve(int N, long A, long B, long K) {
    if (A > B) return solve(N, B, A, K);

    long res = 0;
    for (int i = 0; i <= Math.min(N, K / B); i++) {
      if ((K - B * i) % A == 0) {
        long j = (K - B * i) / A;
        if (j > N) continue;
        res += choose(N, i, M) * choose(N, j, M) % M;
        res %= M;
      }
    }
    return res;
  }

  public static long choose(long n, long k, long mod) {
    if (k > n - k) return choose(n, n - k, mod);
    long res = 1;
    for (int i = 0; i < k; i++) {
      res = (res * (n - i)) % mod;
    }
    for (int i = 1; i <= k; i++) {
      res = (res * inverse(i, mod)) % mod;
    }
    return res % mod;
  }

  public static long inverse(long a, long mod) {
    return modpow(a, mod - 2, mod);
  }

  public static long modpow(long a, long n, long mod) {
    long res = 1;
    while (n > 0) {
      if (n % 2 == 1) res = (res * a) % mod;
      a = (a * a) % mod;
      n >>= 1;
    }
    return res % mod;
  }
}
