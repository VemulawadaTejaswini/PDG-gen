import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
				
			ArrayList<HashSet<Integer>> adj = new ArrayList<HashSet<Integer>>();
			for(int i = 0; i < N; i++) { adj.add(new HashSet<Integer>()); }
			
			int[] b_array = new int[N];
			for(int i = 0; i < M; i++) {
				final int a = sc.nextInt() - 1;
				final int b = sc.nextInt() - 1;
				
				
				adj.get(a).add(b);
				b_array[b]++;
			}
			
			int answer = 0;
			HashSet<Integer> remove = new HashSet<Integer>();
			
			for(int i = 0; i < N; i++) {
				if(b_array[i] > 0 && !remove.isEmpty()) {
					answer++;
					for(final int x : remove) {
						b_array[x]--;
					}
					
					remove.clear();
				}
				
				if(!adj.get(i).isEmpty()) { remove.addAll(adj.get(i)); }
			}
			
			System.out.println(answer);
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