import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<List<Integer>> edge;
	static int[] cnt;
	static int[] ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		edge = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			edge.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			edge.get(a).add(b);
			edge.get(b).add(a);
		}
		ans = new int[n];
		for (int i = 0; i < q; i++) {
			int p = sc.nextInt() - 1;
			int x = sc.nextInt();
			ans[p] += x;
		}

		dfs(0, -1);
		for (int i = 0; i < n; i++) {
			System.out.println(ans[i]);
		}
	}

	static void dfs(int v, int p) {
		for (int u : edge.get(v)) {
			if(u == p) continue;
			ans[u] += ans[v];
			dfs(u, v);
		}
	}
}