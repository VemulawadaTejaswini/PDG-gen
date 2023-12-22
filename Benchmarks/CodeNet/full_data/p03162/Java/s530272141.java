import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int n = in.nextInt();
    int[] a = new int[n + 1];
    int[] b = new int[n + 1];
    int[] c = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      a[i] = in.nextInt();
      b[i] = in.nextInt();
      c[i] = in.nextInt();
    }
    final Solver solve = new Solver();
    System.out.println(solve.solve(a, b, c));
  }
}

class Solver {
  public int solve(int[] a, int[] b, int[] c) {
    int n = a.length;
    int[][] dp = new int[n][3];

    dp[1][0] = a[1];
    dp[1][1] = b[1];
    dp[1][2] = c[1];

    for (int i = 2; i < n; i++) {
      for (int j = 0; j < 3; j++)  {
        if (j == 0) {
          dp[i][j] = Math.max(dp[i-1][1], dp[i-1][2]) + a[i];
        } else if (j == 1) {
          dp[i][j] = Math.max(dp[i-1][0], dp[i-1][2]) + b[i];
        } else {
          dp[i][j] = Math.max(dp[i-1][1], dp[i-1][0]) + c[i];
        }
      }
    }

    int ans = Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2]));
    return ans;
  }
}
