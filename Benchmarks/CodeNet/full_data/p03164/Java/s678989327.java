
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out=new PrintWriter (new BufferedOutputStream(System.out));
		FastReader s=new FastReader();
		int n=s.nextInt();
		int w=s.nextInt();
		long[] dp=new long[(int)1e6];
		Arrays.fill(dp, Long.MAX_VALUE);
		dp[0]=0;
		for(int i=0;i<n;i++) {
			long cw=s.nextLong();
			int cv=s.nextInt();
			for(int j=(int)1e6-cv;j>=0;j--) {
				if(dp[j]!=Long.MAX_VALUE) {
					dp[j+cv]=Long.min(dp[j+cv], dp[j]+cw);
				}
			}
		}
		long ans=0;
		for(int i=0;i<(int)1e6;i++) {
			if(dp[i]<=w) {
				ans=Long.max(i, ans);
			}
		}
		out.println(ans);
		out.close();
	}

	public static PrintWriter out;
	
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
				} catch (Exception e) {
					e.printStackTrace();
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
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}
	
}
