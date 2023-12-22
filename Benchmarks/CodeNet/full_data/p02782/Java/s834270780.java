import java.io.*;

public class Main {

  static final long MOD = 1000000007L;
  static final int MAX = 200001;

  static long[] fac = new long[MAX];
  static long[] finv = new long[MAX];

  static long powerMOD(long a, long b){
    long result = 1L;
    while(b > 0){
      if(b % 2 == 1) result = (result * a) % MOD;
      a = (a * a) % MOD;
      b = (b>>1);
    }
    return result;
  }

  static void combIni(){
    fac[0] = 1; fac[1] = 1;
    finv[0] = 1; finv[1] = 1;
    for(int i = 2; i < MAX; i++){
      fac[i] = fac[i-1] * i % MOD;
      finv[i] = finv[i-1] * powerMOD(i, MOD - 2) % MOD;
    }
  }

  static long combMOD(int n, int r){
    if(n < r) return 0;
    if(n < 0 || r < 0) return 0;
    if(r == 0) return 1;
    return fac[n] * (finv[r] * finv[n-r] % MOD) % MOD;
  }

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] in1 = br.readLine().split(" ");
    int r1 = Integer.parseInt(in1[0]);
    int c1 = Integer.parseInt(in1[1]);
    int r2 = Integer.parseInt(in1[2]);
    int c2 = Integer.parseInt(in1[3]);

    br.close();

    combIni();

    long ans = (combMOD(r2 + c2 + 2, r2 + 1) - 1
      + combMOD(r1 + c1, r1) - 1) % MOD;
    ans -= (combMOD(r1 + c2 + 1, r1) - 1 + combMOD(r2 + c1 + 1, c1) - 1) % MOD;
    while(ans < 0) ans += MOD;
    ans %= MOD;

    System.out.println(ans);
  }
}