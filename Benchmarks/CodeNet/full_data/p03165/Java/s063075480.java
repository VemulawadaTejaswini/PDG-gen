import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
	static long INF = (Long.MAX_VALUE/2);
	public static void main(String[] args) 
	{
		OutputStream outputStream = System.out;
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(outputStream);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int dp[][] = new int[t.length()+1][s.length()+1];
        for(int i = 0; i <= s.length(); i++)
        {
        	dp[0][i] = 0;
        }
        for(int i = 0; i <= t.length(); i++)
        {
        	dp[i][0] = 0;
        }
        
        for(int i = 1; i <= t.length(); i++)
        {
        	for(int j = 1; j <= s.length(); j++)
        	{	
        		if(s.charAt(j-1) == t.charAt(i-1))
        		{
        			dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j-1]+1);
        		}
        		else
        		{
        			dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
        		}
        	}
        }
        out.println(dp[t.length()][s.length()]);
        out.close();
	}

}
