import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	static int n, m, con[][];
	static List<Integer> l[];
	static long memo[];
	static Map<String,Integer> mp; 
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		n = fs.nextInt();
		l = new ArrayList[n];
		mp = new HashMap<>();
		for(int i=0;i<n;i++)l[i] = new ArrayList<>();
		for(int i=0;i<n-1;i++) {
			int a = fs.nextInt()-1, b = fs.nextInt()-1;
			l[a].add(b);
			l[b].add(a);
			mp.put(Integer.toString(a)+"to"+Integer.toString(b), i);
			mp.put(Integer.toString(b)+"to"+Integer.toString(a), i);			
		}
		m = fs.nextInt();
		con = new int[m][2];
		for(int i=0;i<m;i++) {
			int u = fs.nextInt()-1, v = fs.nextInt()-1;
			con[i][0] = u;
			con[i][1] = v;
		}
		memo = new long[m];//各区間の通る点の情報をbitでもつ（頂点３２個以上なのでlong）
		
		for(int i=0;i<m;i++) {
			dfs(i,con[i][0],con[i][1],-1);
		}
		
		long res = 0; //どこかしらの区間が全部白になる場合の数
		//全白にするパスをbit全探索する
		for(int i=1;i<(1<<m);i++) {
			int cnt = 0;
			long bit = 0;
			for(int j=0;j<m;j++) {
				if((i>>j&1)==1) {
					cnt++;
					bit |= memo[j];
				}
			}
			int num = Long.bitCount(bit);
			if(cnt%2==0) res -= Math.pow(2, n-1-num);
			else res += Math.pow(2, n-1-num);
			
		}
		long ans = (long) (Math.pow(2, n-1) - res);
		System.out.println(ans);
	}
	static boolean dfs(int i, int u, int v, int parent) {
		if(u == v) {
			return true;
		}
		for(int to:l[u]) {
			if(to==parent)continue;
			if(dfs(i, to, v, u)) {
				int edge = mp.get(Integer.toString(u)+"to"+Integer.toString(to)); 
				memo[i] |= 1L<<edge;
				return true;
			}
		}
		return false;
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