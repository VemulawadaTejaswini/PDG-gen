import java.util.*;
import java.io.*;

public class Main {
	static final int mod = (int) 1e9 + 7;
	static final int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int[] DX8 = { -1, -1, -1, 0, 0, 1, 1, 1 }, DY8 = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;
	static final String nextLine = "\n";

	static int h, w;
	static char[][] field;
	static int memo[][][];
	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		h = fs.nextInt(); w = fs.nextInt();
		field = new char[h][w];
		for(int i=0;i<h;i++) {
			String s = fs.next();
			for(int j=0;j<s.length();j++) {
				field[i][j] = s.charAt(j);				
			}
		}
		
		
		memo = new int[h][w][2];
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				Arrays.fill(memo[i][j],-1);
			}
		}
		int ans = dfs(0,0, -1, 0);
		System.out.println(ans);
		
	}
	
	static int dfs(int x, int y, int b, int cnt) {
		int bb = b;
		if(b == -1) {
			if(memo[x][y][0]!=-1)return memo[x][y][0];			
		}
		else {
			if(memo[x][y][1]!=-1)return memo[x][y][1];					
		}
		if(b == -1) {
			if (field[x][y] == '#') {
				cnt ++;
				b = 1;
			}
			else {
				//b = 1;
			}
		}
		else {
			if (field[x][y] == '#') {
				//cnt ++;
			}
			else {
				b = -1;
			}
		}
		
		if(x == h-1&&y==w-1)return cnt;
		
		int res = INF;
		
		int nx = x + 1, ny = y;
		if(nx<h&&ny<w) {
			res = Math.min(res,dfs(nx, ny, b, cnt));
		}
		nx = x; ny = y + 1;
		if(nx<h&&ny<w) {
			res = Math.min(res,dfs(nx, ny, b, cnt));
		}
		if(bb == -1) {
			return memo[x][y][0] = res;			
		}
		else {
			return memo[x][y][1] = res;						
		}
	}

	//MOD culculations
	static long plus(long x, long y) {
		long res = (x + y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long sub(long x, long y) {
		long res = (x - y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long mul(long x, long y) {
		long res = (x * y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long div(long x, long y) {
		long res = x * pow(y, mod - 2) % mod;
		return res < 0 ? res + mod : res;
	}

	static long pow(long x, long y) {
		if (y < 0)
			return 0;
		if (y == 0)
			return 1;
		if (y % 2 == 1)
			return (x * pow(x, y - 1)) % mod;
		long root = pow(x, y / 2);
		return root * root % mod;
	}
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}