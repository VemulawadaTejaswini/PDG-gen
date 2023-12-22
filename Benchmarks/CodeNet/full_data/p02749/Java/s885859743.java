import java.util.*;
import java.io.*;

class Memo{
	int from;
	ArrayList<Integer> to;
	public Memo(int from) {
		super();
		this.from = from;
		to = new ArrayList<>();
	}
	
}

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	static int n;
	static List<Integer> to[];
	static Memo memo[];
	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		n = fs.nextInt();
		to = new ArrayList[n];
		for(int i=0;i<n;i++) to[i] = new ArrayList<>();
		for(int i=0;i<n-1;i++) {
			int a = fs.nextInt()-1, b = fs.nextInt()-1;
			to[a].add(b);
			to[b].add(a);
		}
		
		memo = new Memo[n];
		for(int i=0;i<n;i++) memo[i] = new Memo(i);
		
		for(int i=0;i<n;i++) {
			dfs(i, -1, 0, i);
		}
		
		int ans[] = new int[n];
		int one = (n + 2) / 3; //3で割って1余る数の総数
		int two = (n + 1) / 3; //3で割って2余る数の総数
		int thr = n/3; //3の倍数の総数
		
		int rem[] = new int[n];
		Arrays.fill(rem, -1);
		
		Arrays.sort(memo, (m1,m2)-> m2.to.size() - m1.to.size());
		
		for(int i=0;i<n;i++) {
			int now = memo[i].from;
			if(thr > 0 && i == 0) {
				rem[now] = 0;
//				for(int to:memo[i].to) {
//					memo[i].to.remove(now);
//				}
				thr --;
				continue;
			}
			boolean o = false;
			boolean t = false;
			for(int to:memo[i].to) {
				if(rem[to]==1)o = true;
				else if(rem[to]==2)t = true;
			}
			if(o&&t) {
				rem[now] = 0;
				thr--;
			}
			else if(o&&two>0) {
				rem[now] = 2;
				two--;
			}
			else if(t&&one>0) {
				rem[now] = 1;
				one--;
			}
			else {
				if(one!=0&&one>=two) {
					rem[now] = 1;
					one--;
				}
				else if (two!=0&&two>one) {
					rem[now] = 2;
					two--;
				}
				else {
					rem[now] = 0;
					thr --;
					if(thr<0) {
						System.out.println(-1);
						return;
					}
				}
			}
		}
		int os = 1;
		int ts = 2;
		int ths = 3;
		for(int i=0;i<n;i++) {
			if(rem[i]==1) {
				ans[i]=os;
				os += 3;
			}
			else if(rem[i]==2) {
				ans[i]=ts;
				ts += 3;
			}
			else {
				ans[i]=ths;
				ths += 3;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(ans[i]);
		}
	}


	//rootノードからの距離と、各ノードの親を配列に格納
	static void dfs(int v, int p, int d, int start) {
		if(d == 3) {
			memo[start].to.add(v);
		}

		for (int to : to[v]) {
			if (to == p) continue;
			dfs(to, v, d + 1, start);
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