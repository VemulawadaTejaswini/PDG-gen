import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final int M = 1_000_000_007;
    int H = scanner.nextInt();
    int W = scanner.nextInt();
    char[][] grid = new char[H + 1][W + 1];
    for (int i = 1; i <= H; i++) System.arraycopy(scanner.next().toCharArray(), 0, grid[i], 1, W);

    long[][] dp = new long[H + 1][W + 1];
    dp[0][1] = 1;
    for (int i = 1; i <= H; i++) {
      for (int j = 1; j <= W; j++) {
        if (grid[i][j] == '.') dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % M;
      }
    }
    System.out.println(dp[H][W]);
  }
}
