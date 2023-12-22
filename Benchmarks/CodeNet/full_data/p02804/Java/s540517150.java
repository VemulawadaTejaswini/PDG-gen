import java.util.*;
import java.util.stream.*;
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
    int N = Integer.parseInt(in1[0]);
    int K = Integer.parseInt(in1[1]);
    
    in1 = br.readLine().split(" ");
    int[] A = Stream.of(in1).mapToInt(Integer::parseInt).toArray();
    br.close();

    combIni();

    Arrays.sort(A);

    long ans = 0, ma = 0, mi = 0;


    for(int i = 0; i <= N-K; i++){
      mi += (A[i] * combMOD(N - i - 1, K - 1)) % MOD;
      mi %= MOD;
    }

    for(int i = K-1; i < N; i++){
      ma += (A[i] * combMOD(i, K - 1)) % MOD;
      ma %= MOD;
    }

    ans = ma - mi;
    while(ans < 0) ans += MOD;
    ans %= MOD;

    System.out.println(ans);
  }
}