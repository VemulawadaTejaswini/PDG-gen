import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int[] dp = new int[h + 1 + 10000];
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    for(int i = 1; i < (h + 1 + 10000); i++) {
      dp[i] = (int)Math.pow(10, 8);
    }
    for(int i = 1; i < (h + 1 + 10000); i++) {
      for(int j = 0; j < n; j++) {
        if(i >= a[j]) {
          dp[i] = Math.min(dp[i], b[j] + dp[i - a[j]]);
        }
      }
    }
    int ans = Integer.MAX_VALUE;
    for(int i = 0; i < 10000; i++) {
      ans = Math.min(ans, dp[h + i]);
    }
    System.out.println(ans);
  }
}