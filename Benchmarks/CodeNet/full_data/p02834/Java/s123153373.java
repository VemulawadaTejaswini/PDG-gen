import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	List<List<Integer>> tree;
	int N, u, v;
	int[] du, dv;

	void dfs(int node, int d, int[] a) { // nodeからの各頂点への距離を返す(d=nodeまでの距離）
		a[node] = d;

		for (int n : tree.get(node)) {
			if (a[n] == -1) {
				dfs(n, d + 1, a);
			}
		}
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		N = sc.nextInt();
		u = sc.nextInt();
		v = sc.nextInt();

		tree = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			tree.add(new ArrayList<>());
		}

		for (int i = 0; i < N - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			tree.get(a).add(b);
			tree.get(b).add(a);
		}

		du = new int[N + 1];
		dv = new int[N + 1];

		Arrays.fill(du, -1);
		Arrays.fill(dv, -1);

		sc.close();

		dfs(u, 0, du);
		dfs(v, 0, dv);

		if (tree.get(u).size() == 1) {
			if (du[v] == 1) {
				// uが葉で、uとvの距離が1の場合は高橋君の移動回数は0
				out.println(0);
				return;
			} else if (du[v] == 2) {
				// uが葉で、uとvの距離が2の場合は高橋君の移動回数は1
				out.println(1);
				return;
			}

		}
		int ans = 0;

		for (int i = 1; i <= N; i++) {
			// uからの距離がvからの距離より近いものの頂点のうち、uからの距離が最大の頂点を探す
			if (du[i] <= dv[i]) {
				ans = Math.max(ans, du[i]);
			}
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
