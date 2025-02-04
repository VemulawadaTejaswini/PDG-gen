import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	static List<Integer> path;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int p = Integer.parseInt(sa[2]);
		Map<Integer, List<Hen>> map = new HashMap<Integer, List<Hen>>();
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			Hen h = new Hen();
			h.i = i;
			h.a = Integer.parseInt(sa[0]) - 1;
			h.b = Integer.parseInt(sa[1]) - 1;
			h.c = Integer.parseInt(sa[2]) - p;

			List<Hen> list = map.get(h.a);
			if (list == null) {
				list = new ArrayList<Hen>();
				map.put(h.a, list);
			}
			list.add(h);
		}
		br.close();

		long val = 100000000000000L;
		long val2 = 10000000000000L;
		boolean[] used = new boolean[m];
		long[] score = new long[n];
		for (int i = 1; i < n; i++) {
			score[i] = Long.MIN_VALUE;
		}
		ArrayDeque<Integer> que = new ArrayDeque<Integer>();
		que.add(0);
		while (!que.isEmpty()) {
			Integer cur = que.pollLast();
			List<Hen> list = map.get(cur);
			if (list != null) {
				for (Hen h : list) {
					if (used[h.i]) {
						if (score[h.b] < val2) {
							if (score[h.b] < score[cur] + h.c) {
								que.add(h.b);
								score[h.b] = val;
							}
						}
					} else {
						used[h.i] = true;
						if (score[h.b] < score[cur] + h.c) {
							que.add(h.b);
							score[h.b] = score[cur] + h.c;
						}
					}
				}
			}
		}

		if (score[n - 1] >= val2) {
			System.out.println(-1);
		} else {
			System.out.println(Math.max(score[n - 1], 0));
		}
	}

	static class Hen {
		int i, a, b, c;
	}
}
