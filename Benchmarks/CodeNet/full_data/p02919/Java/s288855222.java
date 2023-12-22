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
    
    in1 = br.readLine().split(" ");
    int[] P = Stream.of(in1).mapToInt(Integer::parseInt).toArray();
    br.close();

    combIni();

    int[] posInP = new int[N];
    
    for(int i = 0; i < N; i++){
      P[i]--;
      posInP[P[i]] = i;
    }

    Set<Integer> largeNumPos = new HashSet<>();
    largeNumPos.add(posInP[N-1]);
    int ans = 0;

    for(int i = N-2; i >= 0; i--){
      int j = posInP[i];
      int rLim1 = j + 1;
      int lLim1 = j - 1;
      for(; rLim1 < N; rLim1++){
        if(largeNumPos.contains(rLim1)) break;
      }
      for(; lLim1 >= 0; lLim1--){
        if(largeNumPos.contains(lLim1)) break;
      }

      int rLim2 = rLim1+1;
      int lLim2 = lLim1-1;
      if(rLim1 < N){
        for(; rLim2 < N; rLim2++){
          if(largeNumPos.contains(rLim2)) break;
        }
        ans += (i + 1) * (j - lLim1) * (rLim2 - rLim1);
      }
      if(lLim1 >= 0){
        for(; lLim2 >= 0; lLim2--){
          if(largeNumPos.contains(lLim2)) break;
        }
        ans += (i + 1) * (lLim1 - lLim2) * (rLim1 - j);
      }

      largeNumPos.add(j);
    }

    System.out.println(ans);
  }
}