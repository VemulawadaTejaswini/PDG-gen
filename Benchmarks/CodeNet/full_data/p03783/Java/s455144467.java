import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		
		long[] ls = new long[N];
		long[] rs = new long[N];
		for(int i = 0; i < N; i++){
			ls[i] = sc.nextLong();
			rs[i] = sc.nextLong();
		}
		
		final long max_r = Arrays.stream(rs).max().getAsLong();
		final long max_l = Arrays.stream(ls).max().getAsLong();
		
		if(N > 400 || max_r > 400 || max_l > 400){ throw new RuntimeException(); }
		
		long[] DP = new long[400 + 1];
		long[] nextDP = new long[400 + 1];
		Arrays.fill(DP, Integer.MAX_VALUE);
		
		for(int left = 0; left <= 400 - (rs[0]); left++){
			DP[left] = Math.abs(ls[0] - left);
		}
		
		//System.out.println(Arrays.toString(DP));
		for(int block = 1; block < N; block++){
			final int curr_block_l = (int)(ls[block]);
			final int curr_block_r = (int)(rs[block]);
			
			Arrays.fill(nextDP, Integer.MAX_VALUE);
			
			for(int left = 0; left <= (400 - curr_block_r); left++){
				final int prev_block_r = Math.min(400, left + (int)(rs[block - 1] - ls[block - 1]));
				
				for(int next_left = Math.max(0, left - (curr_block_r - curr_block_l)); next_left <= prev_block_r; next_left++){
					//System.out.println(next_left + " " + left + " " + DP[left] + " " + (DP[left] + Math.abs(next_left - curr_block_l)));
					
					//System.out.println(next_left + " " + (DP[left] + Math.abs(next_left - curr_block_l)));
					nextDP[next_left] = Math.min(nextDP[next_left], DP[left] + Math.abs(next_left - curr_block_l));
				}
			}
			
			//System.out.println(Arrays.toString(nextDP));
			
			for(int i = 0; i < DP.length; i++){ DP[i] = nextDP[i]; }
			
			//System.out.println(Arrays.toString(DP));
		}
		
		System.out.println(Arrays.stream(nextDP).min().getAsLong());
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