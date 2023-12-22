
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] h = new int[100010];

    for (int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }

    int dp[] = new int[100010];
    Arrays.fill(dp, Integer.MAX_VALUE);

    dp[0] = 0;
    for (int i = 0; i < n; i++) {
      dp[i + 1] = Math.min(dp[i] + Math.abs(h[i] - h[i + 1]), dp[i + 1]);
      dp[i + 2] = Math.min(dp[i] + Math.abs(h[i] - h[i + 2]), dp[i + 2]);

      //        if (i - 2 >= 0 && i + 2 < ashiba.length) {
      //          dp[i + 1] = Math.min(Math.abs(dp[i - 1] - ashiba[i + 1]), dp[i + 1]);
      //        }
    }

    System.out.println(dp[n - 1]);
  }
}
