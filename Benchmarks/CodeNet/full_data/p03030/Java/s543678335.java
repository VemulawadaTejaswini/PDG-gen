

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
    static final int MAX = (int) 1e6;
    public static List<Integer>[] edges;
    public static int[][] parent;
    public static int col = 20;
    public static long[] Bit;
    public static long[] fac,inv;
    public  static int[] prime; 
    public static long[] dp;
	public static FastReader sc = new FastReader();
	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		Pair[] a = new Pair[n];
		for(int i=0;i<n;++i) {
			a[i] = new Pair(sc.next(),sc.nextInt(),i+1);
		}
		Arrays.sort(a,new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
			    if(!o1.s.equals(o2.s)) return o1.s.compareTo(o2.s);
				return o2.p-o1.p;
			}
			
		});
		for(int i=0;i<n;++i) out.println(a[i].id);
		out.close();
	}
	static class Pair{
		String s;
		int p;
		int id;
		Pair(String s,int p,int id){
			this.s = s;
			this.p = p;
			this.id = id;
		}
	}
	
	
}