//package ;
import java.io.*;
import java.util.*;

public class Main {
	static int n ,k,a[],dp[][];
	static int dp(int rem,int turn)
	{
		if(rem==0)
			return 0; // loose
		if(rem<0)
			return 1; // win
		
		if(dp[turn][rem]!=-1)
			return dp[turn][rem];
		
		int max=bs(rem);
		
//		System.out.println(rem+" "+max);
		
		int ans=0;
		while(max>=0)
			ans+=1-dp(rem-a[max--],1-turn);
		
		if(ans>0)
			ans=1;
		
		return dp[turn][rem]=ans;
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter pw = new PrintWriter(System.out);
		n=sc.nextInt();k=sc.nextInt();
		a=sc.nextIntArray(n);
		dp=new int[2][k+1];//0 first ,1 second
		Arrays.fill(dp[0], -1);
		Arrays.fill(dp[1], -1);
		System.out.println(dp(k,0)==1?"First":"Second");
//		System.out.println(dp(k,0));
		pw.close();
	}
	static int bs(int v)
	{
		int lo=0,hi=n-1;int ans=-1;
		while(lo<=hi)
		{
			int mid=lo+hi>>1;
			if(a[mid]==v)
				return mid;
			if(a[mid]>v)
				hi=mid-1;
			else
			{
				ans=lo;
				lo=mid+1;
			}
		}
		return ans;
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
