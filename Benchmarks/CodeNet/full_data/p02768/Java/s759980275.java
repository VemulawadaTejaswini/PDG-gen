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
    long ans = modPow(2, n, MOD) - 1;
    long c = 1;
    for (int i = 1; i < b + 1; i++) {
      c *= modInv(i, MOD);
      c %= MOD;
      c *= (n - i + 1);
      c %= MOD;
      if (i == a) ans -= c;
      if (ans < 0) ans += MOD;
      if (i == b) ans -= c;
      if (ans < 0) ans += MOD;
    }
    System.out.println(ans);
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