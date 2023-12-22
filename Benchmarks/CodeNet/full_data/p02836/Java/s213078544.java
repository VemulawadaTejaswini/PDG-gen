import java.util.*;
import java.io.*;
import java.math.*;
class Main{
	static int mod = 998244353;
public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static void main(String sp[])throws IOException{
		FastReader sc = new FastReader();
		String st = sc.next();
		int n = st.length();
		int mid = n/2;
		
		int ans=0;
		
		for(int i=0,j=n-1;i<mid;i++,j--){
			if(st.charAt(i)!=st.charAt(j))
				ans++;
		}
		System.out.println(ans);
	}
	
	
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

}