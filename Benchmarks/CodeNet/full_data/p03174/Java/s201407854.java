import java.util.Scanner;

public class Main {

	static int n;
	static long[][] dp;
	static int[][] matchingArray;

	static final long DIVIDE_NUMBER = 1000000007;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();

		matchingArray = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				matchingArray[i][j] = scan.nextInt();
			}
		}

		int allPattern = (int) Math.pow(2, n);

		dp = new long[n + 1][allPattern];

		for (int i = 0; i < n + 1; i++) {

			for (int j = 0; j < allPattern; j++) {

				dp[i][j] = Long.MAX_VALUE;
			}
		}

		dp[0][0] = 1;

		long answer = dpMethod(n, allPattern - 1);

		println(answer);
	}

	public static long dpMethod(int targetN, int pattern) {

		if (dp[targetN][pattern] != Long.MAX_VALUE) {

			return dp[targetN][pattern];

		} else {

			long result = 0;

			for (int i = 0; i < n; i++) {

				if (matchingArray[targetN - 1][i] == 1) {

					if ((pattern >>> i & 1) == 1) {

						result += dpMethod(targetN - 1, pattern ^ 1 << i);
					}
				}
			}

			result = result % DIVIDE_NUMBER;
			dp[targetN][pattern] = result;
			return result;
		}
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
