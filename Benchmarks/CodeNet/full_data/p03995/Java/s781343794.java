
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

		int[] r = new int [n];
		int[] c = new int[n];
		int[] a = new int[n];
		for (int i=0; i < n; i++) {
			r[i] = sc.nextInt()-1;
			c[i] = sc.nextInt()-1;
			a[i] = sc.nextInt();
		}

		boolean ans = true;
		boolean[] rdf = new boolean[R];
		int[] rd = new int[R];
		int[] rmin = new int[R];
		int[] rmax = new int[R];
		boolean[] cdf = new boolean[C];
		int[] cd = new int[C];
		int[] cmin = new int[C];
		int[] cmax = new int[C];
		Arrays.fill(rmax, Integer.MAX_VALUE);
		Arrays.fill(rmin, Integer.MIN_VALUE);
		Arrays.fill(cmax, Integer.MAX_VALUE);
		Arrays.fill(cmin, Integer.MIN_VALUE);

		LOOP:for (int i=0; i< n; i++) {
			//R
			System.err.println(a[i]+"*");
			if (c[i] != C-1) {
				System.err.println(a[i]+"R");
				for (int t=0; t < n; t++) {
					//隣なら
					if (r[i] == r[t] && c[i] == c[t]-1) {
						System.err.println(a[i]+"+"+a[t]);
						if (cdf[c[i]]) {
							if (a[i]-a[t] != cd[c[i]]) {

								ans = false;
								break LOOP;
							}
						}else {
							cdf[c[i]] = true;
							cd[c[i]] = a[i]-a[t];
							if (cd[c[i]] < cmin[c[i]] || cmax[c[i]] < cd[c[i]]) {

								ans = false;
								break LOOP;
							}
						}
					}
				}
			}
			//C
			if (r[i] != R-1) {

				System.err.println(a[i]+"C");
				for (int t=0; t < n; t++) {
					//隣なら
					if (c[i] == c[t] && r[i] == r[t]-1) {
						if (rdf[r[i]]) {
							if (a[i]-a[t] != rd[r[i]]) {
								ans = false;
								break LOOP;
							}
						}else {
							rdf[r[i]] = true;
							rd[r[i]] = a[i]-a[t];
							if (rd[r[i]] < rmin[r[i]] || rmax[r[i]] < rd[r[i]]) {
								ans = false;
								break LOOP;
							}
						}
					}
				}
			}
			//RM
			if (r[i] != 0) {
System.err.println("RMin");
				rmin[r[i]-1] = Math.min(-a[i], rmin[r[i]-1]);
				if (rdf[r[i]-1] && rd[r[i]-1] < rmin[r[i]-1]) {
					ans = false;
					break LOOP;
				}
			}
			if (r[i] != R-1) {

System.err.println("RMax");
				rmax[r[i]] = Math.max(a[i], rmax[r[i]]);
				if (rdf[r[i]] && rd[r[i]] > rmax[r[i]]) {
					ans = false;
					break LOOP;
				}
			}
			//CM
			if (c[i] != 0) {

System.err.println("CMin");
				cmin[c[i]-1] = Math.min(-a[i], cmin[c[i]-1]);
				if (cdf[c[i]-1] && cd[c[i]-1] < cmin[c[i]-1]) {
					System.err.println(cmin[c[i]-1] + ":" +  cd[c[i]-1]);
					ans = false;
					break LOOP;
				}
			}
			if (c[i] != C-1) {

System.err.println("CMax");
				cmax[c[i]] = Math.max(a[i], cmax[c[i]]);
				if (cdf[c[i]] && cd[c[i]] > cmax[c[i]]) {
					ans = false;
					break LOOP;
				}
			}
		}
		for (int i=0; i<C;i++) {
			System.err.print(cd[i]+",");
		}
		//System.err.println();

		/*LOOP:for (int r=0; r < R-1; r++) {
			boolean df = false;
			int d = 0;

			int min = Integer.MIN_VALUE,max = Integer.MAX_VALUE;
			for (int c=0; c< C; c++) {
				if (map[r][c ]!= -1 && map[r+1][c] != -1) {
					if (df) {
						if (map[r][c ]-map[r+1][c] != d) {
							ans = false;
							break LOOP;
						}
					}else {
						df = true;
						d = map[r][c ]-map[r+1][c];
						if (d < min || max < d) {
							ans = false;
							break LOOP;
						}
					}
				}else if (map[r][c ] == -1 ) {
					min = -map[r+1][c];
					if (df && d < min) {
						ans = false;
						break LOOP;
					}
				}else if (map[r+1][c] == -1 ) {
					max = map[r][c];
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
					if (map[r][c] != -1 && map[r][c+1] != -1) {
						if (df) {
							if (map[r][c]-map[r][c+1] != d) {
								ans = false;
								break LOOP;
							}
						}else {
							df = true;
							d = map[r][c]-map[r][c+1];
							if (d < min || max < d) {
								ans = false;
								break LOOP;
							}
						}
					}else if (map[r][c] == -1 ) {
						min = -map[r][c+1];
						if (df && d < min) {
							ans = false;
							break LOOP;
						}
					}else if (map[r][c+1] == -1 ) {
						max = map[r][c];
						if (df && d > max) {
							ans = false;
							break LOOP;
						}
					}
				}
			}
		}*/

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
