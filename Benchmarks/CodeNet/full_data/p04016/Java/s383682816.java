import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextLong();
    long s = scanner.nextLong();
    if(n < s) {
      System.out.println(-1);
    } else if(n == s) {
      System.out.println(n+1);
    } else if(s == 1) {
      if(n > Math.pow(10, 11)) System.out.println(-1);
      else if(n == 1) System.out.println(2);
      else System.out.println(n);
    } else {
      boolean ok = false;
      double sqrtN = Math.sqrt(n);
      for(long i=2;i<sqrtN;i++) {
        if(f(i, n) == s) {
          System.out.println(i);
          ok = true;
          break;
        }
      }
      if(!ok) {
        for(long p=1;p<=sqrtN;p++) {
          if((n-s)%p != 0) continue;
          long b = (n-2)/p+1;
          if(f(b, n) == s) {
            System.out.println(b);
            ok = true;
            break;
          }
        }
      }
      if(!ok) System.out.println(-1);
    }

    scanner.close();
  }

  private static long f(long b, long n) {
    long ret = (n<b)? n : (f(b, (long)Math.floor(n/b))+n%b);
    return ret;
  }
}
