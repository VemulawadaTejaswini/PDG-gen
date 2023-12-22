import java.util.*;
import java.io.*;

public class Main {
	static final int mod = (int) 1e9 + 7;
	static final int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int[] DX8 = { -1, -1, -1, 0, 0, 1, 1, 1 }, DY8 = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;
	static final String nextLine = "\n";

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), m = fs.nextInt();
		List<Integer> graph[] = new ArrayList[n];
		for(int i=0;i<n;i++)graph[i] = new ArrayList<>();
		for(int i=0;i<m;i++) {
			int a = fs.nextInt()-1, b = fs.nextInt()-1;
			graph[a].add(b);
		}
		boolean used[] = new boolean[n];
		int dist[][] = new int[n][2];
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		int ans[] = {};
		for(int i=0;i<n;i++) {
			Arrays.fill(used, false);
			for(int j=0;j<n;j++) {
				dist[i][0] = INF; dist[i][1] = -1;
			}
			q.add(i);
			dist[i][0] = 0;
			while(!q.isEmpty()) {
				int now = q.poll();
				used[now] = true;
				for(int to:graph[now]) {
					if(to == i) {
						if(ans.length==0||ans.length>dist[now][0]+1) {
							ans = new int[dist[now][0]+1];
							for(int j=0;j<ans.length;j++) {
								ans[ans.length -1 - j] = now;
								now = dist[now][1];
							}
						}
						break;
					}
					if(used[to])continue;
					q.add(to);
					dist[to][0] = dist[now][0] + 1;
					dist[to][1] = now;
				}
			}
		}
		if(ans.length == 0) {
			System.out.println(-1);
			return;
		}
		System.out.println(ans.length);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]+1);
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