import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			--a[i];
		}
		solver(n, k, a);
	}

	void solver(int n, int k, int[] a) {
		// i->a[i]
		ArrayList<Integer>[] g = new ArrayList[n];
		for (int i = 0; i < g.length; ++i)
			g[i] = new ArrayList<>();
		for (int i = 1; i < n; ++i) {
			g[a[i]].add(i);
		}
		int ans = 0;
		if (a[0] != 0) {
			++ans;
			a[0] = 0;
		}
		ans += dfs(0, 0, g, k);
		System.out.println(ans);
	}

	int dfs(int cur, int depth, ArrayList<Integer>[] g, int K) {
		int ret = 0;
		if (K < depth) {
			depth = 0;
			++ret;
		}
		for (int dst : g[cur]) {
			ret += dfs(dst, depth + 1, g, K);
		}
		return ret;
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
