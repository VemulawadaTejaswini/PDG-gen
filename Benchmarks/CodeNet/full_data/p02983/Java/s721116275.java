
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
	public static void main(String[] args) {
		
		FastReader sc = new FastReader();
	 long l = sc.nextLong();
	 long r = sc.nextLong();
	 if(l<=2019 && r>=2019) out.println(0);
	 else {

	
	 long min = ((l%2019)*(r%2019))%2019;
	 for(long i=l;i<=Math.min(l+2019, r);++i) {
		 for(long j=i+1;j<=Math.min(l+2019, r);++j) {
			 long temp = ((i%2019)*(j%2019))%2019;
			 min = Math.min(min,temp);
			
		 }
		 
	 }
	 out.println(min);
	 
	 }	out.close();
		
	}
	
}