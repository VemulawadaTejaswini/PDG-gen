import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Stack;

import javax.management.Query;

public class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	void solve() {
		int N = ni();
		int M = ni();
		long[] A = new long[N];// 8*N<=4*10^4=40KB
		for (int i = 1; i < N; ++i) {
			A[i] = ni();
		}
		int[][] B = new int[M][N];// (4*N)*(4*M)<=40KB*800B=32MB
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < M; ++j) {
				B[j][i] = ni();
			}
		}
		int[][] a = new int[N][2];// 4*2*N<=80KB
		int[] mate = new int[N];// 4*N<=40KB
		boolean[] vis = new boolean[N];// 4*N<=40KB

		Stack<int[]>[] pq = new Stack[N + 1];
		for (int i = 0; i < pq.length; ++i)
			pq[i] = new Stack<>();
		for (int i = 0; i < M; ++i) {
			for (int j = 0; j < N; ++j) {
				a[j][0] = j;
				a[j][1] = B[i][j];
			}
			B[i] = null;
			Arrays.sort(a, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return Integer.compare(o1[1], o2[1]);
				}
			});
			Arrays.fill(vis, false);
			for (int j = 0; j < N; ++j) {
				mate[j] = j;
			}
			for (int j = 0; j < N; ++j) {
				int idx = a[j][0];
				int l = idx, r = idx;
				if (idx > 0 && vis[idx - 1]) {
					l = mate[idx - 1];
				}
				if (idx + 1 < N && vis[idx + 1]) {
					r = mate[idx + 1];
				}
				pq[l].add(new int[] { idx, a[j][1] });
				pq[idx + 1].add(new int[] { r + 1, a[j][1] });
				pq[l].add(new int[] { r + 1, -a[j][1] });
				pq[idx + 1].add(new int[] { idx, -a[j][1] });
				vis[idx] = true;
				if (idx > 0 && idx + 1 < N && vis[idx - 1] && vis[idx + 1]) {
					mate[l] = r;
					mate[r] = l;
				} else if (idx > 0 && vis[idx - 1]) {
					mate[l] = idx;
					mate[idx] = l;
				} else if (idx + 1 < N && vis[idx + 1]) {
					mate[r] = idx;
					mate[idx] = r;
				}
			}
		}
		long[] sum = new long[N];
		for (int i = 0; i < N; ++i) {
			if (i > 0)
				A[i] += A[i - 1];
		}
		long best = 0;
		long[] lazy = new long[N + 1];
		for (int i = 0; i < N; ++i) {
			Arrays.fill(lazy, 0);
			for (int[] q : pq[i]) {
				lazy[q[0]] += q[1];
			}
			for (int j = i; j < N; ++j) {
				if (j > 0)
					lazy[j] += lazy[j - 1];
				sum[j] += lazy[j];
				best = Math.max(best, sum[j] - (A[j] - A[i]));
			}
		}
		out.println(best);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	InputStream is;
	PrintWriter out;
	String INPUT = "";

	void run() throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);

		long s = System.currentTimeMillis();
		solve();
		out.flush();
		// if (!INPUT.isEmpty())
//		 tr(System.currentTimeMillis() - s + "ms");
		// Thread t = new Thread(null, null, "~",
		// Runtime.getRuntime().maxMemory()){
		// @Override
		// public void run() {
		// long s = System.currentTimeMillis();
		// solve();
		// out.flush();
		// if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
		// }
		// };
		// t.start();
		// t.join();
	}

	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;

	private int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}

	private boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}

	private int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}

	private double nd() {
		return Double.parseDouble(ns());
	}

	private char nc() {
		return (char) skip();
	}

	private String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != '
									// ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	private char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b))) {
			buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	private int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}

	private long[] nal(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}

	private char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}

	private int[][] nmi(int n, int m) {
		int[][] map = new int[n][];
		for (int i = 0; i < n; i++)
			map[i] = na(m);
		return map;
	}

	private int ni() {
		return (int) nl();
	}

	private long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
}