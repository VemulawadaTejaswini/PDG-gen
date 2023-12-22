import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long k = sc.nextLong();
    long[] a = new long[n];
    long g = 1;
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      if(i == 0) {
        g = a[0];
      } else {
        g = gcd(g, a[i]);
      }
    }
    String ans = "IMPOSSIBLE";
    for(int i = 0; i < n; i++) {
      if(a[i] >= k) {
        if(((a[i] - k) % g) == 0) ans = "POSSIBLE";
      }
    }
    System.out.println(ans);
  }

  public static long gcd(long a, long b) {
    if(b == 0) return a;
    return gcd(b, a % b);
  }
}
