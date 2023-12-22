import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Main{
	
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
	public static void main(String[] args) 
	{
		OutputStream outputStream = System.out;
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(outputStream);
        int n = sc.nextInt();
        int mat[][] = new int[n][3];
        for(int i = 0; i < n; i++)
        {
        	for(int j = 0; j < 3; j++)
        	{
        		mat[i][j] = sc.nextInt();
        	}
        }
        int dp[][] = new int[n][3];
        for(int i = 0; i < 3; i++)
        {
        	dp[0][i] = mat[0][i];
        }
        for(int i = 0; i < n-1; i++)
        {
        	for(int j = 0; j < 3; j++)
        	{
        		if(j == 0)
        		{
        			dp[i+1][j+1] = Math.max(dp[i+1][j+1],dp[i][j]+mat[i+1][j+1]);
        			dp[i+1][j+2] = Math.max(dp[i+1][j+2],dp[i][j]+mat[i+1][j+2]);
        		}
        		else if(j == 1)
        		{
        			dp[i+1][j+1] = Math.max(dp[i+1][j+1],dp[i][j]+mat[i+1][j+1]);
        			dp[i+1][j-1] = Math.max(dp[i+1][j-1],dp[i][j]+mat[i+1][j-1]);
        		}
        		else
        		{
        			dp[i+1][j-2] = Math.max(dp[i+1][j-2],dp[i][j]+mat[i+1][j-2]);
        			dp[i+1][j-1] = Math.max(dp[i+1][j-1],dp[i][j]+mat[i+1][j-1]);
        		}
        		
        	}
        	
        }
        int max = Integer.MIN_VALUE;
        for(int j = 0; j < 3; j++)
        {
        	max = Math.max(max,dp[n-1][j]);
        }
        out.println(max);
        out.close();
	}

}
