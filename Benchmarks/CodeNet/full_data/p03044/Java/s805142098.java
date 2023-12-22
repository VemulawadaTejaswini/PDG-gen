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
		List<List<Hen>> list = new ArrayList<List<Hen>>();
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<Hen>());
		}
		for (int i = 0; i < n - 1; i++) {
			sa = br.readLine().split(" ");
			Hen h = new Hen();
			h.u = Integer.parseInt(sa[0]) - 1;
			h.v = Integer.parseInt(sa[1]) - 1;
			h.w = Integer.parseInt(sa[2]);
			list.get(h.u).add(h);
			list.get(h.v).add(h);
		}
		br.close();

		boolean[] flg = new boolean[n];
		int[] ans = new int[n];
		Queue<Integer> que = new ArrayDeque<Integer>();
		que.add(0);
		flg[0] = true;
		while (!que.isEmpty()) {
			int cur = que.poll();
			List<Hen> list2 = list.get(cur);
			for (int i = 0; i < list2.size(); i++) {
				Hen h = list2.get(i);
				int next = h.u;
				if (next == cur) {
					next = h.v;
				}
				if (!flg[next]) {
					que.add(next);
					flg[next] = true;
					if (h.w % 2 == 0) {
						ans[next] = ans[cur];
					} else {
						ans[next] = ans[cur]^ 1;
					}
				}
			}
		}

		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

	static class Hen {
		int u, v, w;
	}
}
