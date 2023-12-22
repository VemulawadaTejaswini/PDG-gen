import java.util.*;
import java.io.*;
public class Main {
    public static int mod = 1000000007;
    public static long sum[] = new long[1<<16];
    public static long dp[] = new long[1<<16];
    public static long calculate(long arr[][] , int subset){
        long ans = 0;
        
        for(int i = 0 ; i < 17 ; i++){
            for(int j = i+1 ; j < 17 ; j++){
                if((subset&(1<<i))!=0 &&( subset&(1<<j))!=0)
                    ans += arr[i][j];
            }
        }
        return ans;
    }

    public static void prepareSum(long arr[][] , int n){
        for(int subset = 1 ; subset < (1 << n) ; subset++)
            dp[subset] = Integer.MAX_VALUE;
        for(int subset = 1 ; subset < (1 << n) ; subset++){
            sum[subset] = calculate(arr , subset);
        }
    }

    public static long solve(long arr[][] , int mask){
        long ans = 0;

        if(dp[mask] != Integer.MAX_VALUE) return dp[mask];
        
        for(int subset = mask ; subset!=0 ; subset=(subset-1)&mask){
            ans = Math.max(ans , sum[subset] + solve(arr , mask^subset));
        }

        return dp[mask] = ans;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long arr[][] = new long[n+1][n+1];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = s.nextLong();
            }
        }
        prepareSum(arr , n);
        System.out.println(solve(arr , (1<<n)-1));
    }
}