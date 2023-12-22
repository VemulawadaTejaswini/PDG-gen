import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

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
				} catch (Exception addd) {
					addd.printStackTrace();
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
			} catch (Exception addd) {
				addd.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	
	public static FastReader sc = new FastReader();
 
	static int mod = (int) (1e9+7),MAX=(int) (3e5);
    static List<Integer>[] edges;
    static int n;
    static double[] p;
    static Double[][] dp;
    
    
	public static void main(String[] args) {
		n = sc.nextInt();
		p = new double[n+1];
		for(int i=1;i<=n;++i) p[i] = sc.nextDouble();
		dp = new Double[n+1][2*n+1];
		out.print(f(1,0));
		out.close();
   }


	private static double f(int i, int j) {
		if(i > n) {
			if(j > 0) return 1;
			else return 0;
		}
		if(dp[i][j+n] != null) return dp[i][j+n];
		double o1 = 0,o2 = 0;
		o1 = p[i]*f(i+1,j+1);
		o2 = (1-p[i])*f(i+1,j-1);
		return dp[i][j+n] = o1 + o2;
	}

}