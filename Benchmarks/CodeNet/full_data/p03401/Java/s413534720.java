import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    Integer A[] = new Integer[N+2];
    A[0] = 0;
    for(int i=1; i<N+1; i++) A[i] = sc.nextInt();
    A[N+1] = 0;
    Integer B[] = new Integer[N+1];
    int sum = 0;
    for(int i=0; i<N+1; i++){
      B[i] = Math.abs(A[i+1] - A[i]);
      sum += B[i];
    }
    int ans;
    for(int i=1; i<N+1; i++){
      ans = sum - B[i-1] - B[i] + Math.abs(A[i+1] - A[i-1]);
      out.println(ans);
    }
    
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}