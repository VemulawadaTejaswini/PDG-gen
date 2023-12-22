import java.util.*;

class Main {
  public static final long MOD = 1000000007;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    Integer A[] = new Integer[N];
    for(int i=0; i<N; i++){
      A[i] = sc.nextInt();
    }
    int ans;
    ans = (N-2) / (K-1) + 1;
    System.out.println(ans);
    
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}