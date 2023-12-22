import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {

	void solve() {

		n = in.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = in.nextInt();
			B[i] = in.nextInt();
		}

		int num = 100000;
		boolean[] primeList = new boolean[num + 1];
		for (int i = 2; i < num; i++) {
			primeList[i] = true;
		}
		for (int i = 2; i < num; i++) {
			if (primeList[i] == true) {
				int primeNum = i;
				for (int j = i + primeNum; j <= num; j += primeNum) {
					primeList[j] = false;
				}
			}
		}
		int[] memo = new int[100000];
		memo[0] = 0;

		int count = 0;
		for (int i = 3; i < num; i++) {
			if (primeList[i] == true && primeList[(i + 1) / 2] == true) {
				count++;
			}
			memo[i] = count;
		}
		int[] ret = new int[n];
		for (int i = 0; i < n; i++) {
			ret[i] = memo[B[i]] - memo[A[i]];
			if (memo[A[i]] > memo[A[i] - 1]) {
				ret[i]++;
			}
		}

		for (int i = 0; i < n; i++) {
			out.println(ret[i]);
		}
	}

	// only call
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

	// predefined
	FastScanner in = new FastScanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	int n, m, a, b, c, d, e, f;
	int ret;
	ArrayList<Integer> list = new ArrayList<>();
	ArrayDeque<Integer> q = new ArrayDeque<>();

	// 2D-map
	int H, W;
	final int[] dw = new int[] { 0, 1, 0, -1, 1, 1, -1, -1 };
	final int[] dh = new int[] { 1, 0, -1, 0, 1, -1, 1, -1 };

	boolean inField(int nw, int nh) {
		if (nw < 0 || nw >= W || nh < 0 || nh >= H) {
			return false;
		}
		return true;
	}

	// Yes/No
	static String yesno(boolean f) {
		return yesno(f, "Yes", "No");
	}

	static String yesno(boolean f, String yes, String no) {
		return (f ? yes : no);
	}

	// search
	PriorityQueue<Node> pq = new PriorityQueue<>();

	class Node implements Comparable<Node> {

		double score;

		@Override
		public int compareTo(Node o) {
			return Double.compare(this.score, o.score);
		}
	}

	// library
	class FastScanner {
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		FastScanner(InputStream in) {
			this.in = in;
		}

		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[ptr++];
			else
				return -1;
		}

		private boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}

		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
				throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}