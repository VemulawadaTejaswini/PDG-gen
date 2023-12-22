import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    static long INF = 10000000000L;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        int tot = 0;
        for(int i=0;i<n;i++){
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
            tot+=v[i];
        }
        long[] dp = new long[tot+1];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for(int i=0;i<n;i++){
            for(int j = tot - v[i];j>=0;j--){
                dp[j+v[i]] = Math.min(dp[j+v[i]], w[i]+dp[j]);
            }
        }
        long ans = 0;
        for(int i=0;i<=tot;i++){
            if(dp[i]<=W){
                ans = Math.max(ans, i);
            }
        }
        System.out.println(ans);
    }
}