import java.io.*;
import java.util.*;

class Main {
    
    public static long solve(int[] flowers, int[] price){

        long[] dp = new long[flowers.length];
        //init
        for(int i = 0; i < flowers.length; i++)
            dp[i] = price[i];
        //loop
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
        int n = Integer.parseInt(br.readLine());
        int flowers[] = new int[n];
        int price[] = new int[n];

        StringTokenizer token = new StringTokenizer(br.readLine(), " ");
        int i = 0;
        while(token.hasMoreTokens()){
            flowers[i] = Integer.parseInt(token.nextToken());
            i++;
        }
        
        i = 0;
        token = new StringTokenizer(br.readLine(), " ");
        while(token.hasMoreTokens()){
            price[i] = Integer.parseInt(token.nextToken());
            i++;
        }

        
        

        System.out.println(solve(flowers,price));
    }
}