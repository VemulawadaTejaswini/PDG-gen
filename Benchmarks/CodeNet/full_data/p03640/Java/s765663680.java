import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int N = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();
    for (int i = 1; i < N; i++) a[i] += a[i - 1];
    int[][] res = new int[H][W];
    for (int i = 0; i < H * W; i++) {
      int x = i / W;
      int y = i % W;
      if (x % 2 == 1) y = W - y - 1;
      res[x][y] = lowerBound(a, i + 1) + 1;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) sb.append(res[i][j]).append(' ');
      sb.setLength(sb.length() - 1);
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }

  public static int lowerBound(int[] a, int k) {
    int left = -1;
    int right = a.length;
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (k <= a[mid]) {
        right = mid;
      } else {
        left = mid;
      }
    }
    return right;
  }
}
