
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static Scanner in;

    private static int n;
    private static double[] p;
    private static double[][] dp;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        
        n = in.nextInt();
        p = new double[n];
        dp = new double[n][n];
        for(int i=0; i<n; i++) {
            Arrays.fill(dp[i], -1);
        }

        for(int i=0; i<n; i++) p[i] = in.nextDouble();

        System.out.println(solve(0, 0));
	}

    private static double solve(int i, int heads) {
        if (i==n) {
            if (heads>n-heads) {
                return 1;
            } else {
                return 0;
            }
        }

        if (dp[i][heads]!=-1) return dp[i][heads];

        return dp[i][heads] = p[i]*solve(i+1, heads+1)+(1-p[i])*solve(i+1, heads);
    }

}
