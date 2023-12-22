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
			
			boolean[] used = new boolean[N];
			
			PriorityQueue<State> taka_queue = new PriorityQueue<State>();
			PriorityQueue<State> aoki_queue = new PriorityQueue<State>();
			
			for(int i = 0; i < N; i++) {
				final long A = sc.nextLong();
				final long B = sc.nextLong();
				
				taka_queue.add(new State(A, A + B, i));
				aoki_queue.add(new State(B, B + A, i));
			}
			
			long answer = 0;
			while(!taka_queue.isEmpty() && !aoki_queue.isEmpty()) {
				//System.out.println(answer);
				
				while(!taka_queue.isEmpty()) {
					final State taka = taka_queue.poll();
					if(used[taka.index]) { continue; }
					
					//System.out.println("taka : " + taka.absolute);
					used[taka.index] = true;
					answer += taka.absolute;
					break;
				}
				
				while(!aoki_queue.isEmpty()) {
					final State aoki = aoki_queue.poll();
					if(used[aoki.index]) { continue; }
					
					//System.out.println("aoki : " + aoki.absolute);
					used[aoki.index] = true;
					answer -= aoki.absolute;
					break;
				}
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