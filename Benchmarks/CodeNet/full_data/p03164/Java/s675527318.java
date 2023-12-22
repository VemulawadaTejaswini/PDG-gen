import java.io.*;
import java.util.*;
 
class Main {
 
    public static long solve(int[] weights, int[] val, int W, int i, long[][] memo){
        if(W <= 0 || i >= weights.length)
            return 0;

        if(memo[i][W] > -1)
            return memo[i][W];

        long ans = Integer.MIN_VALUE;

        ans = Math.max(ans,solve(weights, val, W, i+1, memo));
        if(W-weights[i] >= 0){
            ans = Math.max(ans,val[i] +  solve(weights, val, W-weights[i], i+1, memo));
        }

        return memo[i][W] =  ans;
        
 
    }
 
    public static void main(String[] args) throws Exception {
        BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));
        String[] nw = br.readLine().trim().split(" ");
        int n = Integer.parseInt(nw[0]);
        int W = Integer.parseInt(nw[1]);
        int weights[] = new int[n];
        int val[] = new int[n];
 
        for(int i  = 0; i < n; i++){
            String[] input = br.readLine().trim().split(" ");
 
            weights[i] = Integer.parseInt(input[0]);
            val[i] = Integer.parseInt(input[1]);
        }
 
        long[][] memo = new long[n+1][W+1];
        for(int i = 0; i < memo.length; i++)
            Arrays.fill(memo[i],-1);
        System.out.println(solve(weights,val,W,0,memo));
 
    }
}