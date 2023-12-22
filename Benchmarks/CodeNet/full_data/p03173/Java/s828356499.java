import java.util.*;

public class Main {
    static long[][] dp;
    static long[] s;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] a = new int[N];
        s = new long[N+1];
        s[0] = 0;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            s[i+1] = s[i] + a[i];
        }
        dp = new long[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = -1;
                }
            }
        }
        System.out.println(rec(0,N-1));
    }
    public static long rec(int left, int right) {
        if (dp[left][right] != -1) return dp[left][right];
        long ans = s[N] * (long) N;
        for(int k = left; k < right; k++) {
            ans = Math.min(rec(left,k) + rec(k+1,right), ans);
        }
        ans += s[right + 1] - s[left];
        dp[left][right] = ans;
        return ans;
    }
}