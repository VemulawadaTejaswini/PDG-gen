

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;






public class Main {
	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
	

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
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
    //public static long mod = (long) (1e9+7);
    public final static int MAX = (int)1e5;
  // static Scanner sc = new Scanner(System.in);
   static List<Integer>[] edge;
   private static int N = (int) (2e5 + 11);
	public static void main(String[] args) {
	   
	 FastReader sc = new FastReader();

	int n = sc.nextInt();
	int[] a = new int[n];
	for(int i=0;i<n;++i) a[i] = sc.nextInt();
	int[] idx = new int[n];
	idx[0] = 0;
    int ans = 0;
	for(int i=1;i<n;++i) {
		if(a[i]<=a[i-1]) idx[i] = idx[i-1]+1;
		else idx[i] = 0;
		ans = Math.max(ans, idx[i]);
	}
	out.print(ans);
	 out.close();
	}
}