import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long ans = 1;
    for(int i = 0; i < n; i++) {
      long t = sc.nextLong();
      long u = gcd(t, ans);
      ans = t * (ans / u);
    }
    
    System.out.println(ans);
  }
  
  public static long gcd(long a, long b) {
    if(b == 0) return a;
    return gcd(b, a % b);
  }
}