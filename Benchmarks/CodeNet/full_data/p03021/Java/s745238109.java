import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int[] values, cant, sum, minSum;
	static List<Integer>[] adj;
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		N = sc.nextInt();
		char[] S = sc.next().toCharArray();
		values = new int[N];
		cant = new int[N];
		sum = new int[N];
		minSum = new int[N];
		for (int i = 0; i < N; i++) {
			values[i] = S[i] - '0';
		}
		adj= new List[N];
		for (int i = 0; i < N; i++) {
			adj[i] = new ArrayList<>();
		}
		for (int i = 0; i < N - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			adj[a].add(b);
			adj[b].add(a);
		}
		
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			calc(i, -1);
			ans = Math.min(ans, min(i));
		}
		if (ans == Integer.MAX_VALUE) ans = -1;
		out.println(ans);
		
		out.flush();
	}
	
	static void calc(int node, int parent) {
		cant[node] = values[node];
		sum[node] = minSum[node] = 0;
		int worst = 0;
		for (int neigh : adj[node]) if (neigh != parent) {
			calc(neigh, node);
			cant[node] += cant[neigh];
			sum[node] += sum[neigh] + cant[neigh];
			worst = Math.max(worst, minSum[neigh] + sum[neigh] + 2 * cant[neigh]);
		}
		if (worst > sum[node]) minSum[node] = worst - sum[node];
	}
	
	static int min(int node) {
		if (sum[node] % 2 == 1 || minSum[node] > 0) return Integer.MAX_VALUE;
		return sum[node] / 2;
	}
	
	
	
	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}
