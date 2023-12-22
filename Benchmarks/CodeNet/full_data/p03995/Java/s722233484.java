
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
public class Main {
	static final long C =  1000000007;
	static final int CY = 1000000000;
	StringBuilder sb;
	public void calc() {
		sb = new StringBuilder();


		FastScanner sc = new FastScanner();

		int R = sc.nextInt();
		int C = sc.nextInt();
		int n = sc.nextInt();

		int[][] map = new int[R][C];
		for (int i=0; i < R; i++) {
			Arrays.fill(map[i], -1);
		}
		for (int i=0; i < n; i++) {
			int r = sc.nextInt()-1;
			int c = sc.nextInt()-1;
			map[r][c] = sc.nextInt();
		}

		boolean ans = true;

		LOOP:for (int r=0; r < R-1; r++) {
			boolean df = false;
			int d = 0;

			int min = Integer.MIN_VALUE,max = Integer.MAX_VALUE;
			for (int c=0; c< C; c++) {
				int i = map[r][c];
				int t = map[r+1][c];
				if (i != -1 && t != -1) {
					if (df) {
						if (i-t != d) {
							ans = false;
							break LOOP;
						}
					}else {
						df = true;
						d = i-t;
						if (d < min || max < d) {
							ans = false;
							break LOOP;
						}
					}
				}else if (i == -1 ) {
					min = -t;
					if (df && d < min) {
						ans = false;
						break LOOP;
					}
				}else if (t == -1 ) {
					max = t;
					if (df && d > max) {
						ans = false;
						break LOOP;
					}
				}
			}
		}
		if (ans == true) {
			LOOP:for (int c=0; c < C-1; c++) {
				boolean df = false;
				int d = 0;
				int min = Integer.MIN_VALUE,max = Integer.MAX_VALUE;
				for (int r=0; r< R; r++) {
					int i = map[r][c];
					int t = map[r][c+1];
					if (i != -1 && t != -1) {
						if (df) {
							if (i-t != d) {
								ans = false;
								break LOOP;
							}
						}else {
							df = true;
							d = i-t;
							if (d < min || max < d) {
								ans = false;
								break LOOP;
							}
						}
					}else if (i == -1 ) {
						min = -t;
						if (df && d < min) {
							ans = false;
							break LOOP;
						}
					}else if (t == -1 ) {
						max = t;
						if (df && d > max) {
							ans = false;
							break LOOP;
						}
					}
				}
			}
		}

		System.out.println(ans?"Yes": "No");
	}



	public static void main(String[] args) {
		Main main = new Main();
		main.calc();

	}
	static class FastScanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;
		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			}else{
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
		private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
		private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
		private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
		public boolean hasNext() { skipUnprintable(); return hasNextByte();}
		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while(isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
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
			while(true){
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				}else if(b == -1 || !isPrintableChar(b)){
					return minus ? -n : n;
				}else{
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
		public int nextInt() {
			if (!hasNext()) throw new NoSuchElementException();
			int n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while(true){
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				}else if(b == -1 || !isPrintableChar(b)){
					return minus ? -n : n;
				}else{
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}
