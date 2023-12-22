// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static final long INF = 0x3f3f3f3f3f3f3f3fL;
	static final int A = 50;
	int[] oo; int[][] oh;
	void link(int i, int h) {
		int o = oo[i];
		if (o >= 2 && (o & o - 1) == 0)
			oh[i] = Arrays.copyOf(oh[i], o << 1);
		oh[i][oo[i]++] = h;
	}
	int[] aa, bb, ij;
	void init(int n, int m) {
		oo = new int[n]; oh = new int[n][2];
		aa = new int[m + n]; bb = new int[m + n]; ij = new int[m + n];
	}
	long[] dd; int[] pq, iq; int cnt;
	boolean lt(int i, int j) {
		return dd[i] < dd[j];
	}
	int p2(int p) {
		return (p *= 2) > cnt ? 0 : p < cnt && lt(iq[p + 1], iq[p]) ? p + 1 : p;
	}
	void pq_up(int i) {
		int j, p, q;
		for (p = pq[i]; (q = p / 2) > 0 && lt(i, j = iq[q]); p = q)
			iq[pq[j] = p] = j;
		iq[pq[i] = p] = i;
	}
	void pq_dn(int i) {
		int j, p, q;
		for (p = pq[i]; (q = p2(p)) > 0 && lt(j = iq[q], i); p = q)
			iq[pq[j] = p] = j;
		iq[pq[i] = p] = i;
	}
	void pq_add_last(int i) {
		iq[pq[i] = ++cnt] = i;
	}
	int pq_remove_first() {
		int i = iq[1], j = iq[cnt--];
		if (j != i) {
			pq[j] = 1; pq_dn(j);
		}
		pq[i] = 0;
		return i;
	}
	void main() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		init(n, m);
		for (int h = 0; h < m; h++) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			aa[h] = -sc.nextInt();
			bb[h] = sc.nextInt();
			ij[h] = i ^ j;
			link(i, h);
			link(j, h);
		}
		for (int h = m, i = 0; i < n; h++, i++) {
			aa[h] = sc.nextInt();
			bb[h] = sc.nextInt();
			link(i, h);
		}
		int md = n * A + 1;
		s = Math.min(s, md - 1);
		pq = new int[n * md]; iq = new int[1 + n * md];
		dd = new long[n * md]; Arrays.fill(dd, INF);
		dd[s] = 0; pq_add_last(s);
		while (cnt > 0) {
			int u = pq_remove_first(), i = u / md; s = u % md;
			for (int o = 0; o < oo[i]; o++) {
				int h = oh[i][o], j = i ^ ij[h], t = s + aa[h];
				if (t < 0)
					continue;
				t = Math.min(t, md - 1);
				int v = j * md + t;
				long d = dd[u] + bb[h];
				if (dd[v] > d) {
					if (dd[v] == INF)
						pq_add_last(v);
					dd[v] = d; pq_up(v);
				}
			}
		}
		for (int i = 1; i < n; i++) {
			long d = INF;
			for (s = 0; s < md; s++) {
				int u = i * md + s;
				d = Math.min(d, dd[u]);
			}
			println(d);
		}
	}
}
