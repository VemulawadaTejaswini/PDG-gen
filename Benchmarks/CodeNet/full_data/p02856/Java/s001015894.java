import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int m = sc.nextInt();
		int[] d = new int[m];
		long[] c = new long[m];
		for (int i = 0; i < m; i++) {
			d[i] = sc.nextInt();
			c[i] = sc.nextLong();
		}
		long ans = 0;
		long[] shuki = new long[10];
		shuki[0] = 1001;
		for (int i = 1; i < 10; i++) {
			int shu = 1;
			int cnt = 1;
			int sum = i;
			do {
				sum += i;
				shu++;
				if (sum >= 10) {
					sum = sum / 10 + sum % 10;
					cnt += 2;
				} else {
					cnt++;
				}
			} while (sum != i);
			shuki[i] = 1000 * shu + cnt;
		}
		long last = 0;
		for (int i = 0; i < m; i++) {
			long tmp = 0;
			if (d[i] == 0) {
				ans += c[i] - 1;
			} else {
				long shu = shuki[d[i]] / 1000;
				long cnt = shuki[d[i]] % 1000;
				tmp = d[i];
				ans += (c[i] - 1) / shu * cnt;
				c[i] = (c[i] - 1) % shu;
				for (int j = 0; j < c[i]; j++) {
					tmp += d[i];
					if (tmp >= 10) {
						tmp = tmp / 10 + tmp % 10;
						ans += 2;
					} else {
						ans++;
					}
				}
			}
			last += tmp;
			if (last >= 10) {
				last = last / 10 + last % 10;
				ans += 2;
			} else {
				ans++;
			}
		}
		System.out.println(ans - 1);
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
