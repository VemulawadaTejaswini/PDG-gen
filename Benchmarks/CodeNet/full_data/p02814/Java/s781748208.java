
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void solve() {
		int n=s.nextInt();
		int m= s.nextInt();
		long[] arr = new long[n];
		HashSet<Long> helper = new HashSet<>(); 
		for(int i=0;i<n;i++) {
			arr[i]=s.nextLong();
			helper.add((arr[i]/2L));
		}
		long val = 1;
		for(Long x:helper) {
			val*= x;
			if(val>m) {
				out.println(0);
				return;
			}
		}
		long ans = m/val;
		ans = ans%2==0?ans/2:ans/2+1;
		out.println(ans);
	}

	public static void main(String[] args) {
		out = new PrintWriter(new BufferedOutputStream(System.out));
		s = new FastReader();
		solve();
		out.close();
	}

	public static FastReader s;
	public static PrintWriter out;

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
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
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
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	
}
