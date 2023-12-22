import java.util.*;
import java.io.*;
public class Main {
    public static int dp[][] ;
    public static int mod = 1000000007;
    public static int solve(int arr[] , int n , int k){
        
        for(int j = 0; j <= k ; j++){
            dp[1][j] = (j > arr[1]) ? 0 : 1;
        }

        for(int i = 2 ; i <= n ; i++){
            for( int j = 0 ; j <= k ; j++){
                if(j == 0) 
                    dp[i][j] = dp[i-1][j];
                else 
                    dp[i][j] = (mod + (dp[i-1][j] + dp[i][j-1] - (j-1-arr[i] >=0 ? dp[i-1][j-1-arr[i]] : 0))%mod ) % mod;
            }
        }
        return dp[n][k];
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int arr[] = new int[n+1];
        dp = new int[n+1][k+1];

        for(int i = 1 ; i <= n ; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(solve(arr , n , k));
    }
}