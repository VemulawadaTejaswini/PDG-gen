import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Main {
	static int n;
	static List<List<Integer>> list;
	static int[] dv;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		n = Integer.parseInt(sa[0]);
		int u = Integer.parseInt(sa[1]) - 1;
		int v = Integer.parseInt(sa[2]) - 1;
		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			list.get(a).add(b);
			list.get(b).add(a);
		}
		br.close();

		dv = new int[n];
		dfs(v, -1);

		int[] du = new int[n];
		Arrays.fill(du, -1);
		Queue<Integer> que = new ArrayDeque<>();
		que.add(u);
		du[u] = 0;
		while (!que.isEmpty()) {
			int x = que.poll();
			for (int i : list.get(x)) {
				if (du[i] == -1 && du[x] + 1 < dv[i]) {
					que.add(i);
					du[i] = du[x] + 1;
				}
			}
		}

		int max = -1;
		for (int i = 0; i < n; i++) {
			if (du[i] >= 0) {
				max = Math.max(max, dv[i]);
			}
		}
		System.out.println(max - 1);
	}

	static void dfs(int x, int p) {
		for (int i : list.get(x)) {
			if (i != p) {
				dv[i] = dv[x] + 1;
				dfs(i, x);
			}
		}
	}
}
