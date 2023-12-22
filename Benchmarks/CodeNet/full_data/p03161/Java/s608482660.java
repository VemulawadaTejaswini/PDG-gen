//package AtCoder;
//package ;
import java.io.*;
import java.util.*;

public class Main {
	static long dp(int i)
	{
		if(i==n-1)
			return 0;
		if(dp[i]!=-1)return dp[i];
		long ans=(long)1e9;
		for(int j=i+1;j<n && j-i<=k;j++)
			ans=Math.min(ans, (long)Math.abs(a[i]-a[j])+dp(j));
		return dp[i]=ans;
	}
	static int n,k;
	static long dp[],a[];
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter pw = new PrintWriter(System.out);
		n=sc.nextInt();k=sc.nextInt();
		a=new long[n];
		for(int i=0;i<n;i++)a[i]=sc.nextLong();
		dp=new long[n];
		Arrays.fill(dp, -1);
		System.out.println(dp(0));
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
