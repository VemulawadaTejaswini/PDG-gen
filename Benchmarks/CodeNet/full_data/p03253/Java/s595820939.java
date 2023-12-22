import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final int MOD = 1000000007;
    int N = scanner.nextInt();
    int M = scanner.nextInt();

    List<Long> factorials = new ArrayList<>();
    int k = M;
    for (int i = 2; i <= Math.sqrt(M) + 1; i++) {
      long count = 0;
      while (k % i == 0) {
        count++;
        k /= i;
      }
      if (count > 0) factorials.add(count);
    }

    long count = 1;
    for(long f : factorials) {
      count = (count * choose(f + N - 1, f, MOD)) % MOD;
    }
    System.out.println(count);
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
