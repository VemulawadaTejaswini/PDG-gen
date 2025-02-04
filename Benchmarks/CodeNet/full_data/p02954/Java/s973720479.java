import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		String S = sc.next();
		String[] split = S.split("");
		int[] nowCell = new int[S.length()];
		for (int i = 0; i < nowCell.length; i++) {
			nowCell[i] = 1;
		}
		int[] oldCell;

		PrintWriter out = new PrintWriter(System.out);

		for(int j = 0; j < S.length() ; j++) {
			oldCell = nowCell.clone();
			nowCell = new int[S.length()];
			for (int i = 0; i < split.length - 1; i++) {
				switch (split[i + 1]) {
				case "R":
					nowCell[i + 1] += oldCell[i];
					break;
				case "L":
					nowCell[i - 1] += oldCell[i];
					break;
				default:
					break;
				}
			}
		}

		for (int i = 0; i < nowCell.length; i++) {
			out.print(nowCell[i] + " ");
		}
		out.println();

		out.flush();
	}

	public static int gcd(int a, int b) {
	    if (b == 0) return Math.abs(a);
	    return gcd(b, a % b);
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
