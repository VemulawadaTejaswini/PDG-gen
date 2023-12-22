import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    sc.close();

    if ((X + Y) % 3 != 0) {
      System.out.println(0);
      return;
    }

    int x = (2 * X - Y) / 3;
    int y = (2 * Y - X) / 3;
    int mod = 1000000000 + 7;
    long[] cmb = modCmb(x + y, y, mod);
    long ans = 0;
    for (int i = 0; i < cmb.length; i++) ans = (ans + cmb[i]) % mod;
    System.out.println(ans);
  }

  private static long[] modCmb(int n, int k, long mod) {
    long[] cmb = new long[n - k + 1];
    cmb[0] = 1;
    for (int i = 1; i <= n - k; i++)
      cmb[i] = modDiv(cmb[i - 1] * (k + i - 1), i, mod);
    return cmb;
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