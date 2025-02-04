import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    int N = sc.nextInt();
    int scale = 1;
    if (D == 1) {
      scale = 100;
    } else if (D == 2) {
      scale = 10000;
    }
    if (N == 100) {
      N = 101;
    }
    int ans = scale * N;
    System.out.println(ans);
  }

  private static final long MOD = 998244353;
  private static long FACT[];
  private static long IFACT[];

  // Pre-calculate factorial and its mod_inverse for calculate nCr in O(1)
  private static void create_fact(int N) {
    FACT = new long[N+1];
    IFACT = new long[N+1];
    FACT[0] = 1;
    IFACT[0] = 1;
    for (int i=1; i<=N; i++) {
      FACT[i] = FACT[i-1] * i % MOD;
      IFACT[i] = mod_inverse(FACT[i]);
    }
  }

  // Return nCr
  private static long comb(int n, int r) {
    if (n < 0 || r < 0 || n < r) {
      return 0;
    }
    if (r > n/2) {
      r = n - r;
    }
    return FACT[n]*IFACT[n-r]%MOD*IFACT[r]%MOD;
  }

  // Fast mod inverse
  private static long mod_inverse(long a) {
    long b = MOD;
    long p = 1, q = 0;
    while (b > 0) {
      long c = a / b;
      long d;
      d = a;
      a = b;
      b = d % b;
      d = p;
      p = q;
      q = d - c * q;
    }
    return p < 0 ? p + MOD : p;
  }
}
