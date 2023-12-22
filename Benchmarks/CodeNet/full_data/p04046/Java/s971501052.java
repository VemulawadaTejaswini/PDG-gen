import java.util.*;

public class Main {
  public static long MOD = (long)Math.pow(10, 9) + 7;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();

    // f[i]はi! mod MODを表す
    long[] f = new long[2 * (int)Math.pow(10, 5) + 1];
    // g[i]はmod MODにおけるf[i]の積に関する逆元を表す
    long[] g = new long[2 * (int)Math.pow(10, 5) + 1];
    f[0] = 1;
    g[0] = 1;
    for(int i = 1; i < f.length; i++) {
      f[i] = (f[i - 1] * i) % MOD;
      g[i] = func(f[i], MOD - 2);
    }
    long ans = (((f[H + W - 2] * g[H - 1]) % MOD) * g[W - 1]) % MOD;
    for(int r = 0; r < B; r++) {
      long a = (((f[H - A - 1 + r] * g[r]) % MOD) * g[H - A - 1]) % MOD;
      long b = (((f[W - r - 1 + A - 1] * g[W - r - 1]) % MOD) * g[A - 1]) % MOD;
      ans -= (a * b) % MOD;
      if(ans < 0) ans += MOD;
    }
    System.out.println(ans);
  }

  public static long func(long a, long x) {
    if(x == 0) return 1;
    if(x % 2 == 0) {
      long t = func(a, x / 2);
      return (t * t) % MOD;
    } else {
      long t = func(a, x / 2);
      long s = (a * t) % MOD;
      s = (s * t) % MOD;
      return s;
    }
  }

}