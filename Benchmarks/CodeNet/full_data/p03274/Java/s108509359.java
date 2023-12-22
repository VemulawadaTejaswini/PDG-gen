import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N,K;
    N = sc.nextInt();
    K = sc.nextInt();
    int ans = 1000000007;
    int tmp;
    Integer x[] = new Integer[N];
    for(int i=0; i<N; i++) x[i] = sc.nextInt();
    for(int i=0; i<N-K+1; i++){
      int a = Math.abs(x[i]) + Math.abs(x[i+K-1] - x[i]);
      int b = Math.abs(x[i+K-1]) + Math.abs(x[i+K-1] - x[i]);
      tmp = Math.min(a,b);
      ans = Math.min(ans, tmp);
    }
    System.out.println(ans);
  }
  
  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}