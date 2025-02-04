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
	
	public static long[][] mat_mut(final int N, long[][] mat1, long[][] mat2){
		long[][] ret = new long[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < N; k++) {
					ret[i][j] += mat1[i][k] * mat2[k][j];
					ret[i][j] %= MOD;
				}
			}
		}
		
		return ret;
	}
	
	public static long[][] mat_fact(final int N, long[][] mat, final long K){
		if(K == 1) {
			return mat;
		}else if(K % 2 == 1) {
			return mat_mut(N, mat, mat_fact(N, mat, K - 1));
		}else {
			final long[][] ret = mat_fact(N, mat, K / 2);
			return mat_mut(N, ret, ret);
		}
	}
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final long K = sc.nextLong();
			
			long[][] adj = new long[N][N];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					adj[i][j] = sc.nextInt();
				}
			}
			
			long[][] ret = mat_fact(N, adj, K);
			
			long sum = 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					sum += ret[i][j];
					sum %= MOD;
				}
			}
			
			//System.out.println(Arrays.deepToString(ret));
			System.out.println(sum);
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