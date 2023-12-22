
import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Stack;
import java.util.regex.Pattern;






public class Main {

	
	 
	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		//it reads the data about the specified point and divide the data about it ,it is quite fast
		//than using direct 

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
	static long mod = (long) (1e9+7);
	static int N = (int) 1e5;
	public static void main(String[] args) {
		 FastReader sc = new FastReader();
		 int n = sc.nextInt();
		 int[] h = new int[n];
			for(int i=0;i<n;++i) {
				h[i] = sc.nextInt();
			}
			boolean yes = true;
			h[0]--;
		for(int i=1;i<n && yes;++i) {
			
			if(h[i]-1>=h[i-1]) h[i]--;
			else if(h[i]<h[i-1]) yes = false;
		}
		
		 if(yes) out.print("Yes");
		 else  out.print("No");
			 out.close();
		}
		
	 
		
	}