import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static class FastScanner {
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		public FastScanner(InputStream source) {
			in = source;
		}

		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte()) return buffer[ptr++];
			else return -1;
		}

		private static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
			return hasNextByte();
		}

		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}

		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
				throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}

	/**
	 * Compute n! mod. p, (n!)^(-1) mod.p
	 * @param fac[]		: n! mod. p
	 * @param finv[]	: (n!)^(-1) mod. p
	 * @param MAX 		:
	 * @param MOD 		:
	 */

	static void hz_COMinit(long fac[],long finv[], long inv[],final int MAX, final long MOD) {
	    fac[0] = fac[1] = 1L;
	    finv[0] = finv[1] = 1L;
	    inv[1] = 1L;
	    for (int i = 2; i < MAX; i++){
	        fac[i] = fac[i - 1] * i % MOD;
	        inv[i] = MOD - inv[(int)(MOD%i)] * (MOD / i) % MOD;
	        finv[i] = finv[i - 1] * inv[i] % MOD;
	    }
	}
	/*
	static void hz_COMinit(long fac[], long finv[], long inv[],final int MAX, final long MOD) {
	    fac[0] = fac[1] = 1L;
	    finv[0] = finv[1] = 1L;
	    inv[1] = 1L;
	    for (int i = 2; i < MAX; i++){
	        fac[i] = (BigInteger.valueOf(fac[i - 1]).multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD))).longValue();
	        inv[i] = (BigInteger.valueOf(MOD).subtract(BigInteger.valueOf(inv[(int)(MOD%i)]).multiply(BigInteger.valueOf(MOD/i)).mod(BigInteger.valueOf(MOD)))).longValue();
	        finv[i] = (BigInteger.valueOf(finv[i - 1]).multiply(BigInteger.valueOf(inv[i])).mod(BigInteger.valueOf(MOD))).longValue();
	    }
	}
	*/


	/**
	 * @Compute nCk(二項係数計算) mod. p
	 * @param fac[]		: n! mod. p
	 * @param finv[]	: (n!)^(-1) mod. p
	 * @return 			:nCk(二項係数計算) mod. p
	 */
	static long hz_COM(long fac[],long finv[], int n, int k, final long MOD){
	    if (n < k) return 0;
	    if (n < 0 || k < 0) return 0;
	    return fac[n]*(finv[k]*finv[n - k] %MOD )%MOD;
	}
	/*
	static long hz_COM(long fac[],long finv[], int n, int k, final long MOD){
	    if (n < k) return 0;
	    if (n < 0 || k < 0) return 0;
	    return BigInteger.valueOf(fac[n])
	    			.multiply(BigInteger.valueOf(finv[k])
	    					.multiply(BigInteger.valueOf(finv[n - k]))
	    					.mod(BigInteger.valueOf(MOD))
	    					)
	    			.mod(BigInteger.valueOf(MOD)).longValue();
	}
	*/

	static long hz_swap(long a, long b){
		if(a >= b) return a;
		else return b;
	}

	//Union Find Tree
	static class HZ_UF{
		
		public int[] par;
		public int[] rank;
		
		public HZ_UF(int n){
			this.par = new int[n + 1];
			this.rank = new int[n + 1];
			
			Arrays.fill(par, -1);
			Arrays.fill(rank, 0);
		}
		
		public void unite(int x, int y){
			link(root(x), root(y));
		}
		
		public boolean link(int x, int y){
			if(x == y) return false;
			if(rank[x] > rank[y]){
				par[y] = x;
			}
			else{
				par[y] += par[x];
				par[x] = y;
				if(rank[x] == rank[y]) rank[y]++;
			}
			return true;
		}
		
		public boolean isSame(int x, int y){
			return root(x) == root(y);
		}
		
		public int root(int x){
			if(par[x] < 0){
				return x;
			}
			else{
				return x = root(par[x]);
			}
		}
		
		public int size(int x){
			return -par[root(x)];
		}
	}
	
	
	public static void main(String[] args){

		solve_abc120_d();
	}
  
  	public static void solve_abc120_d(){

		FastScanner sc = new FastScanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] a = new int[m];
		int[] b = new int[m];
		
		for(int i=0;i<m;i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		/*
		// combination of initial
		HZ_UF uf_init = new HZ_UF(n);
		for(int i=0;i<m;i++){
			uf_init.unite(a[i], b[i]);
		}
		
		Map<Integer, Integer> m_init = new HashMap<>();
		for(int i=1;i<=n;i++){
			int root = uf_init.findSet(i);
			if(m_init.containsKey(root)){
				m_init.put(root, m_init.get(root) + 1);
			}
			else{
				m_init.put(root, 1);
			}
		}
		
		long c_init = 0L;
		
		for(Map.Entry<Integer, Integer> entry: m_init.entrySet()){
			int countUfContents = entry.getValue();
			if(countUfContents >= 2){
				//nCk
				c_init += countUfContents * (countUfContents - 1) / 2;
			}
		}
		*/
		
		// combination of a, b, c
		long[] combination = new long[m];
		Arrays.fill(combination, 0L);
		HZ_UF uf_i = new HZ_UF(n);
		StringBuffer ans = new StringBuffer();
		long[] ansi = new long[m];
		
		long cur = (long) n * ((long)n-1L) / 2L;

		for(int x=m-1;x>=0;x--){
			ansi[x] = cur;
			if(uf_i.isSame(a[x], b[x])) continue;
			
			cur -= (long)uf_i.size(a[x]) * (long)uf_i.size(b[x]);
			uf_i.unite(a[x], b[x]);
		}
		
		for(int i=0;i<m;i++){
			System.out.println(ansi[i]);
		}
	}
}