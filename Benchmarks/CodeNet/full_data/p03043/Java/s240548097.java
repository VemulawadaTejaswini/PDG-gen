import java.util.*;

class Main {
  public static final long MOD = 1000000007;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int a;
    double tmp;
    double ans = 0;
    double Z = N;
    for(int i=N; i>0; i--){
      tmp = 1;
      a = i;
      while(a < K){
        tmp /= 2;
        a *= 2;
      }
      ans += 1/Z * tmp; 
    }
    System.out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}