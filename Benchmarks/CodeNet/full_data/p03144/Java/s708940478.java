import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {

	long[] ans;

	ArrayList<Integer> one, two;

	void go(long initCur, int initPos) {
		long cur = initCur;

		int p1 = 0, p2 = 0;
		ans[initPos] = cur;
		
		if (one.isEmpty()) {
			int pos = initPos;
			for (int i = 0; i < two.size(); i++) {
				cur += two.get(i);
				pos += 2;
				ans[pos] = cur;
			}
			return;
		}

		boolean ok = false;

		while (p1 + p2 < one.size() + two.size()) {
			long delta1 = p1 < one.size() ? one.get(p1) : Long.MIN_VALUE;
			long delta2;
			if (p2 < two.size() && p1 > 0) {
				delta2 = two.get(p2) - one.get(p1 - 1);
			} else {
				delta2 = Long.MIN_VALUE;
			}
			if (Math.max(delta1, delta2) == Long.MIN_VALUE) {
				throw new AssertionError();
			}
			cur += Math.max(delta1, delta2);
			if (delta1 > delta2) {
				p1++;
			} else {
				p1--;
				p2++;
			}
			if (ok) {
				ans[p1 + 2 * p2 + initPos] = cur;
			}
			ok = !ok;
		}
	}

	void submit() {
		int n = nextInt();
		int k = nextInt();
		ArrayList<Integer>[] a = new ArrayList[k];
		for (int i = 0; i < k; i++) {
			a[i] = new ArrayList<>();
		}
		for (int i = 0; i < n; i++) {
			int id = nextInt() - 1;
			int cst = nextInt();
			a[id].add(cst);
		}

		one = new ArrayList<>();
		two = new ArrayList<>();

		for (ArrayList<Integer> b : a) {
			if (b.size() < 2) {
				continue;
			}
			Collections.sort(b);
			two.add(b.get(b.size() - 1) + b.get(b.size() - 2));
			for (int i = b.size() - 3; i >= 0; i--) {
				one.add(b.get(i));
			}
		}

		Collections.sort(one, Comparator.reverseOrder());
		Collections.sort(two, Comparator.reverseOrder());

		// System.err.println(one + " " + two);

		ans = new long[n + 1];
		Arrays.fill(ans, -1);

		do {
			if (two.isEmpty()) {
				break;
			}
			if (one.isEmpty()) {
				long cur = 0;
				for (int i = 0; i < two.size(); i++) {
					cur += two.get(i);
					ans[(i + 1) * 2] = cur;
				}
				break;
			}

			go(0, 0);

			long bestSum = -1;
			int best2 = -1;
			int best1 = -1;

			for (ArrayList<Integer> b : a) {
				if (b.size() < 3) {
					continue;
				}
				long cur2 = b.get(b.size() - 1) + b.get(b.size() - 2);
				long cur1 = b.get(b.size() - 3);
				if (cur1 + cur2 > bestSum) {
					bestSum = cur1 + cur2;
					best2 = (int) cur2;
					best1 = (int) cur1;
				}
			}

			one.remove(new Integer(best1));
			two.remove(new Integer(best2));
			go(bestSum, 3);

		} while (false);

		ans[1] = -1;

		for (int i = 1; i <= n; i++) {
			out.println(ans[i]);
		}
	}

	void test() {

	}

	void stress() {
		for (int tst = 0;; tst++) {
			if (false) {
				throw new AssertionError();
			}
			System.err.println(tst);
		}
	}

	Main() throws IOException {
		is = System.in;
		out = new PrintWriter(System.out);
		submit();
		// stress();
		// test();
		out.close();
	}

	static final Random rng = new Random();
	static final int C = 5;

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	private InputStream is;
	PrintWriter out;

	private byte[] buf = new byte[1 << 14];
	private int bufSz = 0, bufPtr = 0;

	private int readByte() {
		if (bufSz == -1)
			throw new RuntimeException("Reading past EOF");
		if (bufPtr >= bufSz) {
			bufPtr = 0;
			try {
				bufSz = is.read(buf);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			if (bufSz <= 0)
				return -1;
		}
		return buf[bufPtr++];
	}

	private boolean isTrash(int c) {
		return c < 33 || c > 126;
	}

	private int skip() {
		int b;
		while ((b = readByte()) != -1 && isTrash(b))
			;
		return b;
	}

	String nextToken() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!isTrash(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	String nextString() {
		int b = readByte();
		StringBuilder sb = new StringBuilder();
		while (!isTrash(b) || b == ' ') {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}

	char nextChar() {
		return (char) skip();
	}

	int nextInt() {
		int ret = 0;
		int b = skip();
		if (b != '-' && (b < '0' || b > '9')) {
			throw new InputMismatchException();
		}
		boolean neg = false;
		if (b == '-') {
			neg = true;
			b = readByte();
		}
		while (true) {
			if (b >= '0' && b <= '9') {
				ret = ret * 10 + (b - '0');
			} else {
				if (b != -1 && !isTrash(b)) {
					throw new InputMismatchException();
				}
				return neg ? -ret : ret;
			}
			b = readByte();
		}
	}

	long nextLong() {
		long ret = 0;
		int b = skip();
		if (b != '-' && (b < '0' || b > '9')) {
			throw new InputMismatchException();
		}
		boolean neg = false;
		if (b == '-') {
			neg = true;
			b = readByte();
		}
		while (true) {
			if (b >= '0' && b <= '9') {
				ret = ret * 10 + (b - '0');
			} else {
				if (b != -1 && !isTrash(b)) {
					throw new InputMismatchException();
				}
				return neg ? -ret : ret;
			}
			b = readByte();
		}
	}
}
