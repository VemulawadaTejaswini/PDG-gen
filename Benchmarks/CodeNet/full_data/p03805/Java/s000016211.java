import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static int dfs(final int deep, final int N, final int node, boolean[][] adj, boolean[] visited){
		if(deep >= N){ return 1; }
		
		int ret = 0;
		
		visited[node] = true;
		for(int next = 0; next < N; next++){
			if(!adj[node][next]){ continue; }
			if(visited[next]){ continue; }
			
			ret += dfs(deep + 1, N, next, adj, visited);
		}
		visited[node] = false;
		
		return ret;
	}
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);

		final int N = sc.nextInt();
		final int M = sc.nextInt();
		
		boolean[][] adj = new boolean[N][N];
		for(int i = 0; i < M; i++){
			final int a = sc.nextInt() - 1;
			final int b = sc.nextInt() - 1;
			
			adj[a][b] = true;
			adj[b][a] = true;
		}
		
		
		System.out.println(dfs(1, N, 0, adj, new boolean[N]));
	}
	
	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;
 
		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}
 
		private void getLine() throws IOException {
			while (!hasNext()) {
				tok = new StringTokenizer(br.readLine());
			}
		}
 
		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}
 
		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
		
		public int[] nextIntArray(int n) throws IOException {
			final int[] ret = new int[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextInt();
			}
			return ret;
		}
		
		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextLong();
			}
			return ret;
		}
 
		public void close() throws IOException {
			br.close();
		}
	}
}