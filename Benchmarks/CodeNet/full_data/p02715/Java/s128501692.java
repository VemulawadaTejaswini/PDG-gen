import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    long MOD = (long)Math.pow(10, 9) + 7;
    long[] dp = new long[(int)k + 1];
    for(long i = k; i >= 1; i--) {
      long t = k / i;
      long s = func(t, n);
      long u = 0;
      for(long j = (2 * i); j <= k; j += i) {
        u = (u + dp[j]) % MOD;
      }
      dp[(int)i] = (s + MOD - u) % MOD; 
    }
    long ans = 0;
    for(long i = 1; i <= k; i++) {
      long t = (i * dp[(int)i]) % MOD;
      ans = (ans + t) % MOD;
    }
    System.out.println(ans);
  }

  public static long func(long a, long x) {
    if(x == 0) return 1;
    if((x % 2) == 0) {
      long t = func(a, x / 2);
      return (t * t) % MOD;
    } else {
      return (a * func(a, x - 1)) % MOD;
    }
  }
}