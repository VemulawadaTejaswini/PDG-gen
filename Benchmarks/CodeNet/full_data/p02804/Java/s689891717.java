

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Stack;


public class Main{
	public static class FastReader {
		BufferedReader br;
		StringTokenizer root;
		
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (root == null || !root.hasMoreTokens()) {
				try {
					root = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return root.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	static int mod = (int) (1e9+7);
	static long cf = 998244353;
    static final long MAX = (long) 1e15;
    public static List<Integer>[] edges;
    public static int[][] parent;
    public static int col = 32;
    public static int[] Bit;
    public static long[] dp;
    public static long[] fac,inv;
	public static void main(String[] args) {
	
	
	FastReader sc = new FastReader();
	

	int n = sc.nextInt();
	int k = sc.nextInt();
	Long[] a = new Long[n];
	for(int i=0;i<n;++i) a[i] = sc.nextLong();
	Arrays.sort(a);
	long ans = 0;
	preprocess(n);
	for(int i=0;i<n;++i) {
		long max = (a[i]*(C(i,k-1)))%mod;
		long min = (a[i]*C(n-i-1,k-1))%mod;
		ans = (ans + max-min+mod)%mod;
	}
	out.print(ans);
	out.close();
	}

	private static long C(int n, int r) {
		if(r > n) return 0;
	
		return ((fac[n]*inv[r])%mod*inv[n-r])%mod;
	}

	private static void preprocess(int n) {
		// TODO Auto-generated method stub
		
		
		 fac = new long[n+1];
		 inv = new long[n+1];
		fac[0]=fac[1]=1;
		for(int i=2;i<fac.length;i++)
		{
			fac[i]=fac[i-1]*i;
			fac[i]%=mod;
		}
		
		inv[n]=pow(fac[n],(int) (mod-2));
		for(int i=n-1;i>=0;i--)
		{
			inv[i]=inv[i+1]*(i+1);
			inv[i]%=mod;
		}
		
	}

	private static long pow(long l, int i) {
		// TODO Auto-generated method stub
		return BigInteger.valueOf(l).modPow(BigInteger.valueOf(i), BigInteger.valueOf(mod)).longValue();
	}

	
	
}