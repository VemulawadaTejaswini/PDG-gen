import java.util.*;

public class Main {
    
    static int H;
    static int W;
    static int K;
    static int[] XYZ;
    static int MOD = (int)1e9 + 7;
    
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        H = sc.nextInt();
        W = sc.nextInt();
        K = sc.nextInt();
        
        long[][] dp = new long[H+1][W];
        
        dp[0][0] = 1; 
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                
                XYZ = new int[3];
                dfs(0, 0b0, j);
                
                if(j>=1){
                    dp[i+1][j-1] += XYZ[0] * dp[i][j];
                    dp[i+1][j-1] %= MOD;
                } 
                
                dp[i+1][j]   += XYZ[1] * dp[i][j];
                dp[i+1][j] %= MOD;
                
                if(j<=W-2){
                    dp[i+1][j+1] += XYZ[2] * dp[i][j];
                    dp[i+1][j+1] %= MOD;
                } 
            }
        }
        
        System.out.println(dp[H][K-1]);
    }
    
    static void dfs(int num, int ptn, int j){
        
        if(num > W-1){
            if( W>=j && ((ptn >> W-j) & 1) == 1 ){
                XYZ[0]++;
                return;
            }
            
            if( W-1>=j && ((ptn >> W-j-1) & 1) == 1 ){
                XYZ[2]++;  
                return;
            } 
            
            XYZ[1]++;
            return;
        }
        
        if( num > 0 && (ptn & (1 << num-1)) == 0 ){
            dfs(num+1, ptn | 1 << num, j);    
        }
        dfs(num+1, ptn, j);

    }

}
