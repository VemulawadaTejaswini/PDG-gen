import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	static int n, m;
	static int[] a, b, c;
	static List<List<Integer>> list, list2;
	static boolean[] visit, visit2;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		n = Integer.parseInt(sa[0]);
		m = Integer.parseInt(sa[1]);
		int p = Integer.parseInt(sa[2]);
		a = new int[m];
		b = new int[m];
		c = new int[m];
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]) - 1;
			b[i] = Integer.parseInt(sa[1]) - 1;
			c[i] = Integer.parseInt(sa[2]);
			c[i] = p - c[i];
		}
		br.close();

		int s = 0;
		long[] d = new long[n];
		Arrays.fill(d, 1_000_000_000_000_000_000L);
		d[s] = 0;
		boolean upd = true;
		for (int i = 0; i <= n && upd; i++) {
			upd = false;
			for (int j = 0; j < m; j++) {
				long alt = d[a[j]] + c[j];
				if (d[b[j]] > alt) {
					d[b[j]] = alt;
					upd = true;
				}
			}
			if (i == n) {
				list = new ArrayList<>(n);
				list2 = new ArrayList<>(n);
				for (int j = 0; j < n; j++) {
					list.add(new ArrayList<>());
					list2.add(new ArrayList<>());
				}
				for (int j = 0; j < m; j++) {
					list.get(a[j]).add(j);
					list2.get(b[j]).add(j);
				}
				visit2 = new boolean[n];
				dfs2(n - 1, -1);

				visit = new boolean[n];
				if (dfs(0, -1)) {
					System.out.println(-1);
					return;
				}
				break;
			}
		}
		System.out.println(Math.max(-d[n - 1], 0));
	}

	static boolean dfs(int x, int p) {
		visit[x] = true;
		for (int i : list.get(x)) {
			if (b[i] == p) {
				continue;
			}
			if (!visit[b[i]]) {
				if (dfs(b[i], x)) {
					return true;
				}
			} else {
				if (visit2[b[i]]) {
					return true;
				}
			}
		}
		return false;
	}

	static void dfs2(int x, int p) {
		visit2[x] = true;
		for (int i : list2.get(x)) {
			if (!visit2[a[i]]) {
				dfs2(a[i], x);
			}
		}
	}
}
