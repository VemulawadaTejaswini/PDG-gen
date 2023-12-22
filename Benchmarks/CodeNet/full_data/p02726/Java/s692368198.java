import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;


public class Main {
	
	public static void bfs(final int N, int start, long[] pairs, ArrayList<HashSet<Integer>> adj) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		int[] depth = new int[N];
		Arrays.fill(depth, -1);
		
		queue.add(start);
		queue.add(-1);
		depth[start] = 0;
		
		while(!queue.isEmpty()) {
			final int node = queue.poll();
			final int parent = queue.poll();
			
			for(final int next : adj.get(node)) {
				if(next == parent) { continue; }
				if(depth[next] >= 0) { continue; }
				
				depth[next] = depth[node] + 1;
				queue.add(next);
				queue.add(node);
			}
		}
		
		for(final int d : depth) {
			pairs[d]++;
		}
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int X = sc.nextInt() - 1;
			final int Y = sc.nextInt() - 1;
			
			ArrayList<HashSet<Integer>> adj = new ArrayList<HashSet<Integer>>();
			for(int i = 0; i < N; i++) {
				adj.add(new HashSet<Integer>());
			}
			
			for(int i = 0; i < N - 1; i++) {
				adj.get(i).add(i + 1);
				adj.get(i + 1).add(i);
			}
			adj.get(X).add(Y);
			adj.get(Y).add(X);
			
			long[] answer = new long[N];
			for(int i = 0; i < N; i++) {
				bfs(N, i, answer, adj);
			}
			
			//System.out.println(Arrays.toString(answer));
			for(int i = 1; i < N; i++) {
				System.out.println(answer[i] / 2);
			}
			
			
		}
	}

	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while(!hasNext()){
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
