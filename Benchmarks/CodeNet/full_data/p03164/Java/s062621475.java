import java.util.*;
import java.io.*;
public class Main
{   
    public static long knapSack(int value[],int weight[],long dp[][],int w)
    {
        for(int i=0;i<dp.length;i++)
        for(int j=0;j<dp[i].length;j++)
        {
            dp[i][j]=Integer.MAX_VALUE;
        }
        for(int i=0;i<dp.length;i++)dp[i][0]=0;
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[i].length;j++)
            {
                if(value[i-1]<=j)
                {
                    dp[i][j]=Math.min(weight[i-1]+dp[i-1][j-value[i-1]],dp[i-1][j]);
                }
                else dp[i][j]=dp[i-1][j];
            }
        }
        
        long ans=0;
        for(int j=0;j<dp[0].length;j++)
        {
            if(dp[dp.length-1][j]<=w)
            {
                ans=j;
            }
        }
        return ans;
    }
	public static void main(String[] args)throws IOException {
		    FastReader kb=new FastReader();
            int sum=0;
            int n=kb.nextInt(),w=kb.nextInt();
            int value[]=new int[n];
            int weight[]=new int[n];
            for(int i=0;i<n;i++)
            {
                weight[i]=kb.nextInt();value[i]=kb.nextInt();sum+=value[i];
            }
            long dp[][]=new long[n+1][sum+1];
            System.out.println(knapSack(value,weight,dp,w));
	}
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
  
}













