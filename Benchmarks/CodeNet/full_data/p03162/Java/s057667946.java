

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.Stack;

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
   
  // static Scanner sc = new Scanner(System.in);
  
    private final static int mod = (int) (1e9 + 7);
    private final static int N = (int) (1e6);
	public static void main(String[] args) {
	   
	 FastReader sc = new FastReader();
	 int n = sc.nextInt();
	 long[][] tab = new long[n][3];
	 for(int i=0;i<n;++i) {
		 for(int j=0;j<3;++j) {
			 tab[i][j] = sc.nextLong();
		 }
	 }
	 
	 for(int i=n-2;i>=0;--i) {
		 tab[i][0] +=Math.max(tab[i+1][1], tab[i+1][2]);
		 tab[i][1] +=Math.max(tab[i+1][0], tab[i+1][2]);
		 tab[i][2] +=Math.max(tab[i+1][0], tab[i+1][1]);
	 }
	 
	 out.print(Math.max(tab[0][0], Math.max(tab[0][1], tab[0][2])));
	 out.close();
    
	}

	private static long pow(long a, int b) {
		if(b == 0) return 1;
		long temp = pow(a,b/2);
		temp = (temp*temp)%mod;
		if((b&1) == 1) temp = (a*temp)%mod;
		return temp;
	}
}