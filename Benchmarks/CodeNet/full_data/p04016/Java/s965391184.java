import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long s = sc.nextLong();
    long ans = (long)Math.pow(10, 12);
    for(long b = 2; (b * b) <= n; b++) {
      long t = n;
      long c = 0;
      while(t > 0) {
        c += (t % b);
        t /= b;
      }
      if(c == s) {
        ans = b;
        break;
      }
    }
    for(long p = 1; (p * p) < n; p++) {
      long q = s - p;
      if((q > 0) && (n > q) && (((n - q) % p) == 0)) {
        long b = (n - q) / p;
        if((b > p) && (b > q)) {
          long t = n;
          long c = 0;
          while(t > 0) {
            c += (t % b);
            t /= b;
          }
          if(c == s) ans = Math.min(ans, b);
        }
      }
    }
    if(s == 1) ans = Math.min(ans, n);
    if(n == s) ans = Math.min(ans, n + 1);
    if(ans == (long)Math.pow(10, 12)) ans = -1;
    System.out.println(ans);
  }
}
