import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		List<List<Integer>> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int x = Integer.parseInt(sa[0]);
			int y = Integer.parseInt(sa[1]);
			list.get(x).add(y);
			list.get(y).add(x);
		}
		br.close();

		int use = 2 * (n - 1 - m);
		if (use == 0) {
			System.out.println(0);
		} else if (use > n) {
			System.out.println("Impossible");
		} else {
			long ans = 0;
			boolean[] used = new boolean[n];
			boolean[] visit = new boolean[n];
			for (int i = 0; i < n; i++) {
				if (!visit[i]) {
					int min = Integer.MAX_VALUE;
					int idx = -1;
					Queue<Integer> que = new ArrayDeque<>();
					que.add(i);
					visit[i] = true;
					while (!que.isEmpty()) {
						int cur = que.poll();
						if (a[cur] < min) {
							min = a[cur];
							idx = cur;
						}
						for (int next : list.get(cur)) {
							if (!visit[next]) {
								que.add(next);
								visit[next] = true;
							}
						}
					}
					used[idx] = true;
					ans += min;
				}
			}
			PriorityQueue<Integer> que = new PriorityQueue<>();
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				if (used[i]) {
					cnt++;
				} else {
					que.add(a[i]);
				}
			}
			for (int i = 0; i < use - cnt; i++) {
				ans += que.poll();
			}
			System.out.println(ans);
		}
	}
}
