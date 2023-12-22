import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int[][] A = new int[3][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				A[j][i] = Integer.parseInt(sc.next());
			}
		}
		int[][] dp = new int[2][3];
		dp[0][0] = A[0][0];
		dp[0][1] = A[1][0];
		dp[0][2] = A[2][0];
		int t = 1;
		for (int i = 1; i < N; i++, t = 1 - t) {
			Arrays.fill(dp[t], 0);
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (k == j) continue;
					dp[t][k] = Math.max(dp[t][k], dp[1 - t][j] + A[k][i]);
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < 3; i++) {
			ans = Math.max(ans, dp[1 - t][i]);
		}
		System.out.println(ans);
	}

}
