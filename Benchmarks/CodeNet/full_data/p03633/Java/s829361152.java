import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    long[] T = new long[N];
    for (int i = 0; i < N; i++) {
      T[i] = scanner.nextLong();
    }

    long ans = 1;
    for (int i = 0; i < N; i++) {
      ans = lcm(ans, T[i]);
    }

    System.out.printf("%d", ans);
  }

  public static long gcd(long a, long b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  public static long lcm(long a, long b) {
    return a * b * gcd(a, b);
  }
}