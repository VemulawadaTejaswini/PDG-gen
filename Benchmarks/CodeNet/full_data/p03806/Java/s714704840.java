import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		FS reader = new FS();
		// write reader
		int N = reader.nextInt();
		int Ma = reader.nextInt();
		int Mb = reader.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
		for (int i=0; i<N; i++) {
		    a[i] = reader.nextInt();
		    b[i] = reader.nextInt();
		    c[i] = reader.nextInt();
		}
		solver(N, Ma, Mb, a, b, c);
	}
	
	public static void solver(int N, int Ma, int Mb, int[] a, int[] b, int[] c) {
		// write logic
		// DP:[N][a][b] minimum price when get a g and b g
		// size:Nab=40*400*400=6400000(6.4M)
		int[][][] dp = new int[N+1][401][401];
		for (int i=0; i<N; i++) {
		    for (int j=0; j<401; j++) {
		        for (int k=0; k<401; k++) {
		            dp[i][j][k] = -1;
		        }
		    }
		}
		dp[0][0][0] = 0;
		
		for (int i=0; i<N; i++) {
		    // check for each items
		    for (int j=0; j<401; j++) {
		        for (int k=0; k<401; k++) {
		            int tmp = dp[i][j][k] == -1 ? Integer.MAX_VALUE : dp[i][j][k];
		            if (!(j-a[i] < 0 || k-b[i] < 0 || dp[i][j-a[i]][k-b[i]] == -1)) {
		                tmp = Math.min(tmp, dp[i][j-a[i]][k-b[i]]+c[i]);
		            }
		            dp[i+1][j][k] = tmp == Integer.MAX_VALUE ? -1 : tmp;
		        }
		    }
		}
		
		int t=1;
		int ans = Integer.MAX_VALUE;
		while (true) {
		    if (Ma*t > 400 || Mb*t > 400) break;
		    if (dp[N][Ma*t][Mb*t] != -1) ans = Math.min(ans, dp[N][Ma*t][Mb*t]);
		    t++;
		}
		if (ans == Integer.MAX_VALUE) System.out.println("-1");
		else System.out.println(ans);
	}
	
	// Read Class
	static class FS {
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
	
		private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
		private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
		private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	
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
		public int nextInt() {
			return (int)nextLong();
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
			while(true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if(b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}
