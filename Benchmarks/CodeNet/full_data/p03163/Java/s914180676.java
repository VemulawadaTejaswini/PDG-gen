import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int[] wa = new int[n];
        int[] va = new int[n];
        for(int i=0; i<n; i++){
            wa[i] = Integer.parseInt(sc.next());
            va[i] = Integer.parseInt(sc.next());
        }
        
        long[] dp = new long[w+1];
        for(int i=0; i<n; i++){
            for(int j=w; j>=0; j--){
                if(wa[i]+j<=w && dp[j+wa[i]] < dp[j]+va[i]){
                    dp[j+wa[i]] = dp[j]+va[i];
                }
            }
        }
        
        long ans = 0;
        for(int i=0; i<dp.length; i++){
            ans = Math.max(ans, dp[i]);
        }
        
        System.out.println(ans);
    }
}
