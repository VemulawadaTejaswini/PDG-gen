import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
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
		Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; ++i) {
			int t = sc.nextInt();
			cnt.putIfAbsent(t, 0);
			cnt.put(t, cnt.get(t) + 1);
		}

		if (hasInvalidEntry(n, cnt)) {
			System.out.println(0);
			return;
		}

		final long MOD = 1000000007L;
		long ans = 1L;
		for (int i = 0, f = n / 2; i < f; ++i) {
			ans = ans * 2 % MOD;
		}
		System.out.println(ans);
	}

	static boolean hasInvalidEntry(int n, Map<Integer, Integer> cnt) {
		int nRest = n % 2;
		if (nRest == 0) {
			if (cnt.containsKey(0)) {
				return true;
			}
		} else if (cnt.getOrDefault(0, 32) != 1) {
			return true;
		}

		for (int i = 1; i < n; ++i) {
			if (i % 2 == nRest) {
				if (cnt.containsKey(i)) {
					return true;
				}
			} else if (cnt.getOrDefault(i, 32) != 2) {
				return true;
			}
		}
		return false;
	}
}
