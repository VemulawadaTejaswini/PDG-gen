import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();
    long e = (c * d) / gcd(c, d);
    long ans = 0;
    if(a == 1) {
      long t = (b / c);
      t += (b / d);
      t -= (b / e);
      ans = (b - t);
    } else {
      long t1 = (b / c);
      t1 += (b / d);
      t1 -= (b / e);
      long t2 = ((a - 1) / c);
      t2 += ((a - 1) / d);
      t2 -= ((a - 1) / e);      
      ans = (b - t1 + t2 - a + 1);      
    }
    System.out.println(ans);
  }

  public static long gcd(long x, long y) {
    if(y == 0) return x;
    return gcd(y, (x % y));
  }
}