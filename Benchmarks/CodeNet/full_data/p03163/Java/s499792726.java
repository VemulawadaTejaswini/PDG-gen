
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
		long[][] dp=new long[w+1][n];
		int[] weight=new int[n];
		long[] values=new long[n];
		for(int i=0;i<n;i++) {
			weight[i]=s.nextInt();
			values[i]=s.nextLong();
		}
		for(int i=0;i<w+1;i++) {
			Arrays.fill(dp[i], -1);
		}
		dp[w][0]=0;
		if(w>=weight[0])dp[w-weight[0]][0]=values[0];
		for(int i=1;i<n;i++) {
			for(int j=0;j<w+1;j++) {
				if(dp[j][i-1]!=-1) {
					dp[j][i]=Long.max(dp[j][i],dp[j][i-1]);
					if(j-weight[i]>=0)dp[j-weight[i]][i]=Long.max(dp[j][i-1]+values[i],dp[j-weight[i]][i]);
				}
			}
		}
		long ans=0;
		for(int i=0;i<w+1;i++) {
			ans=Long.max(ans, dp[i][n-1]);
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
