import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();

    long min = Math.min(b / c, b / d) + 1;

    long m = lcm(c ,d);

    long x = b - a + 1;
    long y = (b / c) - (a - 1) / c;
    long z = (b / d) - (a - 1) / d;
    long w = (b / m) - (a - 1) / m;
    long ans = x - y - z + w;
    System.out.println(ans);
  }
  
  private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
  }

  private static long lcm(long m, long n) {
      return m * n / gcd(m, n);
  }

}
