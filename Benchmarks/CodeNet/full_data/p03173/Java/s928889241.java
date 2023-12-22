import java.util.*;
import java.io.*;
public class Main {
    public static long sum(int arr[] , int x , int y){
        long ans = 0;
        for(int i = x ; i <= y ; i++){
            ans += arr[i];
        }
        return ans;
    }
    public static long solve(int arr[] , int n){
        long dp[][] = new long[n+1][n+1];
        for(int j = 2 ; j <= n ; j++){
            for(int i = j-1 ; i >= 1 ; i--){
                long ans = Long.MAX_VALUE;
                for(int k = i ; k < j ; k++){
                    ans = Math.min(ans , dp[i][k] + dp[k+1][j] + sum(arr,i,k) + sum(arr,k+1 ,j));
                }
                dp[i][j] = ans;
            }
        }
        return dp[1][n];
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n+1];
        for(int i = 1 ; i <= n ; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(solve(arr , n));

    }
}