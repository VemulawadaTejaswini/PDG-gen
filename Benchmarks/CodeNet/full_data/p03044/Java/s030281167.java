import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			ArrayList<HashMap<Integer, Integer>> adj = new ArrayList<HashMap<Integer, Integer>>();
			for(int i = 0; i < N; i++) { adj.add(new HashMap<Integer, Integer>()); }
			
			for(int i = 0; i < N - 1; i++) {
				final int u = sc.nextInt() - 1;
				final int v = sc.nextInt() - 1;
				final int w = sc.nextInt();
				
				adj.get(u).put(v, w);
				adj.get(v).put(u, w);
			}
			
			LinkedList<Integer> queue = new LinkedList<Integer>();
			queue.add(0); queue.add(-1); queue.add(0);
			
			int[] answers = new int[N];
			while(!queue.isEmpty()) {
				final int node = queue.poll();
				final int parent = queue.poll();
				final int value = queue.poll();
				
				answers[node] = value;
				for(final Entry<Integer, Integer> entry : adj.get(node).entrySet()) {
					final int next_node = entry.getKey();
					final int next_w = entry.getValue();
					
					if(next_node == parent) { continue; }
					if(next_w % 2 == 0) {
						queue.add(next_node); queue.add(node); queue.add(value);
					}else {
						queue.add(next_node); queue.add(node); queue.add(1 - value);
					}
				}
			}
			
			for(int i = 0; i < N; i++) {
				System.out.println(answers[i]);
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