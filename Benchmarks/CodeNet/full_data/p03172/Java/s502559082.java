
import java.util.*;

public class Main
{
    private final static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	String[] temp = in.nextLine().split(" ");
	int N = Integer.parseInt(temp[0]);
	int K = Integer.parseInt(temp[1]);
	int[] arr = new int[N];
	temp = in.nextLine().split(" ");
	for (int i = 0; i < N; i++) {
	    arr[i] = Integer.parseInt(temp[i]);
	}
	int[][] dp = new int[N+1][K+1];
	dp[0][0] = 1;
	for (int i = 1; i <= N; i++) {
	    dp[i][0] = 1;
	    for (int j = 0; j < K; j++) {
		dp[i][j+1] = dp[i][j] + dp[i-1][j+1];
		if (j - arr[i-1] >= 0) {
		    dp[i][j+1] -= dp[i-1][j-arr[i-1]];
		}
		dp[i][j+1] %= MOD;
	    }
	}
	System.out.println(dp[N][K]);
	in.close();
    }
}
