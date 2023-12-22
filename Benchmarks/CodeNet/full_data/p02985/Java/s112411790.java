import java.io.*;
import java.util.*;
public class Main {
	
	static long res, MOD = (int) 1e9 + 7;
	static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		InputReader in = new InputReader();
		int n = in.nextInt();
		int k = in.nextInt();
		
		for (int i=0; i<n; i++)
			adj.add(new ArrayList<>());
		
		for (int i=0; i<n-1; i++) {
			int u = in.nextInt() - 1;
			int v = in.nextInt() - 1;
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		
		res = k;
		dfs(0, -1, k);
		System.out.println(res);
	}
	
	public static void dfs(int cur, int parent, int k) {
		if (adj.get(cur).size() + 1 > k)
			endProgram();
		int sub = parent == -1 ? 1 : 2;
		for (int index: adj.get(cur)) if (index != parent) {
			res *= (k - sub++);
			res %= MOD;
			dfs(index, cur, k);
		}
	}
	
	public static void endProgram() {
		System.out.println(0);
		System.exit(0);
	}
	
	static class InputReader {
		public BufferedReader br;
		public StringTokenizer st;
		
		public InputReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = null;
		}
		
		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}