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
		double[] arr=new double[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextDouble();
		}
		if(n==1) {
			out.print(arr[0]);
			out.close();
			return;
		}
		double[][] dp=new double[n+1][n];
		dp[0][0]=(double)1-arr[0];
		dp[1][0]=arr[0];
		outerloop: for(int i=0;i<n-1;i++) {
			for(int j=0;j<n+1;j++) {
				
				dp[j][i+1]+=dp[j][i]*((double)1-arr[i+1]);
				if(j<n)dp[j+1][i+1]+=dp[j][i]*arr[i+1];
			}
		}
		double ans=0.0;
		for(int i=n/2+1;i<n+1;i++) {
			ans+=dp[i][n-1];
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
