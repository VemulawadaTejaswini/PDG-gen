

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner in;

    private static int n;
    private static int[] a;
    private static long[][] dp;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n];
        for(int i=0; i<n; i++) a[i] = in.nextInt();

        dp = new long[n][n];

        for(int i=0; i<n; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println(solve(0, n-1));
        
    }

    private static long solve(int left, int right) {
        if (left==right) return 0;

        if (dp[left][right]!=-1) return dp[left][right];

        long ans = (long)1e15;

        long cost = 0;
        for(int i=left; i<=right; i++) cost+=a[i];

        for(int k=left; k<right; k++) {
            //left:k and k+1:right are combined seperately
            ans = Math.min(ans, cost+solve(left, k)+solve(k+1, right));
        }

        return dp[left][right]=ans;
    }
    
    
}
