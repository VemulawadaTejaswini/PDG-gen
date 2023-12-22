import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.lang.*;
 
public class Main {
	
	static ArrayList<ArrayList<Integer> > graph = new ArrayList<ArrayList<Integer> >(100001);
	static boolean [] vis = new boolean[100001];
	static int [] longestPath = new int [100001];
	
	public static void main(String[] args) throws InterruptedException {
		FastScanner fs=new FastScanner();
		for(int i=0 ; i<100001 ; ++i) {
			graph.add(new ArrayList<>());
		}
		
		int n=fs.nextInt(), m=fs.nextInt();
		int u, v;
		for(int i=0 ; i<m ; ++i) {
			u = fs.nextInt();
			v = fs.nextInt();
			graph.get(u).add(v);
		}
		
		for(int i=1 ; i<=n ; ++i) {
			if(!vis[i]) {
				dfs(i);
			}
		}
		
		System.out.println(maxElement(longestPath) - 1);
	}
	
	static int dfs(int node) {
		vis[node] = true;
		int c=0;
		for(int to : graph.get(node)) {
			if(!vis[to]) {
				c = Math.max(c, dfs(to));
			}
			else {
				c = Math.max(c, longestPath[to]);
			}
		}
		++c;
		longestPath[node] = c;
		return c;
	}
	
	static void sort(int[] a) {
		ArrayList<Integer> list=new ArrayList<>();
		for (int i:a) list.add(i);
		Collections.sort(list);
		for (int i=0; i<a.length; i++) a[i]=list.get(i);
	}
	
	static String reverse(String str) {
	    StringBuilder sb=new StringBuilder(str);
	    sb.reverse();
	    return sb.toString();
	}
	
	static long maxElement(int [] arr) {
		return Arrays.stream(arr).max().getAsInt();
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		public String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
			
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
		
		public long[] readLongArray(int n) {
			long[] a=new long[n];
			for (int i=0; i<n; i++) a[i]=nextLong();
			return a;
		}
	}
 
}