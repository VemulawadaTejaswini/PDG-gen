import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

    int K = N / min + 1;
    boolean[][] dp = new boolean[K + 1][N + 1];
    int[][] digits = new int[K + 1][N + 1];
    dp[0][0] = true;
    for (int i = 1; i <= K; i++) {
      for (int j = 0; j <= N; j++) {
        for (int k = 0; k < M; k++) {
          if (dp[i - 1][j] && j + cost[a[k]] <= N) {
            dp[i][j + cost[a[k]]] = true;
            digits[i][j + cost[a[k]]] = a[k];
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
    List<Integer> list = new ArrayList<>();
    while (KM > 0) {
      int d = digits[KM][N];
      list.add(d);
      KM--;
      N -= cost[d];
    }
    Collections.sort(list);
    StringBuilder sb = new StringBuilder();
    for (int i = list.size() - 1; i >= 0; i--) sb.append(list.get(i));
    System.out.println(sb.toString());
  }
}
