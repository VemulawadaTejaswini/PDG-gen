import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int MOD = (int) 1e9 + 7;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        long[][] dp = new long[N+1][4];
        
        for(int i = 0; i < 4; i++){
            dp[0][i] = 0;
            dp[1][i] = 1;
            dp[2][i] = 4; 
        }
        
        for(int i = 3; i <= N; i++){
            // Aにする場合
            for(int j = 0; j < 4; j++){
                dp[i][0] += dp[i-1][j];
                if( dp[i][0] > 0 ) dp[i][0] %= MOD;
            }            
            
            // Cにする場合
            // AGC
            dp[i][1] -= dp[i-2][0];
            // GAC
            dp[i][1] -= dp[i-2][2];
            
            if ( i >= 4){
                // ATGC
                // AGGC
                // AGTC
                dp[i][1] -= dp[i-3][0] * 3;
            }
            
            for(int j = 0; j < 4; j++){
                dp[i][1] += dp[i-1][j];
                if( dp[i][1] > 0 ) dp[i][1] %= MOD;
            }            
            
            // Gにする場合
            // ACG
            dp[i][2] -= dp[i-2][0];    
            
            for(int j = 0; j < 4; j++){
                dp[i][2] += dp[i-1][j];
                if( dp[i][2] > 0 ) dp[i][2] %= MOD;
            }
            
            // Tにする場合
            for(int j = 0; j < 4; j++){
                dp[i][3] += dp[i-1][j];
                if( dp[i][3] > 0 ) dp[i][3] %= MOD;
            }
        }
        
        long ans = 0;
        for(int i = 0; i < 4; i++){
            ans += dp[N][i];
            ans %= MOD;
        }
        
        System.out.println(ans);
    }
}
