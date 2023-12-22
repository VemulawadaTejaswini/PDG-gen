import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    Integer C[] = new Integer[N-1];
    Integer S[] = new Integer[N-1];
    Integer F[] = new Integer[N-1];
    for(int i=0; i<N-1; i++){
      C[i] = sc.nextInt();
      S[i] = sc.nextInt();
      F[i] = sc.nextInt();
    }
    for(int i=0; i<N-1; i++){
      int ans = S[i] + C[i];
      for(int j=i+1; j<N-1; j++){
        if(ans < S[j]) ans = S[j];
        else if(ans % F[j] != 0) ans = ans + F[j] - (ans % F[j]);
        ans += C[j];
      }
      out.println(ans);
    }
    out.println(0);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}