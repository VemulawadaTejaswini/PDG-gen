import java.util.*;
import java.io.*;
import java.math.*;
class Main{
public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static void main(String sp[])throws IOException{
		FastReader sc = new FastReader();
		long n = sc.nextLong();
		long k = sc.nextLong();
		if(n*500>=k)
			System.out.println("Yes");
		else System.out.println("No");
		
	}
	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer sz;


		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (sz == null || !sz.hasMoreTokens()) {
				try {
					sz = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return sz.nextToken();
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

}