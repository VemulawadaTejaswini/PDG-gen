import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String args[]) {
		FastScanner scanner = new FastScanner();
		int n=scanner.nextInt();
		int W=scanner.nextInt();
		int[] w=new int[n+1];
		int[] v=new int[n+1];
		int w0=0;
		for(int i=1;i<=n;i++) {
			w[i]=scanner.nextInt();
			v[i]=scanner.nextInt();
			if(i==1)w0=w[i]-1;
			w[i]-=w0;
		}
		long[][][] dp=new long[n+1][401][101];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=400;j++) {
				Arrays.fill(dp[i][j], Integer.MIN_VALUE);
			}
		}
		dp[0][0][0]=0;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=400;j++) {
				for(int k=0;k<=i;k++) {
					if (j - w[i] >= 0 && k - 1 >= 0 && j <=W-k*w0)
						dp[i][j][k] = Math.max(dp[i - 1][j][k], dp[i - 1][j - w[i]][k-1] + v[i]);
					else
						dp[i][j][k] = dp[i - 1][j][k];
				}
			}
		}
		long ans=Integer.MIN_VALUE;
		for(int i=0;i<=400;i++) {
			for(int j=0;j<=n;j++) {
				ans=Math.max(ans, dp[n][i][j]);
			}
		}
		System.out.println(ans);
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
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}
