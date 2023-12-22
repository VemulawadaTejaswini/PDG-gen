import java.util.*;
import java.io.*;
public class Main {
    
    public static long sum(long[] arr, int i, int j) {
        long sum = 0;
        for(int k = i; k <= j; k++){
            sum += arr[k];
            
        }
        return sum;
    }

    static long solve(long[] arr, int i, int j,long[][] dp){
        if(i== j)
            return 0;
        if(dp[i][j] != -1)
            return dp[i][j];

        long ans = Long.MAX_VALUE;
        
        for(int k = i; k < j; k++){
          ans =  Math.min(ans, solve(arr,i,k,dp) + solve(arr, k+1, j,dp) + sum(arr,i,k) + sum(arr,k+1,j));
        }

        return  dp[i][j] = ans;
        
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        int n = Integer.parseInt(br.readLine().trim());
        long[] arr = new long[n];
        token = new StringTokenizer(br.readLine().trim()," ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = Long.parseLong(token.nextToken());
        }
        
        long[][] dp = new long[arr.length][arr.length];
       for(int i = 0; i < dp.length; i++)
           Arrays.fill(dp[i],-1);

       System.out.println(solve(arr, 0, arr.length-1,dp));
    }
}