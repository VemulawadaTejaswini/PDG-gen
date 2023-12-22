import java.io.*;

public class Main {

  static final long MOD = 1000000007;
  static long n, k, ans;

  static long fastPowMOD(long base, long expo){
    long ret = 1;
    base %= MOD;
    while(expo > 0){
      if(expo % 2 == 1){
        ret *= base;
      }
      expo >>= 1;
      base *= base;
      base %= MOD;
      ret %= MOD;
    }
    return ret;
}

  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in = br.readLine().split(" ");
    n = Long.parseLong(in[0]);
    k = Long.parseLong(in[1]);

    br.close();

    ans = fastPowMOD(k, n);
    long[] occupied = new long[(int)(k + 1)];

    for(long i = k; i >= 2; i--){
      long num = k / i;
      long pat = (fastPowMOD(num, n) - occupied[(int)i]) % MOD;
      if(pat < 0) pat += MOD;
      ans += (pat * (i - 1)) % MOD;
      ans %= MOD;

      long tmp = i;
      for(long j = 2; j * j <= tmp; j++){
        if(tmp % j == 0){
          occupied[(int)j] += pat;
          occupied[(int)j] %= MOD;
          if(tmp / j != j){
            occupied[(int)(tmp / j)] += pat;
            occupied[(int)(tmp / j)] %= MOD;
          }
        }
      }
    }

    System.out.println(ans);

  }
}