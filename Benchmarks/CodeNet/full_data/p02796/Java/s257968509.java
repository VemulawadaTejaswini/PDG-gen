import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Range[] ranges = new Range[N];
    for (int i = 0; i < N; i++) {
      int X = scanner.nextInt();
      int L = scanner.nextInt();
      ranges[i] = new Range(X - L, X + L);
    }
    Arrays.sort(ranges, (r1, r2) -> {
      if (r1.right != r2.right) return r1.right - r2.right;
      return r2.left - r1.left;
    });
    int count = 1;
    int current = ranges[0].right;
    for (int i = 1; i < N; i++) {
      if (ranges[i].left >= current) {
        count++;
        current = ranges[i].right;
      }
    }
    System.out.println(count);
  }

  private static class Range {
    private final int left;
    private final int right;

    private Range(int left, int right) {
      this.left = left;
      this.right = right;
    }
  }
}
