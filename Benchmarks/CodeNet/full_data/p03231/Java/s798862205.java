import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());

    String S = sc.next();
    String T = sc.next();

    long ans = lcm(N, M);
    int times = (int) gcd(N, M);

    int n = (int) (ans / N);
    int m = (int) (ans / M);

    for (int i = 0; i < times; i++) {
      if (S.charAt(i * m) != T.charAt(i * n)) {
        ans = -1;
      }
    }

    System.out.println(ans);
  }

  private static long gcd(long m, long n) {
    if (m < n)
      return gcd(n, m);
    if (n == 0)
      return m;
    return gcd(n, m % n);
  }

  private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
  }
}