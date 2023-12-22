import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] a = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      a[i] = scanner.nextInt();
    }

    boolean[][] dp1 = new boolean[N + 1][K + 1];
    for (int i = 0; i <= N; i++) dp1[i][0] = true;
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= K; j++) {
        dp1[i][j] = dp1[i - 1][j] || (j >= a[i] && dp1[i - 1][j - a[i]]);
      }
    }

    boolean[][] dp2 = new boolean[N + 2][K + 1];
    for (int i = 0; i <= N + 1; i++) dp2[i][0] = true;
    for (int i = N; i >= 1; i--) {
      for (int j = 1; j <= K; j++) {
        dp2[i][j] = dp2[i + 1][j] || (j >= a[i] && dp2[i + 1][j - a[i]]);
      }
    }

    int count = 0;
    for (int i = 1; i <= N; i++) {
      int min = Math.max(0, K - a[i]);
      for (int k = min; k < K; k++) {
        if (dp1[N][k] && (dp1[i - 1][k] || dp2[i + 1][k])) {
          count++;
          break;
        }
      }
    }
    System.out.println(N - count);
  }
}
