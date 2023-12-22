package agc036;
import java.io.*;
import java.util.*;

public class Main {
	// ------------------------
	
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));
		// ------------------------
		long s=sc.nextLong();
		long b=bSearch(0,(long)Math.pow(10,9),s);
		long a=s-b*b-b;
		out.println("0 0 "+(b+1)+" "+a+" "+b+" "+(a+b));
		// ------------------------
		out.close();
	}
	//------------------------
	private static long bSearch(long st,long en,long s){
		if(st==en)
			return st;
		long mi=(st+en)/2;
		long x=mi*mi+mi;
		if(x<=s&&mi+(s-x)<=Math.pow(10,9))
			return mi;
		else if(x<=s)
			return bSearch(mi+1,en,s);
		return bSearch(st,mi-1,s);
		
	}
	public static PrintWriter out;
	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
