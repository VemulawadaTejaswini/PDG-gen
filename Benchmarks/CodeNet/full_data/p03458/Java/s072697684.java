import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int[][] sum = new int[K * 2][K * 2];
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			String c = sc.next();
			if (c.charAt(0) == 'W') {
				x += K;
			}
			x %= (2 * K);
			y %= (2 * K);
			sum[x][y]++;
		}

		for (int i = 0; i < K * 2; i++) {
			for (int j = 0; j < K * 2; j++) {
				if (i >= 1) sum[i][j] += sum[i - 1][j];
				if (j >= 1) sum[i][j] += sum[i][j - 1];
				if (i >= 1 && j >= 1) sum[i][j] -= sum[i - 1][j - 1];
			}
		}

		int answer = 0;
		for (int i = 0; i < K; i++) {
			for (int j = 0; j < K; j++) {
				int a = 0;
				a += sum[i][j];
				a += sum[i + K][j + K] - sum[i][j + K] - sum[i + K][j] + sum[i][j];
				a += sum[i][2 * K - 1] - sum[i][j + K];
				a += sum[2 * K - 1][j] - sum[i + K][j];
				a += sum[2 * K - 1][2 * K - 1] - sum[i + K][2 * K - 1] - sum[2 * K - 1][j + K] + sum[i + K][j + K];
				answer = Math.max(answer, Math.max(a, N - a));
			}
		}

		System.out.println(answer);
	}
}
