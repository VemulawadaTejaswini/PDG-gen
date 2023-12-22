import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    long res = 0;
    long[] count = new long[K + 1];
    for (int k = K; k >= 1; k--) {
      int n = K / k;
      count[k] = modpow(n, N, M);
      for (int i = 2; i * k <= K; i++) {
        count[k] -= count[i * k];
        if (count[k] < 0) count[k] += M;
      }
      res += count[k] * k % M;
      res %= M;
    }
    System.out.println(res);
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
