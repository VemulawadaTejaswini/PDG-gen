import java.math.*;
import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    Map<Integer, Integer> fA[] = new Map[N];
    Map<Integer, Integer> lcm = new HashMap<>();
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      fA[i] = f(A[i]);
      for (Map.Entry<Integer, Integer> p : fA[i].entrySet())
        lcm.compute(p.getKey(), (k, v) -> v == null ? p.getValue() : Math.max(v, p.getValue()));
    }
    sc.close();

    long mod = 1000000007;
    long ans = 0;
    for (Map<Integer, Integer> f : fA) {
      long b = 1;
      for (Map.Entry<Integer, Integer> lcm_p : lcm.entrySet()) {
        int p = lcm_p.getKey();
        int pv = lcm_p.getValue();
        int fv = f.getOrDefault(lcm_p.getKey(), 0);
        for (int i = 0; i < pv - fv; i++) {
          b *= p;
          b %= mod;
        }
      }
      ans += b;
      ans %= mod;
    }
    System.out.println(ans);
  }

  private static Map<Integer, Integer> f(int n) {
    Map<Integer, Integer> f = new HashMap<>();
    int m = n;
    int s = SIEVE[m - 1];
    while (s != 0) {
      f.compute(s, (k, v) -> v == null ? 1 : v + 1);
      m /= s;
      s = SIEVE[m - 1];
    }
    return f;
  }

  private static int[] SIEVE = sieve(1000000);

  private static int[] sieve(int n) {
    int [] sieve = new int[n];
    for (int i = 2; i <= n; i += 2) sieve[i - 1] = 2;
    int sqrt = (int) Math.sqrt(n);
    for (int i = 3; i <= n; i += 2) {
      if (sieve[i - 1] == 0) sieve[i - 1] = i;
      if (i <= sqrt)
        for (int j = i * i; j <= n; j += i)
          if (sieve[j - 1] == 0) sieve[j - 1] = i;
    }
    return sieve;
  }
}