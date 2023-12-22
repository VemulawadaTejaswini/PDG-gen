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
        int k = sc.nextInt();
        int h[] = new int[n];
        for(int i = 0; i < n; i++) h[i] = sc.nextInt();
        
        int dp[] = new int[n];
        
        dp[0] = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++)
        {	
        	min = Integer.MAX_VALUE;
        	for(int j = 1; j <= k; j++)
        	{	
        		if(i-j >= 0)
        		{
        			min = Math.min(min,dp[i-j]+Math.abs(h[i]-h[i-j]));
        		}
        		else
        		{
        			break;
        		}
        	}
        	dp[i] = min;
        }
        
        out.println(dp[n-1]);
        out.close();
	}

}
