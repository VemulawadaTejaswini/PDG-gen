import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[][] a = new int[N][N];
    for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) a[i][j] = scanner.nextInt();

    System.out.println(solve(N, a));
  }

  public static long solve(int N, int[][] a) {
    long dist = 0;
    for (int i = 0; i < N; i++) for (int j = i + 1; j < N; j++) dist += a[i][j];

    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        for (int k = 0; k < N; k++) {
          if (k == i || k == j) continue;
          if (a[i][j] > a[i][k] + a[k][j]) return -1;
          if (a[i][j] == a[i][k] + a[k][j]) {
            dist -= a[i][j];
            break;
          }
        }
      }
    }
    return dist;
  }
}
