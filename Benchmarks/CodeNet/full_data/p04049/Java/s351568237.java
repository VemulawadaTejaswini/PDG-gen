import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	List<Integer>[] e;

	void dfs(int k, boolean[] f, int[] depth, int dep, boolean[] delete) {
		if (f[k] || delete[k]) {
			return;
		}
		f[k] = true;
		depth[k] = dep;
		for (Integer to : e[k]) {
			dfs(to, f, depth, dep + 1, delete);
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		e = new LinkedList[n];
		for (int i = 0; i < n; i++) {
			e[i] = new LinkedList<Integer>();
		}
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			e[a].add(b);
			e[b].add(a);
		}

		boolean[] delete = new boolean[n];

		for (int ii = 0; ii < n; ii++) {
			int[] depth = new int[n];
			boolean[] flag = new boolean[n];
			dfs(0, flag, depth, 0, delete);
			int root = 0;
			for (int i = 0; i < n; i++) {
				if (!delete[k] && depth[root] < depth[i]) {
					root = i;
				}
			}
			Arrays.fill(flag, false);
			Arrays.fill(depth, 0);
			dfs(root, flag, depth, 0, delete);
			for (int i = 0; i < n; i++) {
				if (k < depth[i]) {
					delete[i] = true;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (delete[i]) {
				sum++;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
