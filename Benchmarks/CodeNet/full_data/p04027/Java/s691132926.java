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
	
	public static long mod_pow(long a, long e, long m){
		if(e == 0){
			return 1;
		}else if(e % 2 == 0){
			long ret = mod_pow(a, e / 2, m);
			return (ret * ret) % m;
		}else{
			return (mod_pow(a, e - 1, m) * a) % m;
		}
	}
	
	public static class SegmentTree {
		int size;
		long exp;
		long[] data;
		
		public SegmentTree(long s, long e){
			this.size = 1;
			while(this.size < s){
				this.size *= 2;
			}
			
			this.exp = e;
			this.data = new long[this.size * 2 - 1];
			Arrays.fill(this.data, 0);
		}
		
		public void update(int k, long a){
			k += this.size - 1;
			data[k] = a;
			data[k] %= MOD;
			
			long mult = this.exp;
			while(k > 0){
				k = (k - 1) / 2;
				data[k] = ((mult * data[k * 2 + 1]) % MOD) + data[k * 2 + 2] ;
				data[k] %= MOD;
				
				mult *= mult;
				mult %= MOD;
			}
			
			
		}
		
		public long query(int a, int b, int k, int l, int r){
			if(r <= a || b <= l){
				return 0;
			}else if(a <= l && r <= b){
				return (mod_pow(this.exp, b - r, MOD) * data[k]) % MOD;
			}else {
				final long left  = query(a, b, k * 2 + 1, l, (l + r) / 2);
				final long right = query(a, b, k * 2 + 2 , (l + r) / 2, r);
				
				return (left + right) % MOD;
			}
		}

		public long query(int a, int b){
			return query(a, b, 0, 0, this.size);
		}
	}
	
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
		for(int item = 0; item < N; item++){ //400
			//if(As[item] != Bs[item]){ return; }
			
			Arrays.fill(nextDP, 0l);
			
			for(int value = As[item]; value <= Bs[item]; value++){ // 400
				//System.out.println(Arrays.toString(DP));
				SegmentTree segment = new SegmentTree(C + 1, value);
				for(int i = 0; i <= C; i++){
					segment.update(i, DP[i]);
				}
				
				
				for(int to = C; to >= 0; to--){ // 400 
					//System.out.println("[0, " + to + ") = " + segment.query(0, to) + " " + value);
					
					nextDP[to] += segment.query(0, to + 1);
					nextDP[to] %= MOD;
					//nextDP[to] += DP[to];
					//nextDP[to] %= MOD;
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