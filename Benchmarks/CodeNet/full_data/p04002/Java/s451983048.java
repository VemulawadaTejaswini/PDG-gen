import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Main {
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int n = sc.nextInt();
		
		HashSet<Long> hs1 = new HashSet<>();
		HashSet<Long> hs2 = new HashSet<>();
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			hs1.add((long) a * h + b);
		}
		
		long[] count = new long[10];
		count[0] = (long) (w - 2) * (h - 2);
		
		for (long l : hs1) {
			int a = (int) (l / h);
			int b = (int) (l % h);
			for (int i = a - 1; i <= a + 1; i++) {
				for (int j = b - 1; j <= b + 1; j++) {
					
					if (i <= 0 || h - 1 <= i || j <= 0 || w - 1 <= j || hs2.contains((long) i * h + j)) {
						continue;
					}
					
					int tmp = 0;
					for (int ii = i - 1; ii <= i + 1; ii++) {
						for (int jj = j - 1; jj <= j + 1; jj++) {
							if (hs1.contains((long) h * ii + jj)) tmp++;
						}
					}
					count[tmp]++;
					count[0]--;
					hs2.add((long) i * h + j);
					
				}
			}
		}
		
		for (int i = 0; i < 10; i++) {
			out.println(count[i]);
		}
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