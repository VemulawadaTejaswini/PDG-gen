import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long X = sc.nextLong();
    long[] x = new long[N];
    for (int i = 0; i < N; i++) {
      x[i] = sc.nextLong();
    }
    long ans = Math.abs(X - x[0]);
    for (int i = 1; i < N; i++) {
      ans = gcd(ans, Math.abs(X - x[i]));
    }
    System.out.println(ans);
  }

  public static long gcd(long a, long b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
}