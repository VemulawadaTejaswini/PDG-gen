import java.util.*;
import java.math.*;
public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int M = 1000000007;
    long ao = 0;
    long aka = 0;
    for(int i=1; i<=K; i++){
      if(K-1<i-1 || N-K+1<i){
        System.out.println(0);
      } else {
        nckinit(M);
        ao = nck(K-1, i-1, M);
        aka = nck(N-K+1, i, M);
        System.out.println((ao * aka) % M);
      }
    }
  }

  static final int MAX = 10000000;
  static long[] fac = new long[MAX];
  static long[] inv = new long[MAX];
  static long[] finv = new long[MAX];

  static void nckinit(int MOD) {
    fac[0] = fac[1] = 1;
    finv[0] = finv[1] = 1;
    inv[1] = 1;
    for (int i = 2; i < MAX; i++){
      fac[i] = fac[i-1] * i % MOD;
      inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
      finv[i] = finv[i-1] * inv[i] % MOD;
    }
  }

  static long nck(int n, int k, int MOD) {
    if (n < k) return 0;
    if (n < 0 || k < 0) return 0;
    return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
  }
}

