import java.util.*;

public class Main {
  public static long MOD = (long)Math.pow(10, 9) + 7;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long m = sc.nextLong();
    HashMap<Long, Long> map = new HashMap<Long, Long>();
    long s = m;
    for(long i = 2; i * i <= m; i++) {
      while(s % i == 0) {
        s /= i;
        if(map.containsKey(i)) {
          map.put(i, map.get(i) + 1);
        } else {
          map.put(i, (long)1);
        }
      } 
    }
    if(s != 1) map.put(s, (long)1);
    long ans = 1;
    for(long key : map.keySet()) {
      long k = map.get(key);
      long t1 = 1;
      long t2 = 1;
      long t3 = 1;
      for(long i = 1; i <= n + k - 1; i++) {
        t1 = (t1 * i) % MOD;
      }
      for(long i = 1; i <= k; i++) {
        t2 = (t2 * i) % MOD;
      }
      for(long i = 1; i <= n - 1; i++) {
        t3 = (t3 * i) % MOD;
      }
      ans = (ans * t1) % MOD;
      ans = (ans * func(t2, MOD - 2)) % MOD;
      ans = (ans * func(t3, MOD - 2)) % MOD;
    }
    if(m == 1) ans = 1;
    System.out.println(ans);
  }
  public static long func(long a, long t) {
    if(t > 1) {
    if(t % 2 == 0) {
      long c = func(a, t / 2);
      return ((c * c) % MOD);
    } else {
      return ((a * func(a, t - 1)) % MOD);
    }
    } else {
      return a % MOD;
    }
  }
}