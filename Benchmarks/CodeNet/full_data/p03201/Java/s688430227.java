import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner();
		int n = sc.nextInt();
		long[] A = new long[n];
		for (int i = 0; i < n; ++i) {
			A[i] = sc.nextLong();
		}
		Arrays.sort(A);
		HashMap<Long, Integer> map = new HashMap<>();
		for (int i = 0; i < n; ++i) {
			if (map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i]) + 1);
			} else {
				map.put(A[i], 1);
			}
		}
		int ans = 0;
		for (int i = n - 1; i >= 0; --i) {
			if (!map.containsKey(A[i]))
				continue;
			long target = 1;
			while (target <= A[i])
				target *= 2;
			if (target - A[i] == A[i] && map.get(A[i]) == 1)
				continue;
			if (map.containsKey(target - A[i])) {
				++ans;
				;
				if (map.get(target - A[i]) == 1) {
					map.remove(target - A[i]);
				} else {
					map.put(target - A[i], map.get(target - A[i]) - 1);
				}
				if (map.get(A[i]) == 1) {
					map.remove(A[i]);
				} else {
					map.put(A[i], map.get(A[i]) - 1);
				}
			}
		}
		System.out.println(ans);
	}

	void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

}

class Scanner {
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

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	public boolean hasNext() {
		skipUnprintable();
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
		return (int) nextLong();
	}
}
