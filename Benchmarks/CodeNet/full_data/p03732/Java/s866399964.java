import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int W = scanner.nextInt();

    int[] w = new int[N];
    long[] v = new long[N];

    for (int i = 0; i < N; i++) {
      w[i] = scanner.nextInt();
      v[i] = scanner.nextInt();
    }

    long[][] vw = new long[4][N + 1];
    for (int i = 0; i < N; i++) vw[w[i] - w[0]][i] = v[i];
    for (int i = 0; i < 4; i++) {
      Arrays.sort(vw[i]);
      reverse(vw[i], 1, N);
      for (int j = 1; j < N + 1; j++) vw[i][j] += vw[i][j - 1];
    }

    long max = 0;
    for (int a = 0; a <= N; a++) {
      for (int b = 0; b <= N - a; b++) {
        for (int c = 0; c <= N - a - b; c++) {
          for (int d = 0; d <= N - a - b - c; d++) {
            long tw = w[0] * a + (w[0] + 1) * b + (w[0] + 2) * c + (w[0] + 3) * d;
            long tv = vw[0][a] + vw[1][b] + vw[2][c] + vw[3][d];
            if (tw > W) continue;
            max = Math.max(max, tv);
          }
        }
      }
    }
    System.out.println(max);
  }

  private static void swap(long[] a, int i, int j) {
    long tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }

  private static void reverse(long[] a, int i, int j) {
    if (i > j) throw new IllegalArgumentException("i must be less than j");
    while (i < j) {
      swap(a, i, j);
      i++;
      j--;
    }
  }
}
