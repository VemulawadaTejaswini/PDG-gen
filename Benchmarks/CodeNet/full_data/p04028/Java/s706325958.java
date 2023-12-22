import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.next().length();
    int mod = 1_000_000_007;
    long[][] dp = new long[N+2][N+2];
    
    dp[0][0] = 1;
    for (int i=0;i<N;i++){
      for (int j=0;j<N+1;j++){
        dp[i+1][j+1] += 2*dp[i][j];
        dp[i+1][j+1] %= mod;
        //dakensinai
        dp[i+1][Math.max(0,j-1)] += dp[i][j];
        dp[i+1][Math.max(0,j-1)] %= mod;
      }
    }
    long ret = dp[N][L];
    for(int i=0;i<L;i++){
      ret = (ret*(mod+1)/2) %mod;
    }
    System.out.println(ret);
          return;      
  }
}