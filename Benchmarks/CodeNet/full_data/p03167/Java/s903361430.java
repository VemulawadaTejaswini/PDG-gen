
import java.util.Scanner;

public class Main {

  static final int MOD = 1000000000 + 7;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] strings = scanner.nextLine().split(" ");
    int H = Integer.parseInt(strings[0]);
    int W = Integer.parseInt(strings[1]);
    String[] str = new String[H];
    for (int i = 0; i < H; i++) {
      str[i] = scanner.nextLine();
    }
    System.out.println(solve(str, H, W));
  }

  private static int solve(String[] str, int h, int w) {
    int[][] dp = new int[h][w];
    dp[0][0] = 1;
    for (int i = 1; i < w; i++) {
      if (str[0].charAt(i) == '#') {
        break;
      }
      dp[0][i] = dp[0][i - 1];
    }
    for (int i = 1; i < h; i++) {
      if (str[i].charAt(0) == '#') {
        break;
      }
      dp[i][0] = dp[i - 1][0];
    }

    for (int i = 1; i < w; i++) {
      for (int j = 1; j < h; j++) {
        if (str[i].charAt(j) != '#' && (dp[i - 1][j] != 0 || dp[i][j - 1] != 0)) {
          dp[i][j] = (dp[i - 1][j] % MOD + dp[i][j - 1] % MOD) % MOD;
        }
      }
    }
    return dp[h - 1][w - 1];
  }
}
