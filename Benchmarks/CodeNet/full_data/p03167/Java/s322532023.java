//package AtCoder;

//package AtCoder;
import java.io.*;
import java.util.*;

public class Main {
	static int h,w,a[][];
	static long dp[][];
	static long dp(int i,int j)
	{
		if(i == h-1 && j == w-1)
			return 1;
		
		if(dp[i][j] != -1)
			return dp[i][j];
		
		long right=0,down=0;
		if(j+1 < w && a[i][j+1] != '#')
			right = dp(i,j+1);
		
		if( i+1 < h && a[i+1][j] != '#')
			down = dp(i+1,j);
		
		return dp[i][j] = (right+down)%((int)1e9+7);
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter pw = new PrintWriter(System.out);
		h=sc.nextInt();w=sc.nextInt();
		a=new int[h][w];
		dp=new long[h][w];
		for(int i=0;i<h;i++)
		{	
			String s=sc.nextLine();
			for(int j=0;j<w;j++)
			{	
				
				a[i][j]=s.charAt(j);
				dp[i][j]=-1;
			}
		}
		System.out.println(dp(0,0));
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
