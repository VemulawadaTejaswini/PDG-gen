import java.util.Scanner;

class Main {
  private static final int mod = 2019;
  private static void solve(long l, long r) {
    if (r - l >= 2018) {
      System.out.println(0);
      return;
    }
    Long min1 = null;
    Long min2 = null;
    for (long i = l; i <= r; i++) {
      long m = i % mod;
      if (min1 == null) {
        min1 = m;
      } else if (m < min1) {
        min2 = min1;
        min1 = m;
      } else if (min2 == null || m < min2) {
        min2 = m;
      }
    }
    System.out.println((min1 * min2) % mod);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long l = sc.nextLong();
    long r = sc.nextLong();
    solve(l, r);
  }
}