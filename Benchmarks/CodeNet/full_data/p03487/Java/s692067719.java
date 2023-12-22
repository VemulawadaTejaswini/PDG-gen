import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    Integer a[] = new Integer[N];
    Integer count[] = new Integer[N+1];
    Arrays.fill(count, 0);
    int ans = 0;
    for(int i=0; i<N; i++){
      a[i] = sc.nextInt();
      if(a[i] > N) ans++;
      else{
        count[a[i]]++;
      }
    }
    for(int i=1; i<N+1; i++){
      if(count[i] < i) ans += count[i];
      else ans += count[i] - i;
    }
    out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}