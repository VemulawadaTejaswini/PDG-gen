import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        double[][] dp = new double[N+1][N+1];
        dp[0][0] = 1;
        for (int i=0;i<N;i++) {
            double p = Double.parseDouble(sc.next());
            for (int j=0;j<N+1;j++) {
                dp[i+1][j] = dp[i][j]*(1-p);
                if (j!=0) dp[i+1][j] += dp[i][j-1]*p;
            }
        }
        double ans = 0;
        for (int j=(N+1)/2;j<=N;j++) {
            ans += dp[N][j];
        }
        System.out.println(ans);
    }
}