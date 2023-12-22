import java.util.*; 
import java.io.*;

public class Main {
	static int a[][] = new int[100005][4]; 
	static int dp[][] = new int[100005][4]; 
	static int  n ; 
	public static int fun(int ind , int flag) {
		if(ind == n ) return 0; 
		if(dp[ind][flag] != -1) return dp[ind][flag]; 
		int maxi = 0; 
		if(flag == 0) {
		   maxi = Math.max(maxi, a[ind][1] + fun(ind + 1, 1));
		   maxi = Math.max(maxi, a[ind][2] + fun(ind + 1 , 2)); 
		   maxi = Math.max(maxi, a[ind][3] + fun(ind + 1 , 3)); 
		}
		else if(flag == 1) {
			maxi = Math.max(maxi , a[ind][2] + fun(ind + 1, 2)); 
			maxi = Math.max(maxi, a[ind][3] + fun(ind + 1 , 3)); 
		}
		else if(flag == 2) {
			maxi = Math.max(maxi, a[ind][1] + fun(ind + 1 , 1)); 
			maxi = Math.max(maxi, a[ind][3] + fun(ind + 1, 3)); 
		}
		else {
			maxi = Math.max(maxi,a[ind][1] + fun(ind + 1, 1)); 
			maxi = Math.max(maxi, a[ind][2] + fun(ind + 1, 2)); 
		}
		return dp[ind][flag] = maxi; 
	}
	public static void solve(InputReader in) {
		 n = in.readInt();  
		for(int i = 0; i<n; i++) {
			for(int j = 1; j<=3; j++) {
				a[i][j] = in.readInt(); 
			}
		}
		Arrays.fill(a , -1);
		System.out.println(fun(0,0)); 
	}
	public static void main(String[] args) {
		InputReader in = new InputReader(System.in); 
		int t = 1; 
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
