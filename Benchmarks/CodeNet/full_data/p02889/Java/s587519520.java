import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static class State implements Comparable<State> {
		int node, count;
		long cap;
		
		public State(int node, int count, long cap) {
			this.node = node;
			this.count = count;
			this.cap = cap;
		}

		public int compareTo(State o) {
			if(Integer.compare(this.count, o.count) != 0) {
				return Integer.compare(this.count, o.count);
			}else {
				return -Long.compare(this.cap, o.cap);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			final long L = sc.nextLong();
			
			final long INF = Long.MAX_VALUE / 2 - 1;
			

			int[][] cnt = new int[N][N];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					cnt[i][j] = i == j ? 0 : N;
				}
			}
			
			ArrayList<HashMap<Integer, Long>> adj = new ArrayList<HashMap<Integer, Long>>();
			for(int i = 0; i < N; i++) { adj.add(new HashMap<Integer, Long>()); }
			
			for(int i = 0; i < M; i++) {
				final int A = sc.nextInt() - 1;
				final int B = sc.nextInt() - 1;
				final long C = sc.nextLong();
				
				adj.get(A).put(B, C);
				adj.get(B).put(A, C);
			}
			
			PriorityQueue<State> queue = new PriorityQueue<State>();
			for(int start = 0; start < N; start++) {
				queue.clear();
				
				queue.add(new State(start, 0, L));
				while(!queue.isEmpty()){
					final State state = queue.poll();
					
					final int node = state.node;
					final long cap = state.cap;
					final int count = state.count;
					
					if(cnt[start][node] < count) { continue; }
					cnt[start][node] = count;

					for(final Entry<Integer, Long> entry : adj.get(node).entrySet()) {
						final int next = entry.getKey();
						final long use = entry.getValue();
						
						final long next_cap = cap < use ? (L - use) : (cap - use);
						final int next_count = cap < use ? (count + 1) : (count + 0);
						
						if(cnt[start][next] < next_count) { continue; }
						
						queue.add(new State(next, next_count, next_cap));
					}
				}
			}
			
			
			final int Q = sc.nextInt();
			for(int i = 0; i < Q; i++) {
				final int s = sc.nextInt() - 1;
				final int t = sc.nextInt() - 1;
				
				System.out.println(cnt[s][t] >= N ? -1 : cnt[s][t]);
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