import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		String input = sc.next();
		int a = Integer.parseInt(input.substring(0, 1));
		int b = Integer.parseInt(input.substring(1, 2));
		int c = Integer.parseInt(input.substring(2, 3));
		int d = Integer.parseInt(input.substring(3, 4));

		StringBuilder sb = new StringBuilder();
		if(a + b + c + d == 7) {
			sb.append(a);
			sb.append("+");
			sb.append(b);
			sb.append("+");
			sb.append(c);
			sb.append("+");
			sb.append(d);
			sb.append("=7");
		} else if(a + b + c - d == 7) {
			sb.append(a);
			sb.append("+");
			sb.append(b);
			sb.append("+");
			sb.append(c);
			sb.append("-");
			sb.append(d);
			sb.append("=7");
		} else if(a + b - c + d == 7) {
			sb.append(a);
			sb.append("+");
			sb.append(b);
			sb.append("-");
			sb.append(c);
			sb.append("+");
			sb.append(d);
			sb.append("=7");
		} else if(a - b + c + d == 7) {
			sb.append(a);
			sb.append("-");
			sb.append(b);
			sb.append("+");
			sb.append(c);
			sb.append("+");
			sb.append(d);
			sb.append("=7");
		} else if(a + b - c - d == 7) {
			sb.append(a);
			sb.append("+");
			sb.append(b);
			sb.append("-");
			sb.append(c);
			sb.append("-");
			sb.append(d);
			sb.append("=7");
		} else if(a - b + c - d == 7) {
			sb.append(a);
			sb.append("-");
			sb.append(b);
			sb.append("+");
			sb.append(c);
			sb.append("-");
			sb.append(d);
			sb.append("=7");
		} else if(a - b - c + d == 7) {
			sb.append(a);
			sb.append("-");
			sb.append(b);
			sb.append("-");
			sb.append(c);
			sb.append("+");
			sb.append(d);
			sb.append("=7");
		} else if(a - b - c - d == 7) {
			sb.append(a);
			sb.append("-");
			sb.append(b);
			sb.append("-");
			sb.append(c);
			sb.append("-");
			sb.append(d);
			sb.append("=7");
		}
		System.out.println(sb.toString());
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
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

}
