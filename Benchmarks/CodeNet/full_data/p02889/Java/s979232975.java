import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		long startTime = System.currentTimeMillis();
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long L = sc.nextLong();
		long[][] dist = new long[N][N];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				if (i == j)
					continue;
				dist[i][j] = Long.MAX_VALUE / 3;
			}
		}
		for (int i = 0; i < M; ++i) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			--A;
			--B;
			long C = sc.nextLong();
			if (C <= L) {
				dist[A][B] = C;
				dist[B][A] = C;
			}
		}
		for (int middle = 0; middle < N; ++middle) {
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					dist[i][j] = Math.min(dist[i][j], dist[i][middle] + dist[middle][j]);
				}
			}
		}
		long[][] cnt = new long[N][N];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				if (dist[i][j] <= L)
					cnt[i][j] = 1;
				else
					cnt[i][j] = Long.MAX_VALUE / 3;
			}
		}
		for (int middle = 0; middle < N; ++middle) {
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					cnt[i][j] = Math.min(cnt[i][j], cnt[i][middle] + cnt[middle][j]);
				}
			}
		}
		int Q = sc.nextInt();
		for (int q = 0; q < Q; ++q) {
			int s = sc.nextInt() - 1;
			int t = sc.nextInt() - 1;
			if (cnt[s][t] == Long.MAX_VALUE / 3) {
				System.out.println(-1);
			} else {
				System.out.println(cnt[s][t] - 1);
			}
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}