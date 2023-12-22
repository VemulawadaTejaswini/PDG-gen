import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();

    long MOD = 1000000007L;

    long sum = 0;
    long c = 1;
    long a_c = 0;
    long b_c = 0;
    for (int i = 1; i < n + 1; i++) {
      c = modDiv(c, i, MOD) * (n - i + 1);
      c %= MOD;
      if (i == a) a_c = c;
      if (i == b) b_c = c;
      sum += c;
      sum %= MOD;
    }

    long ans = sum - a_c - b_c;
    if (ans < 0) ans += MOD;
    System.out.println(ans);
  }

  private static long modDiv(long a, long b, long mod) {
    return (a % mod) * modInv(b, mod) % mod;
  }

  private static long modInv(long x, long mod) {
    return modPow(x, mod - 2, mod);
  }

  private static long modPow(long b, long e, long mod) {
    long ans = 1;
    long x = b % mod;
    for (long y = e; y != 0; y >>= 1) {
      if ((y & 1) == 1) ans = (ans * x) % mod;
      x = (x * x) % mod;
    }
    return ans;
  }
}
