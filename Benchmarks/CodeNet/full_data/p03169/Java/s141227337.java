import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[3];
		for (int i = 0; i < n; i++) {
			a[sc.nextInt() - 1]++;
		}

		double[][][] dp = new double[305][305][305];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				for (int k = 0; k <= n; k++) {
					double ijk = i + j + k;
					if (ijk == 0) continue;
					dp[i][j][k] = n;
					if (i > 0) dp[i][j][k] += i * dp[i - 1][j + 1][k];
					if (j > 0) dp[i][j][k] += j * dp[i][j - 1][k + 1];
					if (k > 0) dp[i][j][k] += k * dp[i][j][k - 1];
					dp[i][j][k] /= ijk;
				}
			}
		}

		System.out.println(dp[a[2]][a[1]][a[0]]);
	}
}
