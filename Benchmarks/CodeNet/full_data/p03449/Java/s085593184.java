import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[][] A = new int[2][N];
		A[0] = nextIntArray(sc, N);
		A[1] = nextIntArray(sc, N);

		sc.close();

		int[][] dp = new int[2][N];
		dp[0][0] = A[0][0];
		dp[1][0] = dp[0][0] + A[1][0];

		for (int i = 1; i < N; i++) {
			dp[0][i] = dp[0][i - 1] + A[0][i];
			dp[1][i] = Math.max(dp[0][i], dp[1][i - 1]) + A[1][i];
		}

		out.println(dp[1][N - 1]);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
