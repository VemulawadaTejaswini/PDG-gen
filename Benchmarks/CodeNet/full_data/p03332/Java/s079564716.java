import java.util.Scanner;

public class Main {

  private static final long MOD = 998244353;
  private static long FACT[];
  private static long IFACT[];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long A = sc.nextInt();
    long B = sc.nextInt();
    long K = sc.nextLong();
    solve(N, A, B, K);
  }

  private static void solve(int N, long A, long B, long K) {
    FACT = new long[N+1];
    IFACT = new long[N+1];
    FACT[0] = 1;
    IFACT[0] = 1;
    for (int i=1; i<=N; i++) {
      FACT[i] = FACT[i-1] * i % MOD;
      IFACT[i] = inv(FACT[i]);
    }

    long ans = 0;
    /*
    for (int numA=0; numA<=N; numA++) {
      long rem = K - A*numA;
      if (rem < 0) {
        break;
      }
      int numB = (int)(rem/B);
      if ((long)A*numA+(long)B*numB == K && numB <= N) {
        ans = (ans + comb(N, numA) * comb(N, numB))%MOD;
      }
    }
    */
    long max = Math.min((long)N,K/A);
    for(int as=0;as<=max;++as){
      long bs = (K-A*as)/B;
      if(bs<=N && (A*(long)as + B*bs)==K){
        ans += comb(N,as) * comb(N,(int)bs);
        ans %= MOD;
      }
    }
    System.out.println(ans);
  }

  private static long comb(int n, int r) {
    if (n < 0 || r < 0 || n < r) {
      return 0;
    }
    if (r > n/2) {
      r = n - r;
    }
    return FACT[n]*IFACT[n-r]%MOD*IFACT[r]%MOD;
  }

  private static long inv(long a) {
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
