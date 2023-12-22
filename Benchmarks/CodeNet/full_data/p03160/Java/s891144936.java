import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] h = new int[n];
    for (int i = 0; i < n; i++) {
      h[i] = scan.nextInt();
    }
    scan.close();

    System.out.println(minCost(h, 2));
  }

  private static int minCost(int[] heights, int maxSteps) {
    if (heights.length == 0)
        return 0;
    int[] dp = new int[heights.length];
    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;

    for (int i = 1; i < heights.length; i++) {
        for (int j = Math.max(0, i - maxSteps); j < i; j++) {
            dp[i] = Math.min(dp[i], dp[j] + Math.abs(heights[i] - heights[j]));
        }
    }
    return dp[dp.length - 1];
  }
}
