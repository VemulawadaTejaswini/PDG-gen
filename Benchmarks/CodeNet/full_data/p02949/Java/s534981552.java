import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int p = Integer.parseInt(sa[2]);
		Hen[] arr = new Hen[m];
		Map<Integer, List<Hen>> map = new HashMap<Integer, List<Hen>>();
		Map<Integer, List<Hen>> map2 = new HashMap<Integer, List<Hen>>();
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			Hen h = new Hen();
			h.a = Integer.parseInt(sa[0]) - 1;
			h.b = Integer.parseInt(sa[1]) - 1;
			h.c = (Integer.parseInt(sa[2]) - p) * -1;
			arr[i] = h;

			List<Hen> list = map.get(h.a);
			if (list == null) {
				list = new ArrayList<Hen>();
				map.put(h.a, list);
			}
			list.add(h);
			list = map2.get(h.b);
			if (list == null) {
				list = new ArrayList<Hen>();
				map2.put(h.b, list);
			}
			list.add(h);
		}
		br.close();

		boolean[] flg1 = new boolean[n];
		boolean[] flgN = new boolean[n];
		ArrayDeque<Integer> que = new ArrayDeque<Integer>();
		que.add(0);
		flg1[0] = true;
		while (!que.isEmpty()) {
			Integer cur = que.poll();
			List<Hen> list = map.get(cur);
			if (list != null) {
				for (Hen h : list) {
					if (!flg1[h.b]) {
						que.add(h.b);
						flg1[h.b] = true;
					}
				}
			}
		}

		new ArrayDeque<Integer>();
		que.add(n - 1);
		flgN[n - 1] = true;
		while (!que.isEmpty()) {
			Integer cur = que.poll();
			List<Hen> list = map2.get(cur);
			if (list != null) {
				for (Hen h : list) {
					if (!flgN[h.a]) {
						que.add(h.a);
						flgN[h.a] = true;
					}
				}
			}
		}

		int[] d = new int[n];
		for (int i = 1; i < n; i++) {
			d[i] = Integer.MAX_VALUE;
		}
		boolean upd = true;
		for (int i = 0; i <= n && upd; i++) {
			upd = false;
			for (int j = 0; j < m; j++) {
				Hen h = arr[j];
				if (!flg1[h.a] || !flgN[h.b]) {
					continue;
				}
				int alt = d[h.a] + h.c;
				if (d[h.b] > alt) {
					d[h.b] = alt;
					upd = true;
				}
			}
			if (i == n) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(Math.max(-d[n - 1], 0));
	}

	static class Hen {
		int a, b, c;
	}
}
