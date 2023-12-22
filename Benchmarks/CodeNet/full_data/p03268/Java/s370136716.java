import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N,K;
    N = sc.nextLong();
    K = sc.nextLong();
    int a,b;
    a = N / K;
    long ans;
    ans = a * a * a;
    if(K % 2L == 0L){
      b = (N + K/2L) / K;
      ans += b * b * b;
    }
    System.out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}