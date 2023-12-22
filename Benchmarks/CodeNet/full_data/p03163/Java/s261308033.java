import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main {

    public static long knapsack(int N, int W, int[] w, int[] v) {
        long[] dp = new long[W + 1];

        for(int i = 0; i < N; i++) {
            for(int j = W; j >= w[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);
            }
        }
        return dp[W];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        
        int[] w = new int[N];
        int[] v = new int[N]; 

        for(int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        System.out.println(knapsack(N, W, w, v));
  }
}
