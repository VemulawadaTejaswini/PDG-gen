import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = Integer.parseInt(sc.next());
	static int W = Integer.parseInt(sc.next());
	static final int INF = Integer.MAX_VALUE;
	static int V = N*1000;
	static int[] w = new int[N];
	static int[] v = new int[N];
	static long[][] dp = new long[N+1][V+1];
	public static void main(String[] args) {
		for (int i = 0; i < N; i++) {
			w[i] = Integer.parseInt(sc.next());
			v[i] = Integer.parseInt(sc.next());
		}
		Arrays.stream(dp).parallel().forEach(i -> Arrays.fill(i, INF));
		dp[0][0] = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < V+1; j++) {
				if (j - v[i]>=0) {
					dp[i+1][j] = Math.min(dp[i][j], dp[i][j-v[i]]+w[i]);
				} else {
					dp[i+1][j] = dp[i][j];
				}
			}
		}
		int ans = -1;
		for (int j = 0; j < V+1; j++) {
			if (dp[N][j]<=W) {
				ans = j;
			}
		}
		System.out.println(ans);
	}
}
