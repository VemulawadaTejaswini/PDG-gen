import java.util.Scanner;

public class Main {
	private static int cnt;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int t[][] = new int[n][n];
		int memo[] = new int[n];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			t[a][b] = 1;
			t[b][a] = 1;
		}
		cnt = 0;
		memo[0] = 1;
		dfs(t, memo, 0, n - 1);
		System.out.println(cnt);
	}

	private static void dfs(int[][] t, int[] memo, int now, int rest) {
		if (rest == 0) {
			cnt++;
			return;
		}
		for (int i = 0; i < t.length; i++) {
			if (t[now][i] == 1 && memo[i] != 1) {
				memo[i] = 1;
				dfs(t, memo, i, rest - 1);
				memo[i] = 0;
			}
		}
	}
}