import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Edge{
	int to;
	int cost;
	public Edge(int to, int cost) {
		this.to = to;
		this.cost = cost;
	}
}

public class Main {
	static List<Edge>[] tree;
	static long result = 0;
	static int flag = 0;

	static void dfs(boolean[] seen, int parent, int goal, long cost_from_p) {
		seen[parent] = true;
		for(Edge next : tree[parent]) {
			if(seen[next.to]) continue;
			long costs = cost_from_p + next.cost;
			if(next.to == goal) {
				result += costs;
				flag++;
				if(flag == 2) {
					System.out.println(result);
				}
			}
			if(flag == 2) return;
			dfs(seen, next.to, goal, costs);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] seen = new boolean[n];
		tree = new ArrayList[n];

		for(int i = 0; i < n; i++) {
			tree[i] = new ArrayList<>();
		}

		for(int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int c = sc.nextInt();
			tree[a].add(new Edge(b, c));
			tree[b].add(new Edge(a, c));
		}

		int q = sc.nextInt();
		int k = sc.nextInt() - 1;
		int[] x = new int[q];
		int[] y = new int[q];

		for(int i = 0; i < q; i++) {
			x[i] = sc.nextInt() - 1;
			y[i] = sc.nextInt() - 1;
		}

		for(int i = 0; i < q; i++) {
			flag = 0;
			dfs(seen, k, x[i], 0);
			Arrays.fill(seen, false);

			flag = 0;
			dfs(seen, k, y[i], 0);
			Arrays.fill(seen, false);

			System.out.println(result);
			result = 0;
		}
		sc.close();
	}
}