import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.*;


public class Main{
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int[] a = new int[n];
		ArrayList<ArrayList<Integer>> xs = new ArrayList<>();
		ArrayList<ArrayList<Integer>> ys = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> x = new ArrayList<>();
			ArrayList<Integer> y = new ArrayList<>();
			a[i] = sc.nextInt();
			for (int j = 0; j < a[i]; j++) {
				x.add(sc.nextInt() - 1);
				y.add(sc.nextInt());
			}
			xs.add(x);
			ys.add(y);
		}
		int max = 0;
		outer: for (int bit = 0; bit < (1 << n); bit++) {
			int[] honest = new int[n];
			for (int i = 0; i < n; i++) {
				honest[i] = -1;
			}
			int count = 0;
			for (int i = 0; i < n; i++) {
				if ((bit & (1 << i)) != 0) {
					count++;
					for (int j = 0; j < a[i]; j++) {
						int x = xs.get(i).get(j);
						int y = ys.get(i).get(j);
						if (honest[x] == -1) {
							honest[x] = y;
						} else {
							if (y != honest[x]) {
								continue outer;
							}
						}
					}
				}
			}
			for (int i = 0; i < n; i++) {
				if ((bit & (1 << i)) != 0) {
					if (honest[i] == 0) {
						continue outer;
					}
				} else if ((bit & (1 << i)) == 0) {
					if (honest[i] == 1) {
						continue outer;
					}
				}
			}
			max = Math.max(max, count);
		}
		System.out.println(max);
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
