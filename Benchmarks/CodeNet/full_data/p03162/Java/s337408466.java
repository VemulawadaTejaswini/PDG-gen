import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[][] days = new int[3][n];
    for (int i = 0; i < n; i++)
    for (int j = 0; j < 3; j++) {
      days[j][i] = s.nextInt();
    }

    System.out.println(bestVacation(days));
  }

  private static int bestVacation(int[][] days) {
    if (days.length == 0 || days[0].length == 0)
      return 0;

    int n = days[0].length;

    int[][] dp = new int[3][n + 1];

    int max = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 3; j++)
      for (int k = 0; k < 3; k++) {
        if (j == k) continue;
        dp[j][i + 1] = Math.max(dp[j][i + 1], dp[k][i] + days[j][i]);
        if (i == n - 1)
          max = Math.max(max, dp[j][i + 1]);
      }
    }

    return max;
  }
}