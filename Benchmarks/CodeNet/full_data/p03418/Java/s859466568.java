import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();

    long count = 0;
    for (int b = K + 1; b <= N; b++) {
      long r = f(N - K, b) - f(N - b, b) + b - K;
      if (K == 0) r--;
      count += r;
    }
    System.out.println(count);
  }

  private static long f(long x, long y) {
    long p = x / y;
    long q = x % y;
    return (p - 1) * p * y / 2 + p * (q + 1);
  }
}
