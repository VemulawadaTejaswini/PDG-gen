import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	static long mod = 1000000007;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long sum = 0;
		sum += power(2, n);
		sum -= 1 + combination(n, a) + combination(n, b);
		sum %= mod;
		if (sum < 0) {
			sum += mod;
		}
		System.out.println(sum);
	}

	static long power(long n, long m) {
		if (m == 1) {
			return n % mod;
		}
		if (m % 2 == 0) {
			return power(n * n % mod, m / 2);
		} else {
			return power(n * n % mod, m / 2) * n % mod;
		}
	}

	static long modinv(long a) {
		return power(a, mod - 2);
	}

	static long combination(long n, long k) {
		long ans = 1;
		while (k > 0) {
			ans *= n - k + 1;
			ans %= mod;
			ans *= modinv(k);
			ans %= mod;
			k--;
		}
		return ans;
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
		if (hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
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
		if (nl < Integer.MIN_VALUE || Integer.MAX_VALUE < nl) {
			throw new NumberFormatException();
		}
		return (int) nl;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}