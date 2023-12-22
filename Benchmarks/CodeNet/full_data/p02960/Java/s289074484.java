import java.util.*;
public class Main{
  private static final int MOD = (int) 1e9 + 7;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    long[][] dp = new long[13][n+1];
    dp[0][0] = 1;
    for (int i=0; i<n; i++){
      for (int j=0; j<13; j++){
        if(s.charAt(i)=='?'){
          for(int k=0; k<10; k++){
            int dest = (10*j + k) % 13;
            dp[dest][i+1] = dp[j][i];
            dp[dest][i+1] %= MOD;
          }
        }
      }
    }
    
    System.out.println(dp[5][n]);
  }
}