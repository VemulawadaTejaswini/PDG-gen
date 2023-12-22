import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int mod = (int)1e9 + 7;
        
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        long[][] dp = new long[1010][1010];
        dp[0][0] = 1;
        
        boolean[] kb = new boolean[1010101];
        for(int i=0; i<h; i++){
            char[] line = sc.next().toCharArray();
            for(int j=0; j<w; j++){
                if(line[j]=='#'){
                    kb[i*w+j] = true;
                }
            }
        }
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(i+1<h && !kb[(i+1)*w+j]){
                    dp[i+1][j] = (dp[i+1][j]+dp[i][j])%mod;
                }
                if(j+1<w && !kb[i*w+j+1]){
                    dp[i][j+1] = (dp[i][j+1]+dp[i][j])%mod;
                }
            }
        }
        
        System.out.println(dp[h-1][w-1]);
    }
}
