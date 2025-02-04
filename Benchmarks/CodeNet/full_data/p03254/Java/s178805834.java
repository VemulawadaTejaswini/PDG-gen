
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
    public static long mod = (long) (1e9+7);
    public final static int MAX = (int) 90000000;
  // static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	   
	 FastReader sc = new FastReader();
	 int n = sc.nextInt();
	 int x = sc.nextInt();
	 Integer[] a = new Integer[n];
	 for(int i=0;i<n;++i) a[i] = new Integer(sc.nextInt());
	 Arrays.sort(a);
	 int[] b = new int[n];
	 for(int i=0;i<n-1;++i) {
		 int min = Math.min(a[i], x);
		 x-=min;
		 b[i] = min;
	 }
	 b[n-1] = x;
	
	 int ans = 0;
	 for(int i=0;i<n;++i) if(a[i] == b[i]) ++ans;
	 out.print(ans);
	 
	 
	
	 out.close();
		
	}
	
}