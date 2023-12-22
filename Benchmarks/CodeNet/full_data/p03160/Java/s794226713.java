import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static class Reader {
		BufferedReader br;
		StringTokenizer st;
 
		public Reader() {
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
	
	// static int min = Integer.MAX_VALUE;
	static int[] dp, a;

	public static void main(String[] args) {
		Reader r = new Reader();
		
		int n = r.nextInt();
		a = new int[n];
		dp = new int[n];
		
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		for (int i = 0; i < n; i++) {
			a[i] = r.nextInt();
		}
		
		dp[0] = 0;
		dp[1] = Math.abs(a[1] - a[0]);
		for (int i = 2; i < n; i++) {
			dp[i] = Integer.min(dp[i - 1] + Math.abs(a[i] - a[i - 1]), dp[i - 2] + Math.abs(a[i] - a[i - 2]));
		}
		System.out.println(dp[n - 1]);
	}
}
