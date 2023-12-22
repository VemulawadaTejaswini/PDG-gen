import java.util.*;
import java.io.*;
import java.lang.*;

class Main{
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder("");
    static StringTokenizer stk = new StringTokenizer("");


    public static void main(String args[]){
        try{
            stk = new  StringTokenizer(bf.readLine());
            int N = Integer.parseInt(stk.nextToken());
            int W = Integer.parseInt(stk.nextToken());
            int value[] = new int[N];
            long weight[] = new long[N];
            for(int i=0;i<N;i++){
                stk = new StringTokenizer(bf.readLine());
                value[i] = Integer.parseInt(stk.nextToken());
                weight[i] = Integer.parseInt(stk.nextToken());
            }
            System.out.println(solver(N,W,value,weight));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static long solver(int N,int W,int[] values,long[] weights){
        long dp[][] = new long[W+1][N+1];

        
        if(values[0] <= W)
            dp[values[0]][0] = weights[0];

        
        long maxValue = 0;

        for(int i=1;i<=W;i++){
            for(int j=0;j<=N;j++){
                for(int k=0;k<j;k++){
                    dp[i][j] = Math.max(dp[i][k] , (i-values[k] >= 0) ? dp[i-values[k]][k] + weights[k] : 0);
                }
                maxValue = Math.max(maxValue , dp[i][j]);
            }
        }

        return maxValue; 
    }
    
}