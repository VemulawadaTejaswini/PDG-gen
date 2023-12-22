import java.util.*;

class Main {
  public static final int mod = 1000000007;
  public static final int fmax = 1000007;
  public static long fac[] = new long[fmax];
  public static long inv[] = new long[fmax];
  public static long finv[] = new long[fmax];
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    
    int u = 0;
    int v = 0;
    int ai = 0;
    int aj = 0;
    boolean flg = false;
    int k = 0;
    
    NCRinit();
    
    if((x+y)%3 == 0){
      k = (x+y)/3;
    } else {
      System.out.println("0");
      return;
    }
    
    for(int i=0; i<x; i++){
      u = 2*i;
      v = i;
      if(u==x-(k-i) && v==y-2*(k-i)){
        flg = true;
        ai = i;
        aj = k-i;
      }
      if(flg) break;
    }
    
    if(ai < 0 || aj < 0 || !flg){
      System.out.println("0");
      return;
    }
    
    long ans = ncr(ai+aj, ai);
    
    System.out.println(ans);
    
  }
  
  // テーブルを作る前処理
  public static void NCRinit() {
    fac[0] = fac[1] = 1;
    finv[0] = finv[1] = 1;
    inv[1] = 1;
    for (int i = 2; i < fmax; i++){
      fac[i] = fac[i - 1] * i % mod;
      inv[i] = mod - inv[mod%i] * (mod / i) % mod;
      finv[i] = finv[i - 1] * inv[i] % mod;
    }
  }

  // 二項係数計算
  public static long ncr(int n, int k){
    if (n < k) return 0;
    if (n < 0 || k < 0) return 0;
    return fac[n] * (finv[k] * finv[n - k] % mod) % mod;
  }
  
}
