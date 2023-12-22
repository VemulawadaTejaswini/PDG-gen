import java.util.*;

public class Main {

    static int N;
    static long[] a;
    static long[][] dp;
    static long INF = Long.MAX_VALUE;

    static long dp(int left, int right) {
        if (dp[left][right]!=INF) return dp[left][right];
        int flag = 1;
        if ((N-left-right)%2==0) flag*=-1;

        if (left==right) {
            dp[left][right] = flag*a[left];
            return flag*a[left];
        }

        long tmp = -INF;
        if (flag==1) {
            tmp = Math.max(a[left]+dp(left+1, right), a[right]+dp(left, right-1));
        } else { // flag=-1
            tmp = Math.min(-a[left]+dp(left+1, right), -a[right]+dp(left, right-1));
        }
        dp[left][right] = tmp;
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        a = new long[N];
        dp = new long[N][N];
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                dp[i][j] = INF;
            }
        }
        for (int i=0;i<N;i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        System.out.println(dp(0, N-1));
    }
}