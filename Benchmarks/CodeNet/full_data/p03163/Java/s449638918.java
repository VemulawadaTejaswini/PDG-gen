//package AtCoder;
import java.io.*;
import java.util.*;

public class Main {
	static int n,w;
	static long a[][],dp[][];
	static long dp(int i,int curw)
	{
		if(curw>w)
			return (int)-1e9;

		if(i==n || curw == w)
			return 0;
		if(dp[i][curw]!=-1) return dp[i][curw];
		
		long take=a[1][i]*1l+dp(i+1,curw+(int)a[0][i]);
		long leave=dp(i+1,curw);
		return dp[i][curw]=Math.max(take, leave);
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter pw = new PrintWriter(System.out);
		n=sc.nextInt();w=sc.nextInt();
		a=new long[2][n];// 0 for weight 1 for value
		dp=new long[n][w+1];
		for(int i=0;i<n;i++)
		{
			a[0][i]=sc.nextInt();
			a[1][i]=sc.nextInt();
			Arrays.fill(dp[i], -1);
		}
		System.out.println(dp(0, 0));
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
