import java.util.*; 
import java.io.*;

public class Main {
	static int dp[][] = new int[1005][1005]; 
	static char a[][] = new char[1005][1005];
	static int vis[][] = new int[1005][1005]; 
	static int n , m; 
	public static int fun(int i , int j) {
		if(vis[i][j] == 1)
			return dp[i][j]; 
		
		if(i >= n || j >= m) 
			return 0;
		if(a[i][j] == '#') 
			return 0; 
		if(i == n-1 && j == m-1) 
			return dp[i][j] = 1; 
	     
		vis[i][j] = 1;
		return dp[i][j] = (fun(i+1,j) + fun(i , j+1)) % (int) 1e5; 
	}
	
	public static void solve(InputReader in) {
		 n = in.readInt(); 
		 m = in.readInt(); 
		 
		
		for(int i = 0; i<n; i++) {
			char s[] = in.readString().toCharArray(); 
			for(int j = 0; j<m; j++) {
				a[i][j] = s[j]; 
			}
		}
		
//		for(int i = 0; i<1005; i++) {
//			for(int j = 0; j<1005; j++) {
//				dp[i][j] = -1; 
//			}
//		}
	    System.out.println(fun(0,0)); 
	}

	public static void main(String[] args) {
		InputReader in = new InputReader(System.in);
		int t = 1; 
		while (t-- > 0)
			solve(in);
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
