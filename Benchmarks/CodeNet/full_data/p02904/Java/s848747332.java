import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.function.BinaryOperator;

public class Main {

	static PrintWriter out;
	static InputReader ir;

	static void solve() {
		int n = ir.nextInt();
		int k = ir.nextInt();
		long[] a = ir.nextLongArray(n);
		ArrayList<Integer> bgn = new ArrayList<>();
		bgn.add(0);
		for (int i = 0; i < n - 1; i++) {
			if (a[i] > a[i + 1])
				bgn.add(i + 1);
		}
		bgn.add(n);
		BinaryOperator<Long> f = (A, B) -> Math.min(A, B);
		BinaryOperator<Long> f2 = (A, B) -> Math.max(A, B);
		DisjointSparseTable dismin = new DisjointSparseTable(f, a);
		DisjointSparseTable dismax = new DisjointSparseTable(f2, a);
		boolean x = false;
		int res = 0;
		for (int i = 0; i <= n - k; i++) {
			int idx = upper_bound(bgn, 0, bgn.size() - 1, (long) i) - 1;
			if (bgn.get(idx + 1) > i + k - 1) {
				x = true;
				continue;
			}
			if (i != 0 && dismax.query(i, i + k) == a[i + k - 1] && dismin.query(i - 1, i + k) == a[i - 1]) {
				;
			} else {
				res++;
			}
		}
		if (x) {
			res++;
		}
		out.println(res);
	}

	public static int upper_bound(ArrayList<Integer> a, int fromIndex, int toIndex, long val) {
		if (val >= a.get(toIndex))
			return toIndex + 1;
		if (val < a.get(fromIndex))
			return fromIndex;
		int lb = fromIndex - 1, ub = toIndex;
		while (ub - lb > 1) {
			int mid = (ub - lb) / 2 + lb;
			if (a.get(mid) > val) {
				ub = mid;
			} else {
				lb = mid;
			}
		}
		return ub;
	}

	static class DisjointSparseTable {
		BinaryOperator<Long> f;
		long[][] dat;
		long[] ht;

		DisjointSparseTable(BinaryOperator<Long> f, long[] v) {
			this.f = f;
			int n = v.length, h = 1;
			while ((1 << h) <= n)
				h++;
			dat = new long[h][n];
			ht = new long[(1 << h) + 1];
			for (int j = 2; j < (1 << h) + 1; j++)
				ht[j] = ht[j >> 1] + 1;
			for (int j = 0; j < n; j++)
				dat[0][j] = v[j];
			for (int i = 1; i < h; i++) {
				int s = 1 << i;
				for (int j = 0; j < n; j += s << 1) {
					int t = Math.min(j + s, n);
					dat[i][t - 1] = v[t - 1];
					for (int k = t - 2; k >= j; k--)
						dat[i][k] = f.apply(v[k], dat[i][k + 1]);
					if (n <= t)
						break;
					dat[i][t] = v[t];
					int r = Math.min(t + s, n);
					for (int k = t + 1; k < r; k++)
						dat[i][k] = f.apply(dat[i][k - 1], v[k]);
				}
			}
		}

		// [l,r)
		public long query(int l, int r) {
			if (l >= --r)
				return dat[0][l];
			return f.apply(dat[(int) ht[l ^ r]][l], dat[(int) ht[l ^ r]][r]);
		}

		public int length() {
			return dat[0].length;
		}
	}

	public static void main(String[] args) {
		ir = new InputReader(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}

	static class InputReader {

		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}

	static void tr(Object... o) {
		out.println(Arrays.deepToString(o));
	}
}