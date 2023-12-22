import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] height = new long[N];
    long[] beauty = new long[N];
    for (int i = 0; i < N; ++i) {
      height[i] = sc.nextInt();
    }
    for (int i = 0; i < N; ++i) {
      beauty[i] = sc.nextInt();
    }

    long maxBeauty = solve(height, beauty);
    System.out.println(maxBeauty);
  }

  private static long solve(long[] height, long[] beauty) {
    int len = height.length;
    long[] dp = new long[len];
    System.arraycopy(beauty, 0, dp, 0, len);
    for (int i = 1; i < len; ++i) {
      for (int j = 0; j < i; j++) {
        if (height[j] < height[i]) {
          dp[i] = Math.max(dp[i], dp[j] + beauty[i]);
        }
      }
    }
    long max = Integer.MIN_VALUE;
    for (int i = 0; i < len; i++) {
      max = Math.max(max, dp[i]);
    }
    return max;
  }
}
