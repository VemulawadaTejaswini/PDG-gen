import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long W = Long.parseLong(sc.next());
        long dp[][] = new long[N+1][2000000];
        long ans = 0;
        for(int i=1;i<=N;i++){
            long w = Long.parseLong(sc.next());
            int v = Integer.parseInt(sc.next());
            for(int j=0;j<=1000000;j++){
                if(j==v || (j-v >= 0 && dp[i-1][j-v] > 0)){
                    if(i==1) dp[i][j] = w;
                    else{
                        if(dp[i][j] > 0){
                            dp[i][j] = Math.min(dp[i][j], dp[i-1][j-v]+w);
                        }else{
                            dp[i][j] = dp[i-1][j-v]+w;
                        }
                    } 
                    if(dp[i][j] <= W) ans = Math.max(j,ans);
                }else{
                    if(i>1 && dp[i-1][j]>0) dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(ans);
    }
}
