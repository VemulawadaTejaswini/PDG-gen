import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<Integer>[] adj;
	static List<Integer>[] used;
	static int[] root;
	static int[] color;
	static int cMax = 1;

	static void dfs(int v, int prev) {
		int c = 1;
		for (int next : adj[v]) {
			if (next == prev)
				continue;
			root[next] = v;
			while (used[v].contains(c))
				c++;
			color[next] = c;
			used[v].add(c);
			used[next].add(c);
			if (c > cMax)
				cMax = c;
			dfs(next, v);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		adj = new List[n];
		used = new List[n];
		root = new int[n];
		color = new int[n];
		for (int i = 0; i < n; i++) {
			adj[i] = new ArrayList<Integer>();
			used[i] = new ArrayList<Integer>();
		}

		int[][] edges = new int[n - 1][2];
		for (int i = 0, a, b; i < n - 1; i++) {
			a = scanner.nextInt() - 1;
			b = scanner.nextInt() - 1;
			edges[i][0] = a;
			edges[i][0] = b;
			adj[a].add(b);
			adj[b].add(a);
		}

		dfs(0, -1);
		System.out.println(cMax);
		for (int i = 0, a, b; i < n - 1; i++) {
			a = edges[i][0];
			b = edges[i][1];
			System.out.println(root[b] == a ? color[b] : color[a]);
		}

	}

}
