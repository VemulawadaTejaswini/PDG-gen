import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	static long MOD = 1000000007;
	static Long dp[][];

	static long maxBeauty(int h[], int b[], int i, int prevh)
	{
		if(i==h.length)
			return 0;

		if(dp[i][prevh+1]!=null)
			return dp[i][prevh+1];

		if(prevh==-1 || h[i]>h[prevh])
		{
			return dp[i][prevh+1]=Math.max(maxBeauty(h, b, i+1, i)+b[i], maxBeauty(h, b, i+1, prevh));
		}
		else
		{
			return dp[i][prevh+1]=maxBeauty(h, b, i+1, prevh);
		}
	}

	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int n=scan.nextInt();
		int h[]=new int[n];
		int b[]=new int[n];

		for(int i=0;i<n;i++)
			h[i]=scan.nextInt();

		for(int i=0;i<n;i++)
			b[i]=scan.nextInt();

		dp=new Long[n][n+2];

		long ans = maxBeauty(h, b, 0, -1);

		System.out.println(ans);

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



}
