import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		List<List<Hen>> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			Hen h = new Hen();
			h.u = Integer.parseInt(sa[0]) - 1;
			h.v = Integer.parseInt(sa[1]) - 1;
			h.s = Integer.parseInt(sa[2]);
			list.get(h.u).add(h);
			list.get(h.v).add(h);
		}
		br.close();

		Queue<Integer> que = new ArrayDeque<>();
		long min = 1;
		long max = Integer.MAX_VALUE;
		Long[] x = new Long[n];
		Long[] y = new Long[n];
		x[0] = 0L;
		que.add(0);
		while (!que.isEmpty()) {
			int cur = que.poll();
			for (Hen h : list.get(cur)) {
				if (!h.used) {
					h.used = true;
					int next = h.u;
					if (next == cur) {
						next = h.v;
					}
					if (x[cur] != null) {
						long alt = h.s - x[cur];
						if (y[next] == null) {
							y[next] = alt;
							max = Math.min(max, alt - 1);
							que.add(next);
						} else if (y[next] != alt) {
							System.out.println(0);
							return;
						}
					}
					if (y[cur] != null) {
						long alt = h.s - y[cur];
						if (x[next] == null) {
							x[next] = alt;
							min = Math.max(min, -alt + 1);
							que.add(next);
						} else if (x[next] != alt) {
							System.out.println(0);
							return;
						}
					}
					if (x[next] != null && y[next] != null) {
						long val = y[next] - x[next];
						if (val % 2 != 0) {
							System.out.println(0);
						} else {
							System.out.println(val / 2);
						}
						return;
					}
				}
			}
		}
		System.out.println(Math.max(max - min + 1, 0));
	}

	static class Hen {
		int u, v, s;
		boolean used;
	}
}
