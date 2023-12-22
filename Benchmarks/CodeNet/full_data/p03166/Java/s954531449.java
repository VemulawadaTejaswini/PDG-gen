import java.util.*; 
import java.io.*;

public class Main {
	static int dp[] = new int[10]; 
	static ArrayList<Integer> g[] = new ArrayList[10]; 
	static boolean visited[] = new boolean[10]; 
	
	public static void dfs(int vertex) {
		visited[vertex] = true;  
		
		for(int child : g[vertex]) {
			if(!visited[child])
				dfs(child); 
		
			dp[vertex] = Math.max(dp[vertex], 1 + dp[child]); 
		}
	}
	
	public static void solve(InputReader in) {
		int n = in.readInt() , m = in.readInt();
		
		for(int i = 0; i<=n; i++) {
			g[i] = new ArrayList<Integer>(); 
		}
		
		for(int i = 0; i<m; i++) {
			int x = in.readInt() , y = in.readInt(); 
			g[x].add(y);
		}
		
		for(int i = 1; i<=n; i++) {
			if(!visited[i]) 
				dfs(i); 
		}
		
		int ans = 0; 
		for(int i = 1; i<=n; i++) {
			ans = Math.max(ans,dp[i]); 
		}
		System.out.println(ans); 
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
