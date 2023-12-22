import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] x = new long[n+1];
        long[] y = new long[n+1];
        long[] z = new long[n+1];
        for (int i = 1; i <= n; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            z[i] = sc.nextLong();
        }
        long ans = 0L;
        for (int i = 0; i < 8; i++) {
            long xs = (i & 1) == 1 ? 1L : -1L;
            long ys = (i >>1& 1) == 1 ? 1L : -1L;
            long zs = (i >>2& 1) == 1 ? 1L : -1L;
            long[][] dp = new long[m+1][n+1];
            long[][] dpx = new long[m+1][n+1];
            long[][] dpy = new long[m+1][n+1];
            long[][] dpz = new long[m+1][n+1];
            for (int j = 1; j <= m; j++) {
                for (int k = 1; k <= n; k++) {
                    long tx = dpx[j-1][k-1] + x[k];
                    long ty = dpy[j-1][k-1] + y[k];
                    long tz = dpz[j-1][k-1] + z[k];
                    long t = tx*xs + ty*ys + tz*zs;
                    if(dp[j][k-1] <  t){
                        dp[j][k] = t;
                        dpx[j][k] = tx; dpy[j][k] = ty; dpz[j][k] = tz;
                    }
                    else {
                        dp[j][k] = dp[j][k-1];
                        dpx[j][k] = dpx[j][k-1];
                        dpy[j][k] = dpy[j][k-1];
                        dpz[j][k] = dpz[j][k-1];
                    }
                }
            }
            if(ans < dp[m][n]) ans = dp[m][n];
        }
        System.out.println(ans);
        sc.close();

    }

}
