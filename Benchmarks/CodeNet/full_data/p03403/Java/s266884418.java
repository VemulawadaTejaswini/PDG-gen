import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			long[] array = new long[N + 1];
			for(int i = 0; i < N; i++){
				array[i] = sc.nextLong();
			}
			array[N] = 0;
			
			long[] r_cost = new long[N + 1];
			r_cost[N] = 0;
			for(int i = N - 1; i >= 0; i--){
				r_cost[i] = r_cost[i + 1] + Math.abs(array[i + 1] - array[i]);
			}
			//System.out.println(Arrays.toString(r_cost));
			
			
			try(final PrintWriter pw = new PrintWriter(System.out)){
				long curr_pos = 0;
				long curr_cost = 0;
				for(int i = 0; i < N; i++){
					final long next_cost = curr_cost + Math.abs(curr_pos - array[i + 1]) + r_cost[i + 1];
					pw.println(next_cost);
					
					curr_pos = array[i];
					curr_cost += Math.abs(array[i] - (i == 0 ? 0 : array[i - 1]));
				}
				
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
			for (int i = 0; i < n; i++) {
				ret[i] = this.nextInt();
			}
			return ret;
		}

		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for (int i = 0; i < n; i++) {
				ret[i] = this.nextLong();
			}
			return ret;
		}

		public void close() throws IOException {
			br.close();
		}
	}
}