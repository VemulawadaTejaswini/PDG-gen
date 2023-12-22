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
        PrintWriter out = new PrintWriter(System.out); 

        int n = sc.nextInt();
        long[][] arr = new long[n][3], dp = new long[n][3];
        
        for(int i=0;i<n;i++){
        	for(int j=0;j<3;j++){
        		arr[i][j] = sc.nextLong();	
        	}
        }

        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        for(int i=0;i<n-1;i++){
        	for(int j=0;j<3;j++){
            	for(int k=0;k<3;k++){
            		if(k!=j){
            			dp[i+1][k] = Math.max(dp[i][j]+arr[i+1][k], dp[i+1][k]);   
            		}
            	}
        	}
        }

        out.println(Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2])));
        out.close();
	} 
} 
