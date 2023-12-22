import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static long[] x;
	static boolean[] fix;
	static List<List<Hen>> list;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		Hen[] arr = new Hen[m];
		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			Hen h = new Hen();
			h.l = Integer.parseInt(sa[0]) - 1;
			h.r = Integer.parseInt(sa[1]) - 1;
			h.d = Integer.parseInt(sa[2]);
			arr[i] = h;
			list.get(h.l).add(h);
			list.get(h.r).add(h);
		}
		br.close();

		x = new long[n];
		fix = new boolean[n];
		try {
			for (int i = 0; i < n; i++) {
				if (!fix[i]) {
					fix[i] = true;
					x[i] = 0L;
					dfs(i);
				}
			}
		} catch (Exception e) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}

	static void dfs(int cur) {
		for (Hen h : list.get(cur)) {
			int next = h.r;
			int d = h.d;
			if (cur == h.r) {
				next = h.l;
				d = -d;
			}
			if (!h.used) {
				h.used = true;
				if (!fix[next]) {
					fix[next] = true;
					x[next] = x[cur] + d;
				} else {
					if (x[next] - x[cur] != d) {
						throw new RuntimeException();
					}
				}
				dfs(next);
			}
		}
	}

	static class Hen {
		int l, r, d;
		boolean used;
	}
}
