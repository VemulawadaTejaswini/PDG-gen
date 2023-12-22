import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    final int mod = 1_000_000_007;

    if (Math.abs(N - M) > 1) {
      System.out.println(0);
      return;
    }

    long ans = 1;
    ans *= factorial(N, mod);
    ans *= factorial(M, mod);
    ans %= mod;
    if (N == M) {
      ans *= 2;
      ans %= mod;
    }
    System.out.println(ans);
  }

  private static long factorial(int n, int mod) {
    long res = 1;
    while (n > 1) {
      res *= n;
      res %= mod;
      n--;
    }
    return res;
  }
}
