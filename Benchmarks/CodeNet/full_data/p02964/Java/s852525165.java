import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;

	static void solve() {
		int n = ir.nextInt();
		long k = ir.nextLong();
		int[] a = ir.nextIntArray(n);
		ArrayList<Integer> l = new ArrayList<>();
		int[] last = new int[300000];
		int[] first = new int[300000];
		Arrays.fill(last, -1);
		Arrays.fill(first, -1);
		int[] next = new int[n];
		for (int i = 0; i < n; i++) {
			if (last[a[i]] != -1) {
				next[last[a[i]]] = i;
			}
			last[a[i]] = i;
			if (first[a[i]] == -1) {
				first[a[i]] = i;
			}
		}
		int[] dp = new int[n + 1];
		dp[n] = n;
		for (int i = n - 1; i >= 0; i--) {
			if (next[i] == 0) {
				dp[i] = i;
			} else {
				dp[i] = dp[next[i] + 1];
			}
		}
		// tr(first);
		// tr(dp);
		boolean[] used = new boolean[n + 1];
		int cur = 0;
		ArrayList<Integer> res = new ArrayList<Integer>();
		used[n] = true;
		int t = -1;
		while (true) {
			if (used[cur]) {
				t = cur;
				break;
			}
			res.add(cur);
			used[cur] = true;
			if (dp[cur] == n) {
				t = n;
				break;
			}
			cur = first[a[dp[cur]]] + 1;
		}
		int idx = -1;
		for (int i = 0; i < res.size(); i++) {
			if (res.get(i) == t) {
				idx = i;
				break;
			}
		}
		int r = -1;
		if (t == n) {
			k--;
			k %= (res.size());
			r = res.get((int) k);
		} else {
			k--;
			r = k < idx ? res.get((int) k) : res.get((int) ((k - idx) % (res.size() - idx)) + idx);
		}
		r = dp[r];
		while (r != n) {
			out.print(a[r]);
			r = dp[++r];
			out.print(r == n ? "\n" : " ");
		}
		out.println();
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
