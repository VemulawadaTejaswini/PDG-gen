import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();

		boolean[][] A = new boolean[N][N];
		boolean[][] C = new boolean[N][N];

		// 初期化
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = false;
				C[i][j] = false;
			}
		}

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			A[a - 1][b - 1] = true;
			A[b - 1][a - 1] = true;
		}

		for (int i = 0; i < K; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			C[a - 1][b - 1] = true;
			C[b - 1][a - 1] = true;
		}

		// solve
		for (int i = 0; i < N; i++) {
			// iさんの友達候補
			int friends = 0;

			for (int j = 0; j < N; j++) {
				// 同一人物
				if (i == j) {
					continue;
				}
				// 友達関係あり
				if (A[i][j]) {
					continue;
				}
				// ブロック関係あり
				if (C[i][j]) {
					continue;
				}
				// 数列の評価
				boolean isOk = true;
				for (int k = Math.min(i, j); k < Math.max(i, j); k++) {
					if (!A[k][k + 1]) {
						isOk = false;
						break;
					}
				}
				if (isOk) {
					friends++;
				}
			}

			System.out.print(friends + " ");
		}

		sc.close();
	}

}
