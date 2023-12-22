import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		}

		ptr = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return buflen > 0;
	}

	private int readByte() {
		return hasNextByte() ? buffer[ptr++] : -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
		return hasNextByte();
	}

	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
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
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
			throw new NumberFormatException();
		}
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int m = sc.nextInt();
		Map<Integer, List<Integer>> yearsTable = new HashMap<>();
		int[] p = new int[m];
		int[] y = new int[m];
		for (int i = 0; i < m; ++i) {
			p[i] = sc.nextInt();
			y[i] = sc.nextInt();
			yearsTable.putIfAbsent(p[i], new ArrayList<>());
			yearsTable.get(p[i]).add(y[i]);
		}

		for (int key : yearsTable.keySet()) {
			Collections.sort(yearsTable.get(key));
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < m; ++i) {
			List<Integer> list = yearsTable.get(p[i]);
			int yearRank = find(list, y[i]) + 1;
			pw.printf("%06d%06d\n", p[i], yearRank);
		}
		pw.flush();
	}

	static int find(List<Integer> list, int key) {
		int left = -1;
		int right = list.size();
		while (right - left > 1) {
			int mid = left + (right - left) / 2;
			if (list.get(mid) == key) {
				return mid;
			} else if (list.get(mid) < key) {
				left = mid;
			} else {
				right = mid;
			}
		}
		return left;

	}

}
