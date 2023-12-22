import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] T = new long[100];
    for (int i = 0; i < N; i++) {
      T[i] = sc.nextLong();
    }
    long ans = 1;
    for (int i = 0; i < N; i++) {
      ans = lcm(ans, T[i]);
    }
    System.out.println(ans);
  }

  public static long gcd(long a, long b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  public static long lcm(long a, long b) {
    return (a / gcd(a, b)) * b;
  }
}
