import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		List<List<Hen>> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		Hen[] arr = new Hen[n - 1];
		for (int i = 0; i < n - 1; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			Hen h = new Hen(a, b);
			arr[i] = h;
			list.get(a).add(h);
			list.get(b).add(h);
		}
		br.close();

		int k = 0;
		boolean[] visit = new boolean[n];
		Queue<Integer> que = new ArrayDeque<>();
		que.add(0);
		visit[0] = true;
		while (!que.isEmpty()) {
			int cur = que.poll();
			Set<Integer> set = new HashSet<>();
			for (Hen h : list.get(cur)) {
				set.add(h.c);
			}
			int i = 1;
			for (Hen h : list.get(cur)) {
				if (h.c == 0) {
					for ( ; i < n; i++) {
						if (!set.contains(i)) {
							h.c = i;
							set.add(i);
							k = Math.max(k, i);
							break;
						}
					}
					if (cur == h.a && !visit[h.b]) {
						que.add(h.b);
						visit[h.b] = true;
					} else if (cur == h.b && !visit[h.a]) {
						que.add(h.a);
						visit[h.a] = true;
					}
				}
			}
		}

		System.out.println(k);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].c);
		}
	}

	static class Hen {
		int a, b, c;

		public Hen(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}
}
