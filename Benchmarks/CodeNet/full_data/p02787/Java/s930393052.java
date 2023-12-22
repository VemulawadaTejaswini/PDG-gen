import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int H = sc.nextInt();
		int N = sc.nextInt();

		int[] A = new int[N];
		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}

		sc.close();

		int[][] dp; 

		dp = new int[N + 10][H + 10010];

		for (int i = 0; i < dp.length; i++) {
			Arrays.fill(dp[i], Integer.MAX_VALUE >> 1);
		}

		for (int i = 0; i <= N; i++) {
			dp[i][0] = 0;
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < dp[i].length; j++) {
				dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j]);
				if (j >= A[i]) {
					dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i + 1][j - A[i]] + B[i]);
				}
			}
		}

		int ans = Integer.MAX_VALUE;
		for (int j = H; j < dp[N].length; j++) {
			ans = Math.min(ans, dp[N][j]);
		}
		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
