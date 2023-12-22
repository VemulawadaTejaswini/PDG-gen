import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int MOD = 1000000007;
    String S = sc.nextLine();
    int n = S.length();
    long[][] dp = new long[100002][13];
    
    dp[0][0] = 1;
    int m = 1;
    for(int i = 1; i <= n; i++){
      char c = S.charAt(n-i);
      if(c == '?'){
        for(int j = 0; j < 10; j++){
          for(int k = 0; k < 13; k++){
            dp[i][(j*m+k)%13] += dp[i-1][k];
            dp[i][(j*m+k)%13] %= MOD;
          }
        }
      }else{
        int j = (int)(c - '0');
        for(int k = 0; k < 13; k++){
          dp[i][(j*m+k)%13] += dp[i-1][k];
          dp[i][(j*m+k)%13] %= MOD;
        }
      }
      m *= 10;
      m %= 13;
    }
    
    System.out.println(dp[n][5]);
  }
}