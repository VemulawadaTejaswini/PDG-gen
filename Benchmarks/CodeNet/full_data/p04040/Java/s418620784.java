import java.util.*;


public class Main {
  static int H, W, A, B;
  static int[][] dp;
  static int previous, current;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    H = sc.nextInt();
    W = sc.nextInt();
    A = sc.nextInt();
    B = sc.nextInt();

    dp = new int[2][W + 1];
    previous = 0;
    current = 1;

    dp[previous][0] = 0;
    for(int i = 1; i <= W; i++) {
      dp[previous][i] = 1;
    }

    for(int i = 1; i < H - A; i++) {
      for(int j = 1; j <= W; j++) {
        dp[current][j] = dp[previous][j] + dp[current][j - 1];
        dp[current][j] %= 1000000007;
      }
      previous = 1 - previous;
      current = 1 - current;
    }

    for(int i = 0; i <= B; i++) {
      dp[previous][i] = 0;
      dp[current][i] = 0;
    }

    for(int i = H - A; i < H; i++) {
      for(int j = B + 1; j <= W; j++) {
        dp[current][j] = dp[previous][j] + dp[current][j - 1];
        dp[current][j] %= 1000000007;
      }
      previous = 1 - previous;
      current = 1 - current;
    }

    System.out.println(dp[previous][W]);
  }
}
