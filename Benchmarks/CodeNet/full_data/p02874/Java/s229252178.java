import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public final class Main {
	static Scanner sc = new Scanner(in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		Pair[] pairs = new Pair[N];
		for (int i = 0; i < N; i++) {
			int L = sc.nextInt();
			int R = sc.nextInt();
			pairs[i] = new Pair(L, R);
		}
		Arrays.sort(pairs);
		int[] f = new int[N];
		int[] b = new int[N];
		int min = 0;
		int max = 1000000000;
		for (int i = 0; i < N; i++) {
			min = Math.max(min, pairs[i].l);
			max = Math.min(max, pairs[i].r);
			f[i] = Math.max(0, max - min + 1);
		}
		min = 0;
		max = 1000000000;
		for (int i = N - 1; i >= 0; i--) {
			min = Math.max(min, pairs[i].l);
			max = Math.min(max, pairs[i].r);
			b[i] = Math.max(0, max - min + 1);
		}
		int ans = 0;
		for (int i = 0; i < N - 1; i++) {
			ans = Math.max(ans, f[i] + b[i + 1]);
		}
		int[] rs = new int[N];
		for (int i = 0; i < N; i++) {
			rs[i] = pairs[i].r;
		}
		Arrays.sort(rs);
		for (int i = 0; i < N; i++) {
			int v = pairs[i].r - pairs[i].l + 1;
			int ml = i == N - 1 ? pairs[N - 2].l : pairs[N - 1].l;
			int mr = pairs[i].r == rs[0] ? rs[1] : rs[0];
			v += Math.max(0, mr - ml + 1);
			ans = Math.max(ans, v);
		}
		System.out.println(ans);
	}

	static class Pair implements Comparable<Pair> {
		int l, r;

		public Pair(int l, int r) {
			this.l = l;
			this.r = r;
		}

		@Override
		public int compareTo(Pair o) {
			if (this.l != o.l) return Integer.compare(this.l, o.l);
			return Integer.compare(this.r, o.r);
		}
	}
}
