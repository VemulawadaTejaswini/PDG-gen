import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] h = new int[N];
		int maxH = 0;
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
			maxH = Math.max(maxH, h[i]);
		}
		SegTree st = new SegTree(maxH + 1);
		long answer = 0;
		for (int i = 0; i < N; i++) {
			long a = sc.nextLong();

			long v = st.query(1, h[i]) + a;
			answer = Math.max(answer, v);
			st.update(h[i], h[i] + 1, v);
		}

		System.out.println(answer);
	}

	static class SegTree {

		private static final long MIN = 0;
		private final int n;
		private long[] data;
		private long[] x;

		SegTree(int n) {
			int t = 1;
			while (t < n) t <<= 1;
			this.n = t;
			this.data = new long[t * 2 - 1];
			this.x = new long[t * 2 - 1];
		}

		// [a, b) max
		public long query(int a, int b) {
			return query(a, b, 0, 0, n);
		}

		private long query(int a, int b, int k, int l, int r) {
			if (l >= b || a >= r) return MIN;
			if (a <= l && r <= b) return data[k];
			long vl = query(a, b, k * 2 + 1, l, (l + r) / 2);
			long vr = query(a, b, k * 2 + 2, (l + r) / 2, r);
			return Math.max(vl, vr) + x[k];
		}

		public void update(int l, int r, long v) {
			update(l, r, v, 0, 0, n);
		}

		private void update(int a, int b, long v, int k, int l, int r) {
			if (b <= l || r <= a) return;
			if (a <= l && r <= b) {
				data[k] += v;
				x[k] += v;
				return;
			}

			update(a, b, v, k * 2 + 1, l, (l + r) / 2);
			update(a, b, v, k * 2 + 2, (l + r) / 2, r);
			data[k] = Math.max(data[k * 2 + 1], data[k * 2 + 2]) + x[k];
		}
	}
}
