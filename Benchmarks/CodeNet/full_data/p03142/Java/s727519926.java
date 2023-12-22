import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static final long MOD = 1000000007;
	
	public static class State implements Comparable<State> {
		long absolute;
		long benefit;
		int index;

		public State(long absolute, long benefit, int index) {
			this.absolute = absolute;
			this.benefit = benefit;
			this.index = index;
		}

		@Override
		public int compareTo(State o) {
			if(this.benefit == o.benefit) {
				return Long.compare(o.absolute, this.absolute);
			}else {
				return Long.compare(o.benefit, this.benefit);

			}
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			
			int[] out_degs = new int[N];
			int[] in_degs = new int[N];
			
			ArrayList<HashSet<Integer>> fwd_adj = new ArrayList<HashSet<Integer>>();
			ArrayList<HashSet<Integer>> rev_adj = new ArrayList<HashSet<Integer>>();
			for(int i = 0; i < N; i++) {
				fwd_adj.add(new HashSet<Integer>());
				rev_adj.add(new HashSet<Integer>());
			}
			
			for(int i = 0; i < (N - 1 + M); i++) {
				final int u = sc.nextInt() - 1;
				final int v = sc.nextInt() - 1;
				
				fwd_adj.get(u).add(v);
				rev_adj.get(v).add(u);
				
				out_degs[u]++;
				in_degs[v]++;
			}
			
			LinkedList<Integer> queue = new LinkedList<Integer>();
			for(int i = 0; i < N; i++) {
				if(out_degs[i] == 0) { queue.add(i); }
			}
			
			int root = -1;
			while(!queue.isEmpty()) {
				final int node = queue.poll();
				root = node;
				
				for(final int parent : rev_adj.get(node)) {
					out_degs[parent] -= 1;
					if(out_degs[parent] == 0) { queue.add(parent); }
				}
			}
			//System.out.println(root);
			
			
			int[] depths = new int[N];
			int[] prevs = new int[N];
			Arrays.fill(depths, -1);
			Arrays.fill(prevs, -1);
			depths[root] = 0;
			
			queue.clear(); queue.add(root);
			while(!queue.isEmpty()) {
				final int node = queue.poll();
				
				for(final int next : fwd_adj.get(node)) {
					in_degs[next] -= 1;
					if(depths[node] + 1 > depths[next]) {
						depths[next] = depths[node] + 1;
						prevs[next] = node;
					}
					
					if(in_degs[next] == 0) { queue.addLast(next); }
				}
			}
			
			for(int i = 0; i < N; i++) {
				System.out.println(prevs[i] + 1);
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