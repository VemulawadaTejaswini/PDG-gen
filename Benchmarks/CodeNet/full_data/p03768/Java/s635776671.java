import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		
		ArrayList<HashSet<Integer>> adj = new ArrayList<HashSet<Integer>>();
		for(int i = 0; i < N; i++){ adj.add(new HashSet<Integer>()); }
		for(int i = 0; i < M; i++){
			final int a = sc.nextInt() - 1;
			final int b = sc.nextInt() - 1;
			
			adj.get(a).add(b);
			adj.get(b).add(a);
		}
		
		final int Q = sc.nextInt();
		int[] vs = new int[Q];
		int[] ds = new int[Q];
		int[] cs = new int[Q];
		for(int i = 0; i < Q; i++){
			vs[i] = sc.nextInt() - 1;
			ds[i] = sc.nextInt();
			cs[i] = sc.nextInt();
		}
		
		int[] colors = new int[N];
		Arrays.fill(colors, 0);
		
		boolean[] visited = new boolean[N];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		for(int q = Q - 1; q >= 0; q--){
			final int v = vs[q];
			final int d = ds[q];
			final int c = cs[q];
			
			Arrays.fill(visited, false);
			queue.add(v);
			queue.add(d);
			
			while(!queue.isEmpty()){
				final int curr_v = queue.poll();
				final int curr_d = queue.poll();
				
				if(colors[curr_v] <= 0){
					colors[curr_v] = c;
				}
				
				if(curr_d <= 0){ continue; }
				for(final int next_v : adj.get(curr_v)){
					if(visited[next_v]){ continue; }
					visited[next_v] = true;
					
					queue.add(next_v);
					queue.add(curr_d - 1);
				}
			}
		}
		
		for(int i = 0; i < N; i++){
			System.out.println(colors[i]);
		}
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