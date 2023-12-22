import java.util.*;
import java.io.*;

//01-bfsの解法
public class Main {
	static final int mod = (int) 1e9 + 7;
	static final int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int[] DX8 = { -1, -1, -1, 0, 0, 1, 1, 1 }, DY8 = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;
	static final String nextLine = "\n";

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int h = fs.nextInt(), w = fs.nextInt();
		char field[][] = new char[h][w];
		for(int i=0;i<h;i++) {
			String s = fs.next();
			for(int j=0;j<w;j++) {
				field[i][j] = s.charAt(j);
			}
		}
		
		
		ArrayDeque<int[]> q = new ArrayDeque<>();
		int start[] = {0,0};
		q.add(start);
		int dist[][] = new int[h][w];
		for(int i=0;i<h;i++)Arrays.fill(dist[i], -1);
		dist[0][0] = 0;
		if(field[0][0] == '#')dist[0][0] = 1;
		int DX2[] = {1,0}, DY2[] = {0,1};
		while(!q.isEmpty()) {
			int now[] = q.poll();
			int x = now[0], y = now[1];
			for(int i=0;i<2;i++) {
				int nx = x + DX2[i], ny = y + DY2[i];
				if(0<=nx&&nx<h&&0<=ny&&ny<w) {
					int next[] = {nx,ny};
					if(dist[nx][ny]!=-1)continue;
					if(field[x][y]=='.'&&field[nx][ny]=='#') {
						dist[nx][ny] = dist[x][y] + 1;
						q.add(next);
					}
					else {
						dist[nx][ny] = dist[x][y];
						q.addFirst(next);
					}
				}
			}
		}
		System.out.println(dist[h-1][w-1]);
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