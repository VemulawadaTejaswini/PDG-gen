import java.util.*;

public class Main {
  public static long MOD = (long)Math.pow(10, 9) + 7;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long m = sc.nextLong();
    long[] kai = new long[1000001];
    kai[0] = 1;
    for(int i = 1; i <= 1000000; i++) {
      kai[i] = (kai[i - 1] * (long)i) % MOD;
    }
    HashMap<Long, Long> map = new HashMap<Long, Long>();
    for(long i = 2; (i * i) <= m; i++) {
      if((m % i) == 0) {
        long t = 0;
        while((m % i) == 0) {
          t++;
          m /= i;
        }
        map.put(i, t);
      }
    }
    if(m > 1) map.put(m, (long)1);
    long ans = 1;
    for(long key : map.keySet()) {
      long s = map.get(key);
      long t1 = kai[(int)(s + n - 1)];
      long t2 = kai[(int)s];
      long t3 = kai[(int)(n - 1)];
      t2 = func(t2, MOD - 2);
      t3 = func(t3, MOD - 2);
      ans = (ans * t1) % MOD;
      ans = (ans * t2) % MOD;
      ans = (ans * t3) % MOD;
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