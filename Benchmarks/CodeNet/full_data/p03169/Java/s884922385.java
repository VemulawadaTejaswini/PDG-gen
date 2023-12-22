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
        int max = 302;
       	double[][][] dp = new double[max+5][max+5][max+5];

        int cnt1=0, cnt2=0, cnt3=0;
        for(int i=1;i<=n;i++){
        	int arr = sc.nextInt();
        	if(arr==1) cnt1++;
        	else if(arr==2) cnt2++;
        	else cnt3++;
		}
        
        for(int k=0;k<max;k++){
        	for(int j=0;j<max;j++){
	        	for(int i=0;i<max;i++){
	        		if(i==0 && j==0 && k==0)
        				continue;
        			if(i+j+k >= max)
        				continue;

        			dp[i][j][k] = (1.0*n)/(i+j+k); 
        			
        			if(i>0)
        				dp[i][j][k] += dp[i-1][j][k]*((1.0*i)/(i + j + k)); 
        			
        			if(j>0)
        				dp[i][j][k] += dp[i+1][j-1][k]*((1.0*j)/(i + j + k)); 
        			
        			if(k>0)
        				dp[i][j][k] += dp[i][j+1][k-1]*((1.0*k)/(i + j + k)); 
        		}
        	}
        }
        
        System.out.println( dp[cnt1][cnt2][cnt3] );
	}
}
