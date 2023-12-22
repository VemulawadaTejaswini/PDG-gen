

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
    static final int MAX = (int) 2e6;
    public static List<Integer>[] edges;
    public static int[][] parent;
    public static int col = 20;
    public static int[] Bit;
    public static long[][] dp;
    public static long[] fac,inv;
    public  static int[] prime; 
	public static Map<Integer, Integer> map; 
	public static void main(String[] args) {
	
	FastReader sc = new FastReader();
	
	 prime = new int[MAX];
	 map = new HashMap<>();
	 sieve(); 
	 int n = sc.nextInt();
	 int[] a = new int[n];
	 for(int i=0;i<n;++i)
		 a[i] = sc.nextInt();
	
	  long lcm = lcmModuloM(a, n); 
	  long ans = 0;
	 
	  for(int i=0;i<n;++i) { 
		  ans += (lcm*power(a[i],mod-2))%mod;
		  if(ans >= mod) ans-=mod;
	  }
	  out.println(ans);
	out.close();

	}

	
	static long power(int a, int n) 
	{ 
	    if (n == 0) 
	        return 1; 
	    long p = power(a, n / 2) % mod; 
	    p = (p * p) % mod; 
	    if ((n & 1) == 1) 
	        p = (p * a) % mod; 
	    return p; 
	} 
	
	static void sieve() 
	{ 
	    prime[0] = prime[1] = 1; 
	    for (int i = 2; i < MAX; i++) { 
	        if (prime[i] == 0) { 
	            for (int j = i * 2; j < MAX; j += i) { 
	                if (prime[j] == 0) { 
	                    prime[j] = i; 
	                } 
	            } 
	            prime[i] = i; 
	        } 
	    } 
	} 
	  
	
	static long lcmModuloM(int[] ar, int n) 
	{ 
	  
	    for (int i = 0; i < n; i++) { 
	        int num = ar[i]; 
	        Map<Integer,Integer> temp = new HashMap<>(); 
	  
	        while (num > 1) {
	            int factor = prime[num]; 
	            temp.put(factor,temp.getOrDefault(factor,0)+1); 
	            num /= factor; 
	        } 
	  
	        for (int key : temp.keySet()) { 
	        	map.put(key, Math.max(map.getOrDefault(key,0),temp.get(key)));
	        } 
	    } 
	  
	    long ans = 1; 
	  
	    for (int key : map.keySet()) {
	        ans = (ans * power(key,map.get(key))) % mod; 
	    } 
	    return ans; 
	} 
	  
}