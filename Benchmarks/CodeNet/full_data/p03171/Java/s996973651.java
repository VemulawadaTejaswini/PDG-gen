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
        long[] arr = new long[n];
        long[][] dp = new long[n][n];

        long sum = 0;
        for(int i=0;i<n;i++){
        	arr[i] = sc.nextLong();
        	sum += arr[i];
        }

        for(int l=0;l<n;l++){
        	for(int i=0;i<n-l;i++){
        		int j = i+l;
        		if(l==0)
        			dp[i][j] = arr[i];
        		else if(l==1)
        			dp[i][j] = Math.max(arr[i], arr[j]);
        		else
        			dp[i][j] = Math.max(arr[i] + Math.min(dp[i+2][j], dp[i+1][j-1]), arr[j] + Math.min(dp[i+1][j-1], dp[i][j-2]));
        	}
        }
        
        System.out.println( 2*dp[0][n-1]-sum );
	}
}
