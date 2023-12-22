import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

	final long MOD = (long) 1e9 + 7;

	void run() {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[] cs = sc.next().toCharArray();
		int[] next = new int[N + 1];
		for (int i = 0; i < next.length; ++i)
			next[i] = i;
		for (int i = N; i >= N - M; --i) {
			if (i >= 0 && cs[i] == '0')
				next[N] = Math.min(next[N], i);
		}
		for (int i = N - 1; i >= 0; --i) {
			next[i] = Math.min(next[i], next[i + 1]);
			if (i - M >= 0 && cs[i - M] == '0')
				next[i] = Math.min(next[i], i - M);
		}
		ArrayDeque<Integer> ans = new ArrayDeque<>();
		int cur = N;
		while (cur != 0) {
			ans.addFirst(cur - next[cur]);
			if (cur == next[cur]) {
				System.out.println(-1);
				return;
			}
			cur = next[cur];
		}
		int sz = ans.size();
		PrintWriter pw = new PrintWriter(System.out);
		for (int a : ans) {
			pw.print(a + (sz == 1 ? "\n" : " "));
			--sz;
		}
		pw.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

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

	private static boolean isPrintableChar(int c) {
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