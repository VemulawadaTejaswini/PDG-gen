import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int M = 1_000_000_007;
    int N = scanner.nextInt();
    long[] a = new long[N];
    long[] numOnes = new long[60];
    for (int i = 0; i < N; i++) {
      long aa = scanner.nextLong();
      a[i] = aa;
      int j = 0;
      while (aa > 0) {
        if (aa % 2 != 0) numOnes[j]++;
        j++;
        aa /= 2;
      }
    }

    long res = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < 60; j++) {
        if (a[i] % 2 == 0) {
          res += (numOnes[j] << j) % M;
        } else {
          res += ((N - numOnes[j]) << j) % M;
        }
        if (res >= M) res -= M;
        a[i] /= 2;
      }
    }
    res *= inverse(2, M);
    res %= M;
    System.out.println(res);
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
