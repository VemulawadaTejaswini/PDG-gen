import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long[][] a = new long[N][N];
    for (int i = 0; i < N; i++) a[0][i] = scanner.nextInt();
    long cost = 0;
    for (int i = 1; i < N; i++) {
      int k = 0;
      long min = Long.MAX_VALUE;
      for (int j = 0; j <= N - i - 1; j++) {
        long s = a[i - 1][j] + a[i - 1][j + 1];
        if (s < min) {
          min = s;
          k = j;
        }
      }
      for (int j = 0; j < N - 1; j++) {
        if (j < k) {
          a[i][j] = a[i - 1][j];
        } else if (j == k) {
          a[i][j] = a[i - 1][j] + a[i - 1][j + 1];
          cost += a[i][j];
        } else {
          a[i][j] = a[i - 1][j + 1];
        }
      }
    }
    System.out.println(cost);
  }
}
