import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long m = sc.nextLong();
    long[] a = new long[n];
    long lc = 1;
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      a[i] /= 2;
      long g = gcd(lc, a[i]);
      lc = g * (lc / g) * (a[i] / g);
    }
    int p = 0;
    for(int i = 0; i < n; i++) {
      long s = (lc / a[i]);
      if((s % 2) == 0) p++;
    }
    long ans = 0;
    if(p > 0) {

    } else {
      long k = (m / lc);
      ans = (k + 1) / 2;
    }
    System.out.println(ans);
  }

  public static long gcd(long x, long y) {
    if(y == 0) return x;
    return gcd(y, (x % y));
  }
}