import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    long N = sc.nextLong();
    long M = sc.nextLong();
    long ans;
    if(N == 1){
      if(M == 1) ans = 1;
      else ans = M - 2;
    }
    else if(N == 2) ans = 0;
    else{
      if(M == 1) ans = N - 2;
      else ans = N * M - 2 * (M+N) + 4;
    }
    out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}