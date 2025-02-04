import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner scan = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);

		long a = scan.nextLong();
		long b = scan.nextLong();

		long n = a == 1 || b == 1 ? 1 : a == 2 || b == 2 ? 2 : a >= b ? b : a;
		long ret = 0;
		if (n > 2) {
			for (long i = 1; i <= n; i++) {
				if (a % 2 == 0 || b % 2 == 0) {
					if (a % i == 0 && b % i == 0) {
						if (isPrime(i)) {
							ret++;
						}
					}
				}
			}
		} else {
			ret = n;
		}

		out.println(ret);
		out.flush();
	}

	public static boolean isPrime(long num) {
		if (num == 1L)
			return true;
		else if (num == 2L)
			return true;
		else if (num % 2L == 0)
			return false; // 偶数はあらかじめ除く

		double sqrtNum = Math.sqrt(num);
		for (long i = 3; i <= sqrtNum; i += 2) {
			if (num % i == 0) {
				// 素数ではない
				return false;
			}
		}

		// 素数である
		return true;
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