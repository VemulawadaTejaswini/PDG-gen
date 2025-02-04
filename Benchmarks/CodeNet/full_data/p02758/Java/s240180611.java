import java.util.*;
import java.io.*;

public class Main {
	static int mod = 998244353;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;
	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		int a[][] = new int[n][3];
		
		for(int i=0;i<n;i++) {
			int x = fs.nextInt(), d = fs.nextInt();
			a[i][0] = x; a[i][1] = d;
		}
		Arrays.sort(a,(a1,a2)->a1[0]-a2[0]);
	
		for(int i=0;i<n;i++) a[i][2] = i;
		
		TreeSet<int[]> ts = new TreeSet<>((t1,t2)->t1[0]-t2[0]);
		for(int i=0;i<n;i++) {
			ts.add(a[i]);
		}
		
		//木を作る
		graph = new ArrayList[n];
		for(int i=0;i<n;i++) graph[i] = new ArrayList<>();
		
		for(int i=n-1;i>=0;i--){
			boolean go = true;
			while(go) {
				if(ts.higher(a[i])==null)break;
				int b[] = ts.higher(a[i]);
				go = false;
				if(b[0]<a[i][0]+a[i][1]) {
					graph[i].add(b[2]);
					ts.remove(b);
					go = true;
				}
			}
		}
		
		long ans = 1;
		visited = new boolean[n];
		for(int i=0;i<n;i++) {
			if(visited[i])continue;
			ans = mul(ans, dfs(i));
		}
		System.out.println(ans);
		
	}

	static List<Integer> graph[]; 
	static boolean visited[];
	
	//有向木なので、parent情報不要
	static long dfs(int v) {
		visited[v] = true;
		long res = 1;
		for(int to:graph[v]) {
			res = mul(res, dfs(to));
		}
		res += 1; //自分が動く場合（連鎖して、下も全部黒）
		return res;
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