import java.util.*; 
import java.io.*;

public class Main {	
	static int dp[][] = new int[3005][3006]; 
	static String ans = "";
	public static int lcs(char p[] , char s[] , int n , int m) {
		if(n == 0 || m == 0) 
			return 0; 
		
		if(dp[n-1][m-1] != -1) return dp[n-1][m-1];
		
		else if(p[n-1] == s[m-1]) {
			return dp[n-1][m-1] = 1 + lcs(p , s , n-1 , m-1);
		}
			 
		int temp1 = lcs(p , s , n-1 , m);
		int temp2 = lcs(p , s , n , m-1); 
		return dp[n-1][m-1] = Math.max(temp1, temp2); 
	}
	public static void pr(char p[] , char s[] ,int n , int m) {
		if(n<=0 || m <= 0)
			return;
		if(p[n-1] == s[m-1]) {
			ans = p[n-1] + ans; 
			pr(p,s,n-1,m-1); 
		}
		else if(dp[n-1][m] > dp[n][m-1])
			pr(p,s,n-1,m); 
		else
			pr(p,s,n,m-1); 
	}
	public static void solve(InputReader in) {
		char p[] = in.readString().toCharArray(); 
		char s[] = in.readString().toCharArray(); 
		int n = p.length , m = s.length; 
		for(int i = 0; i<3005; i++) {
			for(int j = 0; j<3006; j++) {
				dp[i][j] = -1; 
			}
		}
		lcs(p,s,n,m); 
		pr(p,s,n,m);
		System.out.println(ans); 
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
