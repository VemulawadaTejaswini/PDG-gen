import java.util.Arrays;
import java.util.Scanner;

 class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0){
      try{
      int n = sc.nextInt();
      int[] h = new int[n + 1];
      for (int i = 1; i <= n; i++) h[i] = sc.nextInt();
      int[] dp = new int[n + 1];
      Arrays.fill(dp,1,n + 1, Integer.MAX_VALUE);
      dp[1] = 0;
      for (int i = 1; i < n; i++){
        if (i + 2 <= n) {
          dp[i + 2] = Math.min(dp[i + 2], dp[i] + Math.abs(h[i] - h[i + 2]));
        }
        dp[i + 1] = Math.min(dp[i + 1], dp[i] + Math.abs(h[i] - h[i + 1]));

      }
      System.out.println(dp[n]);
    }catch (Exception e) {}
    }
  }
}
