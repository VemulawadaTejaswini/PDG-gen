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
      c *= modInv(i, MOD);
      c %= MOD;
      c *= (n - i + 1);
      c %= MOD;
      if (i == a) a_c = c;
      if (i == b) b_c = c;
      sum += c;
      sum %= MOD;
    }

    long ans = sum;
    ans -= a_c;
    if (ans < 0) ans += MOD;
    ans -= b_c;
    if (ans < 0) ans += MOD;
    System.out.println(ans);
  }

  private static long modInv(long x, long mod) {
    long a = x;
    long b = mod;
    long t = 1;
    long u = 0;
    while (0 < b) {
      long q = a / b;
      a -= q * b;
      { long tmp = b; b = a; a = tmp; }
      t -= q * u;
      { long tmp = u; u = t; t = tmp; }
    }

    if (t < 0) t += mod;
    return t;
  }
}
