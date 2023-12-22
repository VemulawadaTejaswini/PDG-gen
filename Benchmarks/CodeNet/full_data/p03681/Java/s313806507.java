import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    long ans;
    if(Math.abs(N-M) > 1) ans = 0;
    else{
      if(N != M) ans = 1;
      else ans = 2;
      long s = 1;
      long t = 1;
      while(N > 0){
        s *= N;
        s %= MOD;
        N--;
      }
      while(M > 0){
        t *= M;
        t %= MOD;
        M--;
      }
      ans = s * t * ans % MOD;
    }
    out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}