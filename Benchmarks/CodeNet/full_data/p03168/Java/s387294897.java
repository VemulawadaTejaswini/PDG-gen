import java.io.*; 
import java.util.*; 

public class Main{ 
	
	static class FastReader{ 
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
				catch (IOException e) 
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

	public static void main(String[] args) 
	{ 
        FastReader sc = new FastReader(); 
        //PrintWriter out = new PrintWriter(System.out); 

        int n = sc.nextInt();
        
       	double[] arr = new double[n+10];
        double[][] dp = new double[n+10][n+10];

        for(int i=1;i<=n;i++){
        	arr[i] = sc.nextDouble();
		}
        
        dp[1][0] = 1.0 - arr[1];
        dp[1][1] = arr[1];

        for(int i=1;i<n;i++){
        	for(int j=0;j<=n;j++){
        		if(j>i) continue;
        		dp[i+1][j] += dp[i][j]*(1.0 - arr[i+1]);
        		dp[i+1][j+1] += dp[i][j]*(arr[i+1]);
        	}
        }
        
        double ans = 0.0;
        for(int i=(n+1)/2; i<=n; i++){
        	ans += dp[n][i];
        }
        System.out.println(ans);
        
	}
}
