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
	
	public static class Interval implements Comparable<Interval> {
		int range, last;

		public Interval(int range, int last) {
			super();
			this.range = range;
			this.last = last;
		}

		@Override
		public int compareTo(Interval o) {
			return Integer.compare(this.last, o.last);
		}
	}
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			PriorityQueue<Interval> queue = new PriorityQueue<Interval>();
			for(int i = 0; i < N; i++) {
				final int A = sc.nextInt();
				final int B = sc.nextInt();
				queue.add(new Interval(A, B));
			}
			
			int time = 0;
			while(!queue.isEmpty()) {
				final Interval work = queue.poll();
				
				if(time + work.range <= work.last) {
					time += work.range;
				}else {
					System.out.println("No");
					return;
				}
			}
			
			System.out.println("Yes");
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