import java.io.*;
import java.util.*;

class Main {
  static final Scanner in = new Scanner(System.in);
  static int N, K;

  static int[] h;
  static int dp[];
  static final int MOD = 1000000007;
  static int[] pre;

  public static void main(String[] args) throws Exception {
    N = in.nextInt();
    h = new int[N];
    dp = new int[N];

    int old_sum = 0;
    for (int i = 0; i < N; i++){ h[i] = in.nextInt();
  }
  Arrays.fill(dp,-1);

    System.out.println(F(N-1));
  }

  static int F(int i){
    if(i == 0)
      return 0;
    
    if(i == 1)
      return Math.abs(h[0] - h[1]); 
    
    if(dp[i] != -1)
      return dp[i];  
      
    int a = F(i - 1) + Math.abs(h[i-1] - h[i]);
    int b = F(i - 2) + Math.abs(h[i-2] - h[i]);

    dp[i] = Math.min(a,b);
    return dp[i];
  }
}
