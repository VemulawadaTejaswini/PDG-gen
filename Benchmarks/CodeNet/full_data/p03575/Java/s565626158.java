import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] r = new int[N + 1][N + 1];
		int ans = 0;

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			r[a][b] = 1;
			r[b][a] = 1;
		}

		int cnt = 0;

		while (cnt == 0) {
			cnt = 1;
			for (int i = 1; i <= N; i++) {
				int x = 0;
				int y = 0;
				for (int j = 1; j <= N; j++) {
					if (r[i][j] == 1) {
						x++;
						y = j;
					}
				}
				if (x == 1) {
					r[i][y] = 0;
					r[y][i] = 0;
					ans++;
					cnt = 0;
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
