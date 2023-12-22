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
        int m = sc.nextInt();
        long mod = 1000000007L;
        char[][] arr = new char[n][m];
        long[][] dp = new long[n][m];

        for(int i=0;i<n;i++){
        	String line = sc.nextLine();
        	arr[i] = line.toCharArray();
		}
        
        for(int j=0;j<m;j++){
        	if(arr[0][j]=='#')
        		break;
        	dp[0][j] = 1;
        }

        for(int i=0;i<n;i++){
        	if(arr[i][0]=='#')
        		break;
        	dp[i][0] = 1;
        }


        for(int i=1;i<n;i++)
        	for(int j=1;j<m;j++){
        		if(arr[i][j]=='#')
        			continue;
        		dp[i][j] = (dp[i-1][j]+dp[i][j-1])%mod;
        	}

        System.out.println(dp[n-1][m-1]);
        
	}
}
