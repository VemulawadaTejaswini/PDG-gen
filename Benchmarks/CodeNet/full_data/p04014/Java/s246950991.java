import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long s = sc.nextLong();
    long ans = (long)Math.pow(10, 15);
    for(long b = 2; (b * b) <= n; b++) {
      long t = 0;
      long u = n;
      while(u > 0) {
        t += (u % b);
        u /= b;
      }
      if(t == s) {
        ans = Math.min(ans, b);
        break;
      }
    }
    if(ans == (long)Math.pow(10, 15)) {
      // pb + q = n, p + q = s
      for(long p = 0; (p * p) <= n; p++) {
        long q = s - p;
        if(q >= 0) {
          if(p == 0) {
            if(n == s) {
              ans = Math.min(ans, n + 1);
            }
          } else {
            if(p == 0) {
              if(n == s) {
                ans = Math.min(ans, n + 1);
              }
            } else { 
              long d = n - q;
              long b = d / p;
              long t = 0;
              long y = n;
              while(y > 0) {
                t += (y % b);
                y /= b;
              }
              if(t == s) {
                ans = Math.min(ans, b);
              }
            }
          }
        }
      } 
    }
    if(ans == (long)Math.pow(10, 15)) ans = -1;
    System.out.println(ans);
  }
}