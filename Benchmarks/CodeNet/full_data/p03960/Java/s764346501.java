import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;

public class Main {
	static FastScanner sc = new FastScanner();
	static PrintStream out = System.out;

	static int H;
	static int W;
	static int c[][];
	static int costs[][][];
	public static void main(String args[]) {
		H = ni();
		W = ni();
		c = new int[H][W];
		costs = new int[2][H+1][H+1];
		if (W != 3) {
			out.println(0);
			return;
		}

		for (int i=0;i<H;i++) {
			String C = next();
			for (int j=0;j<W;j++) {
				c[i][j] = C.charAt(j) - 'a';
			}
		}

		long dp[][][] = new long[H+1][H+1][H+1];
		for (int i=0;i<H+1;i++) {
			for (int j=0;j<H+1;j++) {
				for (int k=0;k<H+1;k++) {
					dp[i][j][k] = Long.MAX_VALUE;
				}
			}
		}

		for (int i=0;i<2;i++) {
			for (int j=H;j>=0;j--) {
				for (int k=H;k>=0;k--) {
					if (j == H || k == H) {
						costs[i][j][k] = 0;
					} else {
						costs[i][j][k] = costs[i][j+1][k+1] + (c[H-(j+1)][i] == c[H-(k+1)][i+1] ? 1 : 0);
					}
					
//					System.out.printf("costs[%d][%d][%d] = %d\n", i, j, k, costs[i][j][k]);
				}
			}
		}
		
		dp[0][0][0] = 0;
		for (int i=1;i<=H*W;i++) {
			rec(dp, i, 0, new int[3], 0);
		}

		
		if (W == 2) {
			out.println(dp[H][H][0]);
		} else {
			out.println(dp[H][H][H]);
		}
	}
	
	private static void rec(long dp[][][], int sum, int s, int n[], int d) {
		if (d == W-1) {
			int m = sum - s;
			n[d] = m;

			if (m < 0 || m > H) return;
			
			if (W == 2) n[2] = 0;
			for (int i=0;i<W;i++) {
				if (n[i] == 0) continue;
				long cost = 0;
				long prev = 0;
				if (i == 0) prev = dp[n[0]-1][n[1]][n[2]];
				else if (i == 1) prev = dp[n[0]][n[1]-1][n[2]];
				else if (i == 2) prev = dp[n[0]][n[1]][n[2]-1];

				if (i < 2) {
					// right
					cost += costs[i][n[i]-1][n[i+1]];
				}
				if (i > 0) {
					// left
					cost += costs[i-1][n[i-1]][n[i]-1];
				}
				
				dp[n[0]][n[1]][n[2]] = Math.min(dp[n[0]][n[1]][n[2]], prev + cost);
			}

//			System.out.printf("dp[%d][%d][%d] = %d\n", n[0], n[1], n[2], dp[n[0]][n[1]][n[2]]);

			return;
		}
		
		for (int i=0;i<=H;i++) {
			n[d] = i;
			rec(dp, sum, s + i, n, d + 1);
		}
	}

	private static String next() {
		return sc.next();
	}

	private static int ni() {
		return sc.nextInt();
	}

	private static long nl() {
		return sc.nextLong();
	}

	private static int[] na(int n) {
		int[] a = new int[n];
		for(int i = 0;i < n;i++) a[i] = ni();
		return a;
	}

	private static long[] nal(int n) {
		long[] a = new long[n];
		for(int i = 0;i < n;i++) a[i] = ni();
		return a;
	}

    private static double nd() {
        return Double.parseDouble( next() );
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
}
