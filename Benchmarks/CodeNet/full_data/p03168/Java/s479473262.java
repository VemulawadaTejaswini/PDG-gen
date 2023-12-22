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
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			double[] ps = new double[N];
			for(int i = 0; i < N; i++) { ps[i] = sc.nextDouble(); }
			
			double[][] DP = new double[N + 1][N + 1];
			DP[0][0] = 1.0 - ps[0];
			DP[0][1] = ps[0];
			
			for(int i = 1; i < N; i++) {
				for(int cnt = 0; cnt <= N; cnt++) {
					if(cnt > 0){ DP[i][cnt] += (DP[i - 1][cnt - 1] * ps[i]);}
					           { DP[i][cnt] += (DP[i - 1][cnt - 0] * (1.0 - ps[i])); }
				}
			}
			
			//System.out.println(Arrays.deepToString(DP));
			
			double answer = 0;
			for(int i = N / 2 + 1; i <= N; i++) { 
				//System.out.println(i + " " + DP[N - 1][i]);
				answer += DP[N - 1][i];
			}
			
			System.out.printf("%.10f\n", answer);
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