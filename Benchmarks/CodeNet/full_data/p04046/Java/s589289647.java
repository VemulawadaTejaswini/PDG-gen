import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int A = scanner.nextInt();
    int B = scanner.nextInt();

    int M = 1_000_000_007;

    long[] choose1 = chooseForN(H - A + B - 1, M);
    long[] choose2 = chooseForN(W - B + A - 1, M);
    long res = 0;
    for (int i = 0; i < Math.min(H - A, W - B); i++) {
      long d = choose1[H - A - 1 - i] * choose2[W - B - 1 - i];
      d %= M;
      res += d;
      res %= M;
    }
    System.out.println(res);
  }

  public static long[] chooseForN(int n, long mod) {
    long[] C = new long[n + 1];
    long[] fact = new long[n + 1];
    long[] factinv = new long[n + 1];

    fact[0] = 1;
    for (int i = 0; i < n; i++) fact[i + 1] = fact[i] * (n - i) % mod;
    factinv[0] = 1;
    for (int i = 1; i <= n; i++) factinv[i] = factinv[i - 1] * inverse(i, mod) % mod;

    for (int i = 0; i <= n; i++) C[i] = fact[i] * factinv[i] % mod;

    return C;
  }

  private static long inverse(long a, long mod) {
    return modpow(a, mod - 2, mod);
  }

  private static long modpow(long a, long n, long mod) {
    long res = 1;
    while (n > 0) {
      if (n % 2 == 1) res = (res * a) % mod;
      a = (a * a) % mod;
      n >>= 1;
    }
    return res % mod;
  }
}
