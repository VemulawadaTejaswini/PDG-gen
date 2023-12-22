import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();

    long min = minDiff3(divide3(H), W);
    min = Math.min(min, minDiff3(divide3(W), H));
    min = Math.min(min, minDiff2(divide2(H), W));
    min = Math.min(min, minDiff2(divide2(W), H));
    System.out.println(min);
  }

  private static long minDiff3(int[] d, long o) {
    Arrays.sort(d);
    return Math.max(d[1] - d[0], d[2] - d[1]) * o;
  }

  private static long minDiff2(int[] d, long o) {
    long diff = Long.MAX_VALUE;
    for (long i = 1; i < o; i++) {
      diff = Math.min(diff, maxDiff(d[0] * i, d[1] * i, (d[0] + d[1]) * (o - i)));
    }
    return diff;
  }

  private static long maxDiff(long a, long b, long c) {
    if (a > b) return maxDiff(b, a, c);
    if (b > c) return maxDiff(a, c, b);
    return c - a;
  }

  private static int[] divide2(int n) {
    return new int[]{n / 2, n - n / 2};
  }

  private static int[] divide3(int n) {
    int[] d1 = new int[]{0, 0, n / 3};
    int[] d2 = divide2(n - n / 3);
    System.arraycopy(d2, 0, d1, 0, 2);
    return d1;
  }
}
