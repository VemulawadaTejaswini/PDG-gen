import java.util.*;
import java.io.*;

public class Main {

	static int N, M, S, T, dp[][];
	static List<ArrayList<Integer>> to;
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		N = fs.nextInt();
		M = fs.nextInt();
		to = new ArrayList<>();
		for(int i=0;i<N;i++)to.add(new ArrayList<Integer>());
		for(int i=0;i<M;i++) {
			int u = fs.nextInt()-1, v = fs.nextInt()-1;
			to.get(u).add(v); 
		}
		S = fs.nextInt()-1;
		T = fs.nextInt()-1;
		
		dp = new int[N][3];//i番目の頂点にj%3歩で到達するときの最短手数
		int INF = Integer.MAX_VALUE/2;
		for(int t[]:dp) Arrays.fill(t, INF);
		
		//BFS
		Queue<Integer> q = new ArrayDeque<>(); 
		q.add(S);
		dp[S][0]=0;

		while(!q.isEmpty()) {
			int now = q.poll();
			for(int next : to.get(now)) {
				for(int i=0;i<3;i++) {
					int cnt = dp[now][i];
					if(cnt==INF)continue;
					if(i==0) cnt ++;
					if(dp[next][(i+1)%3]==INF) {
						dp[next][(i+1)%3]=cnt;
						q.offer(next);
					}else continue;
				}

			}
		}
		System.out.println(dp[T][0]==INF? -1:dp[T][0]);
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