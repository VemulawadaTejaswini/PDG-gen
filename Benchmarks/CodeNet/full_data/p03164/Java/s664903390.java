import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main {

    public static long knapsack2(int N, int W, int[] w, int[] v) {
        long[] dp = new long[100001];
        Arrays.fill(dp, Long.MAX_VALUE / 2);

        dp[0] = 0;
        for(int i = 0; i < N; i++) {
            for(int j = dp.length - 1; j >= v[i]; j--) {
                dp[j] = Math.min(dp[j], dp[j - v[i]] + w[i]);
            }
        }
        
        for(int i = dp.length - 1; i >= 0; i--) {
            if(dp[i] <= W) {
                return i;
            }
        }
        return 0;
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

        System.out.println(knapsack2(N, W, w, v));
  }
}
