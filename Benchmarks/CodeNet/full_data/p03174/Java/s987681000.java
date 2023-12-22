import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[][] dp;
    static int mod = 1000000007;
    
    public static int solve(int[][] comp, int womenMask, int currentMen){
            
        if(currentMen == comp.length){
            
            if(womenMask == (1 << n)-1)
                return 1;
            return 0;
     
        }
     
        if(dp[currentMen][womenMask] != -1)
            return dp[currentMen][womenMask];
        
            int ans = 0;
        for(int j = 0; j < comp.length; j++){
            if(comp[currentMen][j] == 1 && (womenMask & (1 << j) ) == 0){
                ans =( ans + solve(comp,(womenMask |  (1 << j) ) , currentMen+1))%mod;
            }
        
        }
        ans %= mod;
        
        return dp[currentMen][womenMask] = ans % mod;
        
    }
    
    
    
    public static void main(String args[]) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           n = Integer.parseInt(br.readLine().trim());
           dp = new int[n+1][(1 << n)+1];
           int[][] arr = new int[n][n];
           
           for(int i = 0; i < dp.length; i++){
               Arrays.fill(dp[i],-1);
           }
           
           StringTokenizer token;
           
           for(int i = 0; i < n; i++){
              int j = 0;
              token =  new StringTokenizer(br.readLine().trim()," ");
              while(token.hasMoreTokens()){
                  arr[i][j++] = Integer.parseInt(token.nextToken());
              }
               
           }

   
      System.out.println(solve(arr,0,0));
    }
}