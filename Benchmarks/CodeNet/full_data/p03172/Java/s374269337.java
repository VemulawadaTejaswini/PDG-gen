import java.util.*;
import java.io.*;
public class Main {
    public static int k;
    public static int arr[];
    public static int dp[][] ;
    public static int solve(int prev , int i){
        if(i > arr.length-1){
            if(prev == k) return 1;
            else return 0;
        }
        if(dp[prev][i] != -1) return dp[prev][i];

        int ans = 0;
        for(int t = 0 ; t <= arr[i] ; t++){
            ans += solve(prev + t , i+1) % 1000000007;
        }
        return dp[prev][i] = ans;

    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        k = s.nextInt();
        arr = new int[n+1];
        dp = new int[k+1][n+1];
        for(int i = 0 ; i < k+1 ; i++){
            for(int j = 0 ; j < n+1 ; j++){
                dp[i][j] = -1;
            }
        }
        for(int i = 1 ; i <= n ; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(solve(0 , 1));
    }
}