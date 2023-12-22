import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	static final int INF = Integer.MAX_VALUE;

	int fast(char[][] f, int n) {

		int fullCols = 0;
		
		for (int j = 0; j < n; j++) {
			boolean fullCol = true;
			for (int i = 0; i < n; i++) {
				fullCol &= f[i][j] == '#';
			}
			fullCols += fullCol ? 1 : 0;
		}
		
		int[] emptyInRow = new int[n];
		
		for (int i = 0; i < n; i++) {
			boolean fullRow = true;
			for (int j = 0; j < n; j++) {
				fullRow &= f[i][j] == '#';
				if (f[i][j] == '.') {
					emptyInRow[i]++;
				}
			}
			if (fullRow) {
				return n - fullCols; 
			}
		}
		
		int ret = INF;

		for (int row = 0; row < n; row++) {

			for (int row2 = 0; row2 < n; row2++) {
				if (f[row2][row] == '.') {
					continue;
				}

				int here = emptyInRow[row] + n - fullCols;

				ret = Math.min(ret, here);

			}

		}

		return ret;

	}

	static class BitsetLong {

		static final int LOG = 6;
		static final int SIZE = 1 << LOG;
		static final int MASK = SIZE - 1;

		private long[] data;

		public BitsetLong(int n) {
			data = new long[(n >> LOG) + 2];
		}

		void set(int i) {
			data[i >> LOG] |= 1L << (i & MASK);
		}

		void unset(int i) {
			data[i >> LOG] &= ~(1L << (i & MASK));
		}

		void flip(int i) {
			data[i >> LOG] ^= 1L << (i & MASK);
		}

		int get(int i) {
			return (int) ((data[i >> LOG] >>> (i & MASK)) & 1);
		}

		/**
		 * pads with zeroes if end of word is outside of range
		 */
		long getWord(int i) {
			int rem = i & MASK;
			int idx = i >> LOG;

			if (rem == 0) {
				return data[idx];
			}

			long head = data[idx] >>> rem;
			long tail = data[idx + 1] & ((1L << rem) - 1);

			return head | (tail << (SIZE - rem));
		}
	}

	void submit() throws IOException {
		int n = nextInt();
		char[][] f = new char[n][];
		for (int i = 0; i < n; i++) {
			f[i] = nextToken().toCharArray();
		}

		int ret = fast(f, n);
		if (ret == INF) {
			ret = -1;
		}
		out.println(ret);
	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		// solve();
		submit();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				eof = true;
				return null;
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			eof = true;
			return null;
		}
	}

	int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}