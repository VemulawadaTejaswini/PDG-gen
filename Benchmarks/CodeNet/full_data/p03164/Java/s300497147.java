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
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int W = sc.nextInt();
			
			long[] ws = new long[N];
			int[] vs = new int[N];
			
			for(int i = 0; i < N; i++) {
				ws[i] = sc.nextLong();
				vs[i] = sc.nextInt();
			}
			
			final int MAX_V = N * 1000;
			long[] DP = new long[MAX_V + 1];
			Arrays.fill(DP, Integer.MAX_VALUE);
			DP[0] = 0;
			
			for(int item = 0; item < N; item++) {
				for(int curr = MAX_V - vs[item]; curr >= 0; curr--) {					
					DP[curr + vs[item]] = Math.min(DP[curr + vs[item]], DP[curr] + ws[item]);
				}
			}
			
			long answer = 0;
			for(int i = 0; i <= MAX_V; i++) {
				if(DP[i] <= W) { answer = i; }
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