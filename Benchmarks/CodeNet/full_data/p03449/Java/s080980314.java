import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    Integer A[][] = new Integer[2][N];
    Integer Aone[] = new Integer[N+1];
    Integer Atwo[] = new Integer[N+1];
    Aone[0] = 0;
    Atwo[0] = 0;
    for(int i=0; i<N; i++){
      A[0][i] = sc.nextInt();
      Aone[i+1] = Aone[i] + A[0][i];
    }
    for(int i=0; i<N; i++){
      A[1][i] = sc.nextInt();
      Atwo[i+1] = Atwo[i] + A[1][i];
    }
    int ans = 0;
    int tmp;
    for(int i=1; i<N+1; i++){
      tmp = Aone[i] + Atwo[N] - Atwo[i-1];
      ans = Math.max(ans, tmp);
    }
    out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}