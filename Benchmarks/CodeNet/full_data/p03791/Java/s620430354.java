import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		long[] pos = new long[n + 1];
		for(int i = 0; i < n; i++){
			pos[i + 1] = sc.nextLong();
		}
		
		int any_order = n;
		long answer = 1;
		
		for(int i = 1; i <= n; i++){
			final long prev_diff = pos[i] - pos[i - 1];
			
			if(prev_diff <= 1){
				answer *= i - (n - any_order);
				answer %= 1000000007;
					
				any_order -= 1;
					
				pos[i] = pos[i - 1];
			}else{
				if(i == 1){
					pos[i] = pos[i - 1] + 1;
				}else{
					pos[i] = pos[i - 1] + 2;
				}
			}
		}
		
		//System.out.println(any_order + " " + Arrays.toString(pos));
		
		
		for(int i = 1; i <= any_order; i++){
			answer *= i;
			answer %= 1000000007;
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