import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author Sparsh Sanchorawala
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		FPathPassI solver = new FPathPassI();
		solver.solve(1, in, out);
		out.close();
	}

	static class FPathPassI {
		ArrayList<Integer>[] adj;
		int[] c;
		long[] res;
		long[] sub;

		void dfs2(int x, int p) {
			sub[x] = 1;
			for (int y : adj[x]) {
				if (y != p) {
					dfs2(y, x);
					sub[x] += sub[y];
				}
			}
		}

		void dfs(int x, int p, long[] map) {
			long store = map[c[x]];
		//	System.out.println(store);
			map[c[x]] = 0;
			for (int y : adj[x]) {
				if (y == p)
					continue;
				dfs(y, x, map);
				long v = sub[y] - map[c[x]];
				res[c[x]] -= v * (v + 1) / 2;
				map[c[x]] = 0;
			}
			if (x == 0) {
				for (int i = 0; i < c.length; i++) {
					if (i == c[x])
						continue;
					long v = sub[x] - map[i];
					res[i] -= v * (v + 1) / 2;
				}
			}
			store += sub[x];
			map[c[x]] = store;
		}

		public void solve(int testNumber, InputReader s, PrintWriter w) {
			int n = s.nextInt();
			c = new int[n];
			res = new long[n];
			Arrays.fill(res, (long) n * (n + 1) / 2);
			for (int i = 0; i < n; i++)
				c[i] = s.nextInt() - 1;

			adj = new ArrayList[n];
			for (int i = 0; i < n; i++)
				adj[i] = new ArrayList<>();
			for (int i = 0; i < n - 1; i++) {
				int u = s.nextInt() - 1, v = s.nextInt() - 1;
				adj[u].add(v);
				adj[v].add(u);
			}
			sub = new long[n];
			dfs2(0, -1);
			dfs(0, -1, new long[n]);
			for (int i = 0; i < n; i++)
				w.println(res[i]);
		}

	}

	static class InputReader {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;
		private InputReader.SpaceCharFilter filter;

		public InputReader(InputStream stream) {
			this.stream = stream;
		}

		public int read() {
			if (numChars == -1) {
				throw new InputMismatchException();
			}
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0) {
					return -1;
				}
			}
			return buf[curChar++];
		}

		public int nextInt() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9') {
					throw new InputMismatchException();
				}
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public boolean isSpaceChar(int c) {
			if (filter != null) {
				return filter.isSpaceChar(c);
			}
			return isWhitespace(c);
		}

		public static boolean isWhitespace(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		public interface SpaceCharFilter {
			public boolean isSpaceChar(int ch);

		}

	}
}
