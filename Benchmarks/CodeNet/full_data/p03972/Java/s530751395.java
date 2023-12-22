import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		long total = 0;
		int[] p = new int[w];
		for (int x = 0; x < w; x++) {
			p[x] = sc.nextInt();
			total += p[x];
		}
		int[] q = new int[h];
		for (int y = 0; y < h; y++) {
			q[y] = sc.nextInt();
			total += q[y];
		}
		
		int[] pp = p.clone();
		int[] qq = q.clone();
		Arrays.sort(pp);
		Arrays.sort(qq);
		
		for (int y = 0; y < h; y++) {
			int index = Arrays.binarySearch(pp, q[y]);
			if (index < 0) index = -(index + 1);
			total += (w - index) * q[y];
		}
		
		for (int x = 0; x < w; x++) {
			int index = Arrays.binarySearch(qq, p[x]);
			if (index < 0) index = -(index + 1);
			else index++;
			total += (h - index) * p[x];
		}
		
		out.println(total);
		out.flush();
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
	
	private byte readByte() {
		if (hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
	}
	
	private boolean isPrintableChar(int c) {
		return '!' <= c && c <= '~';
	}
	
	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
	}
	
	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}
	
	public int nextInt() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		int n = 0;
		boolean minus = false;
		byte b = readByte();
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
}