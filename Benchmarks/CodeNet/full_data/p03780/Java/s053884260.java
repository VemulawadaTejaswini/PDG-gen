import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] a = new int[N + 1];
    for (int i = 1; i <= N; i++) a[i] = scanner.nextInt();

    boolean[][] dp1 = new boolean[N + 1][K + 1];
    for (int i = 0; i <= N; i++) dp1[i][0] = true;
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= K; j++) {
        dp1[i][j] = dp1[i - 1][j] || (j >= a[i] && dp1[i - 1][j - a[i]]);
      }
    }

    boolean[][] dp2 = new boolean[N + 1][K + 1];
    for (int i = 0; i <= N; i++) dp2[i][0] = true;
    for (int i = N - 1; i >= 0; i--) {
      for (int j = 1; j <= K; j++) {
        dp2[i][j] = dp2[i + 1][j] || (j >= a[i + 1] && dp2[i + 1][j - a[i + 1]]);
      }
    }

    int count = 0;
    loop:
    for (int i = 1; i <= N; i++) {
      List<Integer> right = new ArrayList<>();
      for (int j = 0; j <= K; j++) if (dp2[i][j]) right.add(j);

      int min = Math.max(0, K - a[i]);
      for (int j = 0; j <= K; j++) {
        if (dp1[i - 1][j]) {
          int r = findLowerBound(right, Math.max(0, min - j));
          if (r >= 0 && j + r < K) {
            count++;
            continue loop;
          }
        }
      }
    }
    System.out.println(N - count);
  }

  private static int findLowerBound(List<Integer> list, int min) {
    int left = -1;
    int right = list.size();
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (list.get(mid) >= min) {
        right = mid;
      } else {
        left = mid;
      }
    }
    return right == list.size() ? - 1 : list.get(right);
  }
}
