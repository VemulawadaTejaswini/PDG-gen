import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N,K;
    N = sc.nextInt();
    K = sc.nextInt();
    int a,b;
    a = N / K;
    long ans;
    ans = a * a * a;
    if(K % 2 == 0){
      b = (N + K/2) / K;
      ans += b * b * b;
    }
    System.out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}