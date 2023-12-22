import java.util.*;
import java.math.*;

public class Main{
  public static final int MOD = 1000000007;
 
  static long[] fac, finv, inv;

  static void init(int MAX){
    fac  = new long[MAX];
    finv = new long[MAX];
    inv  = new long[MAX];

    fac[0]  = fac[1]  = 1;
    finv[0] = finv[1] = 1;
    inv[1]  = 1;
    for(int i=2; i<MAX; i++){
      fac[i]  = fac[i-1] * i % MOD;
      inv[i]  = MOD - inv[MOD%i] * (MOD/i) % MOD;
      finv[i] = finv[i-1] * inv[i] % MOD;
    }
  }

  static long COM(int n, int k){
    if(n < k)return 0;
    if(n < 0 || k < 0) return 0;
    return fac[n] * (finv[k] * finv[n-k] % MOD) % MOD;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    int r2 = sc.nextInt();
    int c2 = sc.nextInt();
    
    init(r2 + c2 + 3);
    long ans = (MOD + COM(r2 + c2 + 2, c2 + 1)) % MOD;
    ans = (MOD + ans - COM(r2 + c1 + 1, c1)) % MOD;
    ans = (MOD + ans - COM(r1 + c2 + 1, c2)) % MOD;
    ans = (MOD + ans + COM(r1 + c1, c1)) % MOD;
    System.out.println(ans);
  }
}
