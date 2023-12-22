import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		int[][] map = new int[n][n];
		int bridge = 0;
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			map[a[i]][b[i]] = 1;
			map[b[i]][a[i]] = 1;
		}
		for (int i = 0; i < m; i++) {
			Deque<Integer> deque = new ArrayDeque<>();
			boolean memo[] = new boolean[n];
			deque.add(0);
			memo[0] = true;
			map[a[i]][b[i]] = 0;
			map[b[i]][a[i]] = 0;
			int cnt = 1;
			while (!deque.isEmpty()) {
				int t = deque.poll();
				for (int j = 0; j < n; j++) {
					if (!memo[j] && map[t][j] == 1) {
						memo[j] = true;
						deque.add(j);
						cnt++;
					}
				}
			}
			if (cnt != n) {
				bridge++;
			}
			map[a[i]][b[i]] = 1;
			map[b[i]][a[i]] = 1;
		}
		System.out.println(bridge);
	}
}
