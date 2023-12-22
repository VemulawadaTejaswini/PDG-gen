import java.util.*;
import java.io.*;
public class Main {
    static long[] prefix;
    public static void preCompute(long[] arr){
        prefix = new long[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
    }

    public static long queryRange(int i, int j) {
        if(i == 0)
            return prefix[j];

        return prefix[j] - prefix[i-1];
    }

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
          ans =  Math.min(ans, solve(arr,i,k,dp) + solve(arr, k+1, j,dp) + queryRange(i,k) + queryRange(k+1,j));
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
        preCompute(arr);
       System.out.println(solve(arr, 0, arr.length-1,dp));
    }
}