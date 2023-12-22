import java.io.*;
import java.util.*;

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
    static final int MAX = 100000;
   // public static List<Integer>[] edges;
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		for(int i=0;i<n;++i) 
			a[i] = sc.nextInt();
		Arrays.sort(a);
		TreeMap<Integer,Integer> map = new TreeMap<>();
		for(int i=0;i<n;++i) {
			map.put(a[i],i);
		}
		
		long ans = 0;
		for(int i=n-2;i>0;--i) {
			for(int j=i-1;j>=0;--j) {
				
				int key = a[i]+a[j];
				if(map.lowerKey(key) != null) {
					int idx = map.get(map.lowerKey(key));
					ans+=Math.max(0L,idx-i);
				}
			}
		}
		
		out.print(ans);
	    out.close();
	}
	
}