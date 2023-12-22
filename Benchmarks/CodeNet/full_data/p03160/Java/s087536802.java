
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map.Entry;
import java.util.*;

public class a {
	static long mod = 1000000009L;

	public static void main(String[] args) throws Exception {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		sc = new FastScanner(in);
		int t = 1;
		while (t-- > 0) {
			int n = sc.nextInt();
			long [] a = input(n);
			
			long[] dp = new long[n];
			for(int i =1 ; i < n ;i++) {
				long temp = Math.abs(a[i]-a[i-1]) + dp[i-1];
				if(i>1)temp = Math.min(temp, Math.abs(a[i] - a[i-2] )+ dp[i-2]);
				dp[i]=temp  ;
			}
			out.println(dp[n-1]);
			 
			
		}
		out.flush();
	}
	static TreeMap<Integer , ArrayList<Integer> > map = new TreeMap<>();
	
	public static TreeMap<Integer , ArrayList<Integer> > undirected(int n ) throws Exception{
		TreeMap<Integer , ArrayList<Integer> > map = new TreeMap<>();
		for(int i = 1 ;i<=n ;i++)map.put(i, new ArrayList<Integer>());
		for(int i = 1 ;i < n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map.get(a).add(b);
			map.get(b).add(a);
		}
		return map;
	}
	public static TreeMap<Integer , ArrayList<Integer> > directed(int n ) throws Exception{
		TreeMap<Integer , ArrayList<Integer> > map = new TreeMap<>();
		for(int i = 1 ;i<=n ;i++)map.put(i, new ArrayList<Integer>());
		for(int i = 1 ;i < n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map.get(a).add(b);
		}
		return map;
	}

	
	
	public static long[] input(int n) throws Exception {

		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		return arr;
	}

	public static long[][] input(int n , int m ) throws Exception {

		long[][] arr = new long[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

	static BufferedReader in;
	static FastScanner sc;
	static PrintWriter out;

	static class FastScanner {
		BufferedReader in;
		StringTokenizer st;

		public FastScanner(BufferedReader in) {
			this.in = in;
		}

		public String nextToken() throws Exception {
			while (st == null || !st.hasMoreTokens()) {
				st = new StringTokenizer(in.readLine());
			}
			return st.nextToken();
		}

		public int nextInt() throws Exception {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() throws Exception {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() throws Exception {
			return Double.parseDouble(nextToken());
		}
	}
}