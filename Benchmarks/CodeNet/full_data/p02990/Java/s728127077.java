import java.util.*;

public class Main {
  static long MOD = (long)Math.pow(10, 9) + 7;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    long[] kai = new long[(int)(n + 1)];
    kai[0] = 1;
    for(long i = 1; i <= n; i++) {
      kai[(int)i] = (kai[(int)(i - 1)] * i) % MOD;
    }
    for(long i = 1; i <= k; i++) {
      long s1 = kai[(int)(n - k + 1)];
      long s2 = kai[(int)i];
      long s3 = kai[(int)(n - k + 1 - i)];
      s2 = func(s2, MOD - 2);
      s3 = func(s3, MOD - 2);
      long ans1 = (s1 * s2) % MOD;
      ans1 = (ans1 * s3) % MOD;

      long t1 = kai[(int)(k - 1)];
      long t2 = kai[(int)(i - 1)];
      long t3 = kai[(int)(k - i)];
      t2 = func(t2, MOD - 2);
      t3 = func(t3, MOD - 2);
      long ans2 = (t1 * t2) % MOD;
      ans2 = (ans2 * t3) % MOD;

      System.out.println((ans1 * ans2) % MOD);
    }
  }

  public static long func(long a, long x) {
    if(x == 0) return 1;
    if(x % 2 == 0) {
      long t = func(a, x / 2);
      return (t * t) % MOD;
    } else {
      long t = func(a, x / 2);
      t = (t * t) % MOD;
      return (a * t) % MOD;
    }
  }
}