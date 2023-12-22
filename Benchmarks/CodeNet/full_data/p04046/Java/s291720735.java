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
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.StringTokenizer;
 
public class Main {
	
	public static final long MOD = 1000000007;
	
	public static long mod_inv(long a, long m){
		return (a == 1 ? 1 : (1 - m*mod_inv(m%a, a)) / a + m);
	}
	
	public static long comb(int n, int k, long[] fact){
		if(n == 0){ return 1; }
		if(k == 0){ return 1; }
		
		return (((fact[n] * mod_inv(fact[k], MOD)) % MOD) * mod_inv(fact[n - k], MOD)) % MOD;
	}
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int H = sc.nextInt();
		final int W = sc.nextInt();
		final int A = sc.nextInt();
		final int B = sc.nextInt();
		
		final long[] fact = new long[H + W + 1];
		fact[0] = 1;
		for(int i = 1; i < fact.length; i++){
			fact[i] = i * fact[i - 1];
			fact[i] %= MOD;
		}
		//System.out.println(Arrays.toString(fact));
		
		long answer = 0;
		for(int i = B; i < W; i++){
			//System.out.println(comb(H - A + i - 1, i, fact));
			//System.out.println(A + " " + (W - i - 1) + " " + comb(A + (W - i - 1), A - 1, fact));
			answer += (comb((H - A) + i - 1, i, fact) * comb((A - 1) + (W - i - 1), A - 1, fact)) % MOD;
			//System.out.println(i + " " + answer);
			answer %= MOD;
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
 
		public void close() throws IOException {
			br.close();
		}
	}
}