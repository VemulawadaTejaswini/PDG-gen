import java.util.*;
import java.io.*;
public class Main {
    public static int dp[];
    public static int getLen(int arr[][] , int s){
        if(dp[s] != -1){
            return dp[s];
        }
        int ans = 0;
        for(int j = 0 ; j < arr.length ; j++){
            if(arr[s][j] != 0){
                ans = Math.max(ans , getLen(arr , j) + 1);
           }
        }

        // System.out.println(ans);
        return dp[s] = ans;
    }
    public static int solve(int arr[][]){
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++){
            ans = Math.max(ans , getLen(arr , i));
        }
        // ans = getLen(arr , 4);
        return ans;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        dp = new int[n];
        for(int i = 0 ; i < n ; i++){
            dp[i] = -1;
        }
        int arr[][] = new int[n][n];
        for(int i = 0 ; i < m ; i++){
            int first = s.nextInt() - 1;
            int second = s.nextInt() - 1;
            arr[first][second] = 1;
        }
        
        System.out.println(solve(arr));
        // for(int i = 0 ; i < n ; i++){
        //     System.out.println(dp[i]);
        // }
    }
}