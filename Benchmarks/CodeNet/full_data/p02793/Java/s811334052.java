import java.math.*;
import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    sc.close();

    BigInteger lcm = Arrays.stream(A).parallel()
        .mapToObj(BigInteger::valueOf)
        .reduce(BigInteger.ONE, (a, b) -> a.divide(a.gcd(b)).multiply(b));

//    Map<Integer, Integer> lcm = new HashMap<>();
//    for (int ai : A)
//      for (Map.Entry<Integer, Integer> fAi : f(ai).entrySet())
//        lcm.put(fAi.getKey(), Math.max(lcm.getOrDefault(fAi.getKey(), 0), fAi.getValue()));

    long mod = 1000000007;

//    long modLcm = 1;
//    for (Map.Entry<Integer, Integer> lcm_p : lcm.entrySet())
//      modLcm = (modLcm * modPow(lcm_p.getKey(), lcm_p.getValue(), mod)) % mod;

    long modLcm = lcm.remainder(BigInteger.valueOf(mod)).longValue();

    long ans = 0;
    for (int ai : A)
      ans = (ans + modDiv(modLcm, ai, mod)) % mod;

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
}