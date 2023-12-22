import java.util.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    Integer L[] = new Integer[M];
    Integer R[] = new Integer[M];
    for(int i=0; i<M; i++){
      L[i] = sc.nextInt();
      R[i] = sc.nextInt();
    }
    int left = L[0];
    int right = R[0];
    for(int i=1; i<M; i++){
      if(left < L[i]) left = L[i];
      if(right > R[i]) right = R[i];
    }
    int ans;
    if(left > right) ans = 0;
    else ans = right - left + 1;
    System.out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}