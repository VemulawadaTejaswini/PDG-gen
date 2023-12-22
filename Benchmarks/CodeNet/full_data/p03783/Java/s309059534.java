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
		
		if(N > 400 || max_r > 400 || max_l > 400){ return; }
		
		long answer = Long.MAX_VALUE;
		for(int same_l = 0; same_l <= 500; same_l++){
			LOOP:
			for(int same_r = same_l; same_r <= 500; same_r++){
				final long same_size = same_r - same_l;
				
				
				long curr_answer = 0;
				for(int i = 0; i < N; i++){
					final long block_l = ls[i];
					final long block_r = rs[i];
					final long block_size = block_r - block_l;
					
					if(block_size < same_size){ continue LOOP; }
					
					if(block_l <= same_l && same_r <= block_r){ continue; }
					
					//long min_cost = Long.MAX_VALUE;
					
					if(block_l > same_l){
						curr_answer += (block_l - same_l);
					}else if(block_r < same_r){
						curr_answer += (same_r - block_r);
					}
				}
				
				//System.out.println(same_l + " " + same_r + " " + curr_answer);
				answer = Math.min(answer, curr_answer);
			}
		}
		
		System.out.println(answer);
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