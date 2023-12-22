import java.util.*;

public class Main{
    
    static final int MOD = (int)1e9 + 7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String l = sc.next();
        int n = l.length();
        
        long[][] dp = new long[101010][2];
        dp[0][0] = 1;
        
        for(int i=0; i<n; i++){
            dp[i+1][1] += dp[i][1]*3;
            dp[i+1][1] %= MOD;
            if(l.charAt(i) == '1'){
                dp[i+1][0] += dp[i][0]*2;
                dp[i+1][0] %= MOD;
                dp[i+1][1] += dp[i][0];
                dp[i+1][1] %= MOD;
            }else{
                dp[i+1][0] += dp[i][0];
                dp[i+1][0] %= MOD;
            }
        }
        
        System.out.println((dp[n][0]+dp[n][1])%MOD);
        
    }
    
}