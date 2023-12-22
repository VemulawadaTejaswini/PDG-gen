

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
	static long mod = (long) (1e9+7);
	static long cf = 998244353;
    static final long MAX = (long) 1e8;
    
    public static List<Integer>[] edges;
    public static int[][] parent;
    public static int col = 32;
    public static int[] Bit;
    public static final double pi = Math.acos(-1);

	public static void main(String[] args) {
		FastReader sc = new FastReader();
	       
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n+1];
		long[] pre = new long[n+1];
		for(int i=1;i<=n;++i) {
			a[i] = sc.nextInt();
			pre[i] = pre[i-1] + a[i];
		}
		Map<Long,Integer> map = new HashMap<>();
		add(map,0);
		long ans = 0;
		for(int i=1;i<=n;++i) {
			if(i >= k) delete(map,(pre[i-k]-i+k)%k);
			
			ans += map.getOrDefault((pre[i]-i)%k,0);
			add(map,(pre[i]-i)%k);
		}
		
		out.println(ans);
		
	out.close();
	}
	private static void add(Map<Long, Integer> map, long l) {
		// TODO Auto-generated method stub
		if(map.containsKey(l)) map.put(l, map.get(l)+1);
		else map.put(l, 1);
		
	}
	private static void delete(Map<Long, Integer> map, long l) {
		if(map.containsKey(l)) {
			if(map.get(l) == 1) map.remove(l);
			else map.put(l, map.get(l)-1);
		}
		
	}

	
	
	
	
}