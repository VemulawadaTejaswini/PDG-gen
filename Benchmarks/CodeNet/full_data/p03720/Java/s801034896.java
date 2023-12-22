import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] map = new int[n][n];
		int a, b;
		for (int i = 0; i < m; i++) {
			a = sc.nextInt() - 1;
			b = sc.nextInt() - 1;
			map[a][b]++;
			map[b][a]++;
		}
		int cnt;
		for (int i = 0; i < n; i++) {
			cnt = 0;
			for (int j = 0; j < n; j++) {
				if (map[i][j] > 0) {
					cnt += map[i][j];
				}
			}
			sb.append(cnt + "\n");
		}
		System.out.print(sb);
	}
}
