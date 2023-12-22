import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static long M = 1_000_000_007;
	private static List<Integer>[] g;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		g = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
		}

		for (int i = 0; i < n - 1; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			g[x].add(y);
			g[y].add(x);
		}

		long answer = (k * dfs(0, k, 0 - 1)) % M;
		System.out.println(answer);
	}


	private static long dfs(int v, int k, int from) {
		int color = (from == -1) ? k - 1 : k - 2;
		if (k < g[v].size()) return 0;
		long a = 1;
		for (int x : g[v]) {
			if (x == from) continue;
			a = (a * color) % M;
			color--;
		}

		for (int x : g[v]) {
			if (x == from) continue;
			a = (a * dfs(x, k, v)) % M;
		}

		return a;
	}
}
