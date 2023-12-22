import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int u = Integer.parseInt(sa[0]) - 1;
			int v = Integer.parseInt(sa[1]) - 1;
			List<Integer> list = map.get(u);
			if (list == null) {
				list = new ArrayList<>();
				map.put(u, list);
			}
			list.add(v);
		}
		sa = br.readLine().split(" ");
		int s = Integer.parseInt(sa[0]) - 1;
		int t = Integer.parseInt(sa[1]) - 1;
		br.close();

		boolean[][] visit = new boolean[n][3];
		int[] cnt = new int[n];
		visit[s][0] = true;
		cnt[s] = 1;
		Queue<Ken> que = new ArrayDeque<Ken>();
		Ken ken = new Ken();
		ken.p = s;
		ken.cnt = 1;
		que.add(ken);
		while (!que.isEmpty()) {
			Ken cur = que.poll();
			List<Integer> list = map.get(cur.p);
			if (list == null) {
				continue;
			}
			for (int next : list) {
				if (cur.k == 2) {
					if (!visit[next][0]) {
						visit[next][0] = true;
						cnt[next] = cur.cnt + 1;
						if (next == t) {
							break;
						}
						ken = new Ken();
						ken.p = next;
						ken.cnt = cnt[next];
						que.add(ken);
					}
				} else {
					visit[next][cur.k + 1] = true;
					ken = new Ken();
					ken.p = next;
					ken.k = cur.k + 1;
					ken.cnt = cur.cnt;
					que.add(ken);
				}
			}
		}
		System.out.println(cnt[t] - 1);
	}

	static class Ken {
		int p, k, cnt;
	}
}
