import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		int N = sc.nextInt();
		int[] h = new int[N+1], a = new int[N+1];
		for (int i=1; i<=N; i++) {
			h[i] = sc.nextInt();
		}
		long[] dp = new long[N+1];
		long ans = 0; 
		for (int i=1; i<=N; i++) {
			a[i] = sc.nextInt();
			dp[i] = a[i]; 
			ans = Math.max(dp[i], ans); 
		}
		
		for (int i=1; i<=N; i++) {
			for (int j=i+1; j<=N; j++) {
				if (h[j]>h[i]) {
					dp[j] = Math.max(dp[j], dp[i] + a[j]); 
					ans = Math.max(dp[j], ans); 
				}
			}

		}
		System.out.println(ans);
	}

}
