import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] h = new int[N+1];
    for(int i = 1; i <= N; i++) {
      h[i] = sc.nextInt();
    }
    int[] dp = new int[N+1];
    dp[1] = 0;
    dp[2] = Math.abs(h[2] - h[1]);
    for(int i = 3; i <= N; i++) {
      dp[i] = Math.min(dp[i - 1] + Math.abs(h[i] - h[i - 1]), dp[i - 2] + Math.abs(h[i] - h[i - 2]));
    }
    System.out.println(dp[N]);
  }
}
