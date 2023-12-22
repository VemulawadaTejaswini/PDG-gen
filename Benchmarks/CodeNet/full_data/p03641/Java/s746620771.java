import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	class SegTree {
		int n;
		int[] v;

		public SegTree(int n) {
			this.n = 1;
			while (this.n < n)
				this.n = 2 * this.n;
			v = new int[2 * this.n - 1];
			Arrays.fill(v, Integer.MAX_VALUE / 3);
		}

		void put(int val, int k) {
			k += n - 1;
			v[k] = val;
			while (k > 0) {
				k = (k - 1) / 2;
				v[k] = Math.min(v[2 * k + 1], v[2 * k + 2]);
			}
		}

		int query(int a, int b) {
			return query(0, n, a, b, 0);
		}

		int query(int l, int r, int a, int b, int k) {
			if (a <= l && r <= b)
				return v[k];
			else if (r <= a || b <= l)
				return Integer.MAX_VALUE / 3;
			else {
				int lv = query(l, (l + r) / 2, a, b, 2 * k + 1);
				int rv = query((l + r) / 2, r, a, b, 2 * k + 2);
				return Math.min(lv, rv);
			}
		}

	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		int[] pos = new int[N];
		SegTree even = new SegTree(N);
		SegTree odd = new SegTree(N);
		for (int i = 0; i < N; ++i) {
			P[i] = sc.nextInt();
			--P[i];
			pos[P[i]] = i;
			if (i % 2 == 0) {
				even.put(P[i], i);
			} else {
				odd.put(P[i], i);
			}
		}
		g = new ArrayList[N];
		for (int i = 0; i < N; ++i)
			g[i] = new ArrayList<Integer>();
		deg = new int[N];
		calc(N, P, pos, even, odd, 0, N);
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < N; ++i)
			if (deg[i] == 0)
				pq.add(i);
		int[] ans = new int[N];
		int p = 0;
		while (!pq.isEmpty()) {
			int v = pq.poll();
			ans[p++] = v;
			for (int dst : g[v]) {
				deg[dst]--;
				if (deg[dst] == 0) {
					pq.add(dst);
				}
			}
		}
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < N; ++i) {
			System.out.print((ans[i] + 1) + (i == N - 1 ? "\n" : " "));
		}
		pw.close();
	}

	int[] deg;
	ArrayList<Integer>[] g;

	int calc(int N, int[] P, int[] pos, SegTree even, SegTree odd, int l, int r) {
		if (r - l < 2) {
			return Integer.MAX_VALUE / 3;
		}
		int first = (l % 2 == 0 ? even.query(l, r - 1) : odd.query(l, r - 1));
		if (first == Integer.MAX_VALUE / 3) {
			return Integer.MAX_VALUE / 3;
		}
		even.put(Integer.MAX_VALUE / 3, pos[first]);
		odd.put(Integer.MAX_VALUE / 3, pos[first]);
		int second = Integer.MAX_VALUE / 3;
		if (pos[first] % 2 == 0) {
			second = odd.query(pos[first] + 1, r);
		} else {
			second = even.query(pos[first] + 1, r);
		}
		g[first].add(second);
		deg[second]++;
		even.put(Integer.MAX_VALUE / 3, pos[second]);
		odd.put(Integer.MAX_VALUE / 3, pos[second]);
		int middle = calc(N, P, pos, even, odd, pos[first] + 1, pos[second]);
		int left = calc(N, P, pos, even, odd, l, pos[first]);
		int right = calc(N, P, pos, even, odd, pos[second], r);
		int[] vs = new int[] { middle, left, right };
		for (int v : vs) {
			if (v != Integer.MAX_VALUE / 3) {
				g[second].add(v);
				deg[v]++;
			}
		}
		return first;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}