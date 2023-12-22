import java.util.*;

public class Main {
  public static long MOD = (long)Math.pow(10, 9) + 7;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    long[] a = new long[(int)n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    Arrays.sort(a);
    long ans = 0;
    long[] kai = new long[(int)n];
    kai[0] = 1;
    for(long i = 1; i < n; i++) {
      kai[(int)i] = (i * kai[(int)i - 1]) % MOD;
    }
    for(int i = 0; i < n; i++) {
      long ma = 0;
      long mi = 0;
      if(i >= (int)(k - 1)) {
        long t = kai[i];
        long t1 = func(kai[(int)(k - 1)], MOD - 2);
        long t2 = func(kai[(int)(i - k + 1)], MOD - 2);
        t = (t * t1) % MOD;
        t = (t * t2) % MOD;
        ma = t;
      }
      if(i <= (int)(n - k)) {
        long t = kai[(int)(n - 1 - i)];
        long t1 = func(kai[(int)(k - 1)], MOD - 2);
        long t2 = func(kai[(int)(n - i - k)], MOD - 2);
        t = (t * t1) % MOD;
        t = (t * t2) % MOD;
        mi = t;         
      }
      ans = (ans + ((ma * a[i]) % MOD)) % MOD;
      ans = (ans + MOD - ((mi * a[i]) % MOD)) % MOD;
    }
    System.out.println(ans);
  }

  public static long func(long a, long x) {
    if(x == 0) return 1;
    if((x % 2) == 0) {
      long t = func(a, x / 2);
      return (t * t) % MOD;
    } else {
      long t = func(a, x / 2);
      t = (t * t) % MOD;
      return (a * t) % MOD;
    }
  }
}