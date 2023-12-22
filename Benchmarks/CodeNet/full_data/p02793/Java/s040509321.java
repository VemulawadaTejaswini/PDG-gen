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
    }
    sc.close();

    for (int i = 0; i < N; i++) {
      fA[i] = f(A[i]);
    }

    for (int i = 0; i < N; i++)
      for (Map.Entry<Integer, Integer> a : fA[i].entrySet())
        lcm.put(a.getKey(), Math.max(lcm.getOrDefault(a.getKey(), 0), a.getValue()));

    long mod = 1000000007;
    long ans = 0;

    long modLcm = 1;
    for (Map.Entry<Integer, Integer> lcm_p : lcm.entrySet()) {
      modLcm = modLcm * modPow(lcm_p.getKey(), lcm_p.getValue(), mod) % mod;
    }

    for (int ai : A) {
      long bi = modDiv(modLcm, ai, mod);
      ans += bi;
      ans %= mod;
    }

    System.out.println(ans);
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

  private static Map<Integer, Integer> f(int n) {
    Map<Integer, Integer> f = new HashMap<>();
    int m = n;
    int s = SIEVE[m - 1];
    while (s != 0) {
      f.put(s, f.getOrDefault(s, 0) + 1);
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