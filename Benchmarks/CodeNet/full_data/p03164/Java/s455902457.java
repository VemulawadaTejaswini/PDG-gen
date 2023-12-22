import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static class FastReader
	{
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(new
					InputStreamReader(System.in));
		}

		String next()
		{
			while (st == null || !st.hasMoreElements())
			{
				try
				{
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException  e)
				{
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt()
		{
			return Integer.parseInt(next());
		}

		long nextLong()
		{
			return Long.parseLong(next());
		}

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try
			{
				str = br.readLine();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			return str;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
		int N = sc.nextInt(), W = sc.nextInt();
		int[] w = new int[N], v = new int[N];
		for (int i=0; i<N; i++) {
			w[i] = sc.nextInt(); 
			v[i] = sc.nextInt(); 
		}
		long[] dp = new long[200010]; 
		Arrays.fill(dp, 1L<<60);

		int max = 0; 
		dp[0] = 0; 
		for (int i=0; i<N; i++) {
			for (int j=200000; j>=v[i]; j--) {
				if (dp[j-v[i]] + w[i]<=W && dp[j-v[i]]>=0) {
					dp[j] = Math.min(dp[j], dp[j-v[i]] + w[i]); 
					max = Math.max(j, max); 
				}
			}
		}
		System.out.println(max);
	}

}
