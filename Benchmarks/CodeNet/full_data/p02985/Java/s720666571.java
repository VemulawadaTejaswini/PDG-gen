import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	
	static List<ArrayList<Integer>> to;
	static int N, K;
	static long ans;
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		N = fs.nextInt();
		K = fs.nextInt();
		to = new ArrayList<>();
		for(int i=0;i<N;i++) to.add(new ArrayList<>());
		for(int i=0;i<N-1;i++) {
			int a = fs.nextInt()-1, b = fs.nextInt()-1;
			to.get(a).add(b);
			to.get(b).add(a);
		}
		
		ans = 1;
		dfs(0, -1 , K, 0);
		System.out.println(ans);
		
	}
	static void dfs(int v, int parent, int div, int depth) {
		ans *= div;
		ans %= mod;
		int i=0;
		if(depth==0)i=1;
		else i=2;
		for(int t:to.get(v)) {
			if(t==parent)continue;
			dfs(t, v, K-i, depth+1);
			i++;
		}
		return;
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