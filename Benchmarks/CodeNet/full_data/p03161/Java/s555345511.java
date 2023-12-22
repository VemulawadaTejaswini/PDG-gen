import java.util.*; 
import java.io.*;

public class Main {
	static int n = 0 , k = 0; 
	static int a[] = new int[(int) 1e9 + 7];
	static int dp[] = new int[(int) 1e9 + 7]; 
	public static int fun(int ind) {
		if(ind == n-1) return 0; 
		int max = (int) 1e5 + 7; 
		if(dp[ind] != -1) return dp[ind]; 
		for(int i = 1; i<=k; i++) {
			max = Math.min(max, Math.abs(a[ind + k] - a[ind]) + fun(ind + i)); 
		}
		return dp[ind] = max; 
	}
	public static void solve(InputReader in) {
		n = in.readInt(); 
		k = in.readInt(); 
        for(int i = 0; i<n; i++) {
        	a[i] = in.readInt(); 
        }
        Arrays.fill(dp, -1); 
        System.out.println(fun(0)); 
	}
	public static void main(String[] args) {
		InputReader in = new InputReader(System.in); 
		int t = in.readInt(); 
		while(t-- > 0) {
			solve(in); 
		}
	}
}

class InputReader{
	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
	private SpaceCharFilter filter;

	 public InputReader(InputStream stream) {
		this.stream = stream;
	}

     public int read() {
		if (numChars == -1)
			throw new InputMismatchException();
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = stream.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}

     public int readInt() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		int res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

     public String readString() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	}

     public long readLong() {
		int c = read();
		while (isSpaceChar(c)) {
			c = read();
		}
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		long res = 0;
		do {
			if (c < '0' || c > '9') {
				throw new InputMismatchException();
			}
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}
	
     public boolean isSpaceChar(int c) {
		if (filter != null)
			return filter.isSpaceChar(c);
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}
     
     public String next() {
		return readString();
	}
    
     public interface SpaceCharFilter {
		public boolean isSpaceChar(int ch);
	}
}
