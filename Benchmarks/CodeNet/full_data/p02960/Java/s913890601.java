import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long[][] dp = new long[S.length()+1][13];
        final int MOD = (int)Math.pow(10, 9) + 7;
        dp[0][0] = 1;
        
        for(int i = 0; i < S.length() ; i++){
            if (S.charAt(i) == '?'){
                for(int j = 0; j < 13; j++){
                    for(int k = 0; k < 10; k++){
                        dp[i+1][(j*10 + k) % 13] += dp[i][j] % MOD;
                    }
                }
            } else {
                for(int j = 0; j < 13; j++){
                    dp[i+1][(j *10 + (int)S.charAt(i)) % 13] += dp[i][j] % MOD;
                }
            }
        }
        
        System.out.println(dp[S.length()][5] % MOD);
    }
}
