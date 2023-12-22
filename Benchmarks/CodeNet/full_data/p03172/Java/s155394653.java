import java.util.*;
import java.io.*;
class Main {
    static int MOD = (int)(1e9+7);
    static int rangeSum(int[] a, int left, int right) {
        int sum = a[right];
        if(left-1>=0)
            sum = ((sum-a[left])%MOD+MOD)%MOD;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++)
            a[i] = sc.nextInt();
        int[][] dp = new int[n+1][k+1];
        int[][] pref = new int[n+1][k+1];
        for(int i = 0; i<=k; i++)
            pref[0][i] = 1;
        for(int i = 1; i<=n; i++)
            pref[i][0] = 1;
        dp[0][0] = 1;
        for(int i = 1; i<=n; i++)
            dp[i][0] = 1;
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=k; j++) {
                int x = Math.min(j, a[i-1]);
                dp[i][j] = rangeSum(pref[i-1], j-x, j);
                pref[i][j] = (pref[i][j-1]+dp[i][j])%MOD;
            }
        }
        System.out.println(dp[n][k]%MOD);
    }
}