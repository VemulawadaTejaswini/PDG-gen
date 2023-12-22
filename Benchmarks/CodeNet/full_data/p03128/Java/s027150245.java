import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[] a = new int[M];
    for (int i = 0; i < M; i++) a[i] = scanner.nextInt();

    int[] cost = new int[]{0, 2, 5, 5, 4, 5, 6, 3, 7, 6};

    int min = 8;
    for (int i = 0; i < M; i++) min = Math.min(min, cost[a[i]]);

    int K = N / min;
    boolean[][] dp = new boolean[K + 1][N + 1];
    int[] digits = new int[K + 1];
    dp[0][0] = true;
    for (int i = 1; i <= K; i++) {
      for (int j = 0; j <= N; j++) {
        for (int k = 0; k < M; k++) {
          if (dp[i - 1][j] && j + cost[a[k]] <= N) {
            dp[i][j + cost[a[k]]] = true;
            digits[i] = Math.max(digits[i], a[k]);
          }
        }
      }
    }
    int KM = 0;
    for (int i = K; i >= 0; i--) {
      if (dp[i][N]) {
        KM = i;
        break;
      }
    }
    int[] fdigits = Arrays.copyOfRange(digits, 1, KM + 1);
    Arrays.sort(fdigits);
    StringBuilder sb = new StringBuilder();
    for (int i = fdigits.length - 1; i >= 0; i--) sb.append(fdigits[i]);
    System.out.println(sb.toString());
  }
}
