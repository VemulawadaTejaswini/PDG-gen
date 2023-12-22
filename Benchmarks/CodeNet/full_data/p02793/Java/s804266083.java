import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
  static long mod = 1000000000 + 7;

  static long modpow(long a, long x) {
    if(a == 0) return 0;
    if(x == 0) return 1;
    if(x % 2 == 0) {
      return modpow((a * a) % mod, x / 2) % mod;
    } else {
      return (modpow((a * a) % mod, x / 2) * a) % mod;
    }
  }

  static HashMap<Long, Long> factorization(long x) {
    HashMap<Long, Long> ans = new HashMap<Long, Long>();
    long i = 2;
    while(i <= x) {
      long count = 0;
      while(x % i == 0) {
        x = x / i;
        count++;
      }
      if(count > 0) ans.put(i, count);
      i++;
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] A = new long[N];
    for(int i = 0; i < N; i++) A[i] = sc.nextInt();
    HashMap<Long, Long> primes = new HashMap<Long, Long>();
    for(int i = 0; i < N; i++) {
      HashMap<Long, Long> factors = factorization(A[i]);
      for(Map.Entry<Long, Long> entry : factors.entrySet()) {
        if(primes.containsKey(entry.getKey())) {
          primes.put(entry.getKey(), Math.max(primes.get(entry.getKey()), entry.getValue()));
        } else {
          primes.put(entry.getKey(), entry.getValue());
        }
      }
    }
    long lcm = 1;
    for(Map.Entry<Long, Long> entry : primes.entrySet()) {
      lcm *= modpow(entry.getKey(), entry.getValue());
      lcm %= mod;
    }

    long ans = 0;
    for(int i = 0; i < N; i++) {
      ans += (modpow(A[i], mod - 2) * lcm) % mod;
      ans %= mod;
    }
    System.out.println(ans);
  }
}