import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
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
	//static long INF = (Long.MAX_VALUE/2);
	static int mod = (int)(1e9+7);
	public static void main(String[] args) 
	{
		OutputStream outputStream = System.out;
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(outputStream);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char mat[][] = new char[h][w];
        int dp[][] = new int[h][w];
        for(int i = 0; i < h; i++)
        {
        	mat[i] = sc.nextLine().toCharArray();
        }
        dp[h-1][w-1] = 1;
        for(int i = h-1; i >= 0; i--)
        {
        	for(int j = w-1; j >= 0; j--)
        	{
        		if(mat[i][j] == '#')
        			dp[i][j] = 0;
        		
        		else if(i < h-1 && j < w-1)
        			dp[i][j] = (dp[i+1][j]+dp[i][j+1])%(mod);
        		
        		else if(i == h-1 && j != w-1)
        			dp[i][j] = dp[i][j+1]%(mod);
        		
        		else if(i != h-1 && j == w-1)
        			dp[i][j] = dp[i+1][j]%(mod);
        		
        	}
        }
        
        out.println(dp[0][0]);
        out.close();
	}

}
