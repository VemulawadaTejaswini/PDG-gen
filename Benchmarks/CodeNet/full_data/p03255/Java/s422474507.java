import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int X = scanner.nextInt();
    int[] x = new int[N];
    for (int i = 0; i < N; i++) {
      x[i] = scanner.nextInt();
    }

    long min = Long.MAX_VALUE;
    for (int k = 1; k <= N; k++) {
      long e = compute(x, k);
      e += k * X;
      e += N * X;
      if (min > e) min = e;
    }
    System.out.println(min);
  }

  private static long compute(int[] x, int k) {
    long e = 0;
    for (int i = 0; i < x.length; i++) {
      long co = 5;
      if (i > k) {
        co = (i / k + 1) * 2 + 1;
      }
      e += co * x[x.length - i - 1];
    }
    return e;
  }
}
