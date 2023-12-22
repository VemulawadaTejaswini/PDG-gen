import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    long T[] = new long[N];
    long ans = 1;
    for(int i=0; i<N; i++){
      T[i] = sc.nextLong();
      ans = lcm(ans, T[i]);
    }
    out.println(ans);
  }
  
  public static long lcm(long a, long b){
    return a / gcd(a, b) * b;
  }

  public static long gcd(long a, long b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}