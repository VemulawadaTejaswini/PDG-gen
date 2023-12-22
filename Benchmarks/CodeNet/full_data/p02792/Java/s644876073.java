import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.*;


public class Main{
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		long sum = 0;
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				map.put(i * 10 + j, 0);
			}
		}
		for (int i = 1; i <= n; i++) {
			int tmp = i;
			int shita = tmp % 10;
			int ue = tmp % 10;
			while (tmp > 0) {
				ue = tmp % 10;
				tmp /= 10;
			}
			if (ue == 0 || shita == 0) {
				continue;
			}
			map.put(shita * 10 + ue, map.get(shita * 10 + ue) + 1);
		}
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == j) {
					continue;
				}
				sum += map.get(i * 10 + j) * map.get(j * 10 + i);
			}
		}
		for (int i = 1; i <= 9; i++) {
			sum += map.get(i * 10 + i) * map.get(i * 10 + i);
		}
		System.out.println(sum);
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
