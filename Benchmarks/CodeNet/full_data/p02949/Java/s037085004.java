import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int p = Integer.parseInt(sa[2]);
		int[] a = new int[m];
		int[] b = new int[m];
		int[] c = new int[m];
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]) - 1;
			b[i] = Integer.parseInt(sa[1]) - 1;
			c[i] = Integer.parseInt(sa[2]);
			c[i] = p - c[i];
		}
		br.close();

		List<List<Integer>> list1 = new ArrayList<>(n);
		List<List<Integer>> listn = new ArrayList<>(n);
		for (int j = 0; j < n; j++) {
			list1.add(new ArrayList<>());
			listn.add(new ArrayList<>());
		}
		for (int j = 0; j < m; j++) {
			list1.get(a[j]).add(j);
			listn.get(b[j]).add(j);
		}
		boolean[] visit1 = new boolean[n];
		boolean[] visitn = new boolean[n];
		dfs(0, -1, visit1, list1, b);
		dfs(n - 1, -1, visitn, listn, a);

		int s = 0;
		long[] d = new long[n];
		Arrays.fill(d, 1_000_000_000_000_000_000L);
		d[s] = 0;
		boolean upd = true;
		for (int i = 0; i <= n && upd; i++) {
			upd = false;
			for (int j = 0; j < m; j++) {
				if (visit1[a[j]] && visitn[b[j]]) {
					long alt = d[a[j]] + c[j];
					if (d[b[j]] > alt) {
						d[b[j]] = alt;
						upd = true;
					}
				}
			}
			if (i == n) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(Math.max(-d[n - 1], 0));
	}

	static void dfs(int x, int p, boolean[] visit, List<List<Integer>> list, int[] to) {
		visit[x] = true;
		for (int i : list.get(x)) {
			if (!visit[to[i]]) {
				dfs(to[i], x, visit, list, to);
			}
		}
	}
}
