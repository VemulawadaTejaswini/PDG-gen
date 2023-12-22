import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static Scanner in;

    private static int n, k;
    private static int[] h;
    private static int[] dp;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        h = new int[n];
        for(int i=0; i<n; i++) h[i] = in.nextInt();

        dp = new int[n-1];

        Arrays.fill(dp, -1);

        System.out.println(solve(0));

	}

    public static int solve(int i) {
        if (i==n-1) return 0;

        if (dp[i]!=-1) return dp[i];


        int ans = (int)1e9;

        for(int j=i+1; j<=i+k && j<n; j++) {
            ans = Math.min(ans, Math.abs(h[j]-h[i])+solve(j));
        }

        return dp[i] = ans;

    }

}
