

import java.util.*;

public class Main {
    public static long[][] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int W = scanner.nextInt();
        int[] w = new int[n+1];
        int[] v = new int[n+1];
        for (int i = 1; i <= n; i++) {
            w[i] = scanner.nextInt();
            v[i] = scanner.nextInt();
        }
        memo = new long[n+1][W+1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= W; j++){
                memo[i][j] = -1;
            }
        }
        System.out.println(knapsack(W, n, w, v));
    }

    public static long knapsack(int W, int n, int[] w, int[] v){
        if(W==0||n==0) return 0;
        if(memo[n][W]!=-1) return memo[n][W];
        long take = -1;
        if(W-w[n]>=0){
            take = v[n] + knapsack(W-w[n], n-1, w, v);
        }
        long dont = knapsack(W, n-1, w, v);
        long res = Math.max(take, dont);
        memo[n][W] = res;
        return res;
    }
}