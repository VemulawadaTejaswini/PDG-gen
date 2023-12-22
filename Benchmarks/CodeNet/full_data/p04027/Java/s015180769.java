import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
 
public class Main {
	
	public static final long MOD = 1000000007;
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final int C = sc.nextInt();
		
		final int[] As = new int[N];
		for(int i = 0; i < N; i++){
			As[i] = sc.nextInt();
		}
		final int[] Bs = new int[N];
		for(int i = 0; i < N; i++){
			Bs[i] = sc.nextInt();
		}
		
		long[] DP = new long[C + 1];
		DP[0] = 1;
		long[] nextDP = new long[C + 1];
		
		// TLE不可避
		for(int item = 0; item < N; item++){
			//if(As[item] != Bs[item]){ return; }
			
			Arrays.fill(nextDP, 0l);
			for(int value = As[item]; value <= Bs[item]; value++){
				//System.out.println(Arrays.toString(DP));
				
				
				for(int base = C; base >= 0; base--){
					long val = 1;

					for(int exp = 0; exp <= (C - base); exp++){
						nextDP[base + exp] += (DP[base] * val) % MOD;
						nextDP[base + exp] %= MOD;
						
						val *= value;
						val %= MOD;
					}
				}
			}
			
			{
				long[] tmp = DP;
				DP = nextDP;
				nextDP = tmp;
			}	
		}
		
		
		System.out.println(DP[C]);
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
 
		public void close() throws IOException {
			br.close();
		}
	}
}