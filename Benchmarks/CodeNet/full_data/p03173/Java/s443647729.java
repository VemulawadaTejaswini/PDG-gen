import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	static long  MOD = 1000000007;

	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int n=scan.nextInt();

		long ar[]=new long[n];
		for(int i=0;i<n;i++)
			ar[i]=scan.nextLong();

		long dp[][]=new long[n][n];
		long cummSum[]=new long[n];
		long s=0;

		for(int i=0;i<n;i++)
		{
			s+=ar[i];
			cummSum[i]=s;
		}

		for(int l=0;l<n;l++)
		{
			for(int i=0;i<(n-l);i++)
			{
				int j=i+l;
				if(i==j)
				{
					continue;
				}
				long sum=cummSum[j]-((i==0)? 0: cummSum[i-1]);
				long min=Long.MAX_VALUE;
				for(int k=i;k<j;k++)
				{
					min=Math.min(min, dp[i][k]+dp[k+1][j]+sum);
				}
				dp[i][j]=min;
			}
		}

		System.out.println(dp[0][n-1]);
	}
}


 class FastReader
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
