import java.io.*;
import java.util.*;

class Main {

    public static long memo(int[] flowers, int[] price, int n, int prev, long[][] memo){
        if(n <= 0)
            return 0;
        if(memo[prev+1][n] > 0){
        
            return memo[prev+1][n];
        }
        long ans = Long.MIN_VALUE;
        if(prev == -1 || flowers[prev] > flowers[n-1])
        ans = Math.max(ans, price[n-1] + memo(flowers,price,n-1,n-1,memo));
        ans = Math.max(ans, 0 + memo(flowers,price,n-1,prev,memo));
        
        return memo[prev+1][n] = ans;
    }
    
    public static long solve(int[] flowers, int[] price){

        long[] dp = new long[flowers.length];
        for(int i = 0; i < flowers.length; i++)
            dp[i] = price[i];
            
        for(int i = 0; i < price.length; i++){
            for(int j = i-1; j >= 0; j--){
                if(flowers[j] < flowers[i]){
                    long current = dp[j] + price[i];
                    if(dp[i] < current)
                        dp[i] = current;
                }
            }
        }

        long ans = Long.MIN_VALUE;
        for(long i : dp)
            ans = Math.max(ans,i);
        return ans;
    }
    

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int flowers[] = new int[n];
        int price[] = new int[n];

        StringTokenizer token = new StringTokenizer(br.readLine().trim(), " ");
        int i = 0;
        while(token.hasMoreTokens()){
            flowers[i] = Integer.parseInt(token.nextToken());
            i++;
        }
        
        i = 0;
        token = new StringTokenizer(br.readLine().trim(), " ");
        while(token.hasMoreTokens()){
            price[i] = Integer.parseInt(token.nextToken());
            i++;
        }

        
        i = 0;
        long[][] memo = new long[n+1][n+1];
        
        
        //System.out.println(solve(flowers,price));
        System.out.println(memo(flowers,price,n,-1,memo));
    }
}