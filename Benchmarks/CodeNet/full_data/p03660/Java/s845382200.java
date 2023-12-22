import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	static int n;
	static int[][] m = new int[10000][10000];
	static int max = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();

		// ノード同士の関係を記録
		for (int i = 0; i < n - 1; i++) {
			int a = scan.nextInt() - 1;
			int b = scan.nextInt() - 1;
			m[a][b] = 1;
			m[b][a] = 1;

		}
		int[] f = bfs(0);
		int[] s = bfs(n - 1);
		int ansF = 0;
		int ansS = 0;
		int flag = 1;
		for (int i = 0; i < n; i++) {
			if (f[i] < s[i]) {
				ansF++;

			} else if (f[i] > s[i]) {
				ansS++;

			} else {
				if (flag % 2 == 1) {
					ansF++;
					flag++;
				} else {
					ansS++;
					flag++;
				}
			}
		}
		if (ansF > ansS) {
			System.out.println("Fennec");
		} else {
			System.out.println("Snuke");
		}

	}

	public static int[] bfs(int u) {
		int[] ans = new int[10000];
		Deque<Integer> q = new ArrayDeque<Integer>();
		q.offer(u);
		Arrays.fill(ans, max);
		ans[u] = 0;

		while (!q.isEmpty()) {
			// 調べるノードを取り出す
			int v = q.poll();
			for (int i = 0; i < n; i++) {
				if (m[v][i] == 0) {
					continue;
				}
				if (ans[i] != max) {
					continue;
				}
				ans[i] = ans[v] + 1;
				q.offer(i);
			}
		}
		return ans;

	}

}