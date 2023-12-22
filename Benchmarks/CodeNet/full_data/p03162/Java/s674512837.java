//package AtCoder;
import java.io.*;
import java.util.*;

public class Main {
	static long dp(int i,int af,int bf,int cf)
	{
		if(i==n)
			return 0;
		if(dp[i][af][bf][cf]!=-1) return dp[i][af][bf][cf];
		
		long ans=0;
		if(af==0)
			ans=Math.max(ans, a[i]+dp(i+1,1,0,0));
		
		if(bf == 0)
			ans=Math.max(ans, b[i]+dp(i+1,0,1,0));
		
		if(cf == 0)
			ans=Math.max(ans, c[i]+dp(i+1,0,0,1));
			
		return dp[i][af][bf][cf] = ans;
	}
	static int n;
	static long[]a,b,c,dp[][][];
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter pw = new PrintWriter(System.out);
		n=sc.nextInt();
		a=new long[n];
		b=new long[n];
		c=new long[n];
		dp=new long[n][2][2][2];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLong();
			b[i]=sc.nextLong();
			c[i]=sc.nextLong();
			for(int j=0;j<2;j++)
				for(int k=0;k<2;k++)
					Arrays.fill(dp[i][j][k], -1);
		}
		System.out.println(dp(0,0,0,0));
		pw.close();
	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
			}
			return st.nextToken();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		boolean hasnext() throws IOException {
			return br.ready();
		}

		public int[] nextIntArray(int n) throws IOException {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public Integer[] nextIntegerArray(int n) throws IOException {
			Integer[] a = new Integer[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		char[] nextCharArray() throws IOException {
			return br.readLine().toCharArray();
		}

		public double[] nextDoubleArray(int n) throws IOException {
			double[] ans = new double[n];
			for (int i = 0; i < n; i++)
				ans[i] = nextDouble();
			return ans;
		}

	}
}
