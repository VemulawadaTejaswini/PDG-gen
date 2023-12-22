import java.util.*;

class Main{
  
  public static void main(String... args){
  	Scanner sc = new Scanner(System.in);
    int N, W;
    N = sc.nextInt();
    W = sc.nextInt();
    
    long[] dp = new long[W+1];
    for(int i = 0; i < N; i++){
      dp[i] = -1;
      int w = sc.nextInt();
      int v = sc.nextInt();
      for(int existing_wt = w; existing_wt >= 0; existing_wt--){
        dp[i] = Math.max(dp[existing_wt], dp[existing_wt - w] + v);
      }
      
      int ans = 0;
      for(int i = 0; i < W+1; i++)
        ans = Math.max(ans, dp[i]);
      
      return ans;
    }
  }
}