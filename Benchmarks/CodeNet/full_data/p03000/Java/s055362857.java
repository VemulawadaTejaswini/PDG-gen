import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int L[] = new int[N];
    for(int i=0; i<N; i++) L[i] = sc.nextInt();
    int ans = 1;
    int number = 0;
    for(int i=0; i<N; i++){
      number += L[i];
      if(number > X) break;
      ans++;
    }
    out.println(ans);
      
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}