import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static long MOD = 1000000007;
	static Long dp[][];

	static long getWays(ArrayList<Integer> tree[], int curr, int par, int color)
	{
		if(tree[curr].size()==1 && tree[curr].get(0)==par)
		{
			return 1;
		}

		if(dp[curr][color]!=null)
			return dp[curr];

		long temp=1;

		if(color==1)
		{
			for(int ch: tree[curr])
			{
				if(ch==par)
					continue;
				temp *= getWays(tree, ch, curr, 0);
				temp = temp%MOD;
			}
		}
		else
		{
			for(int ch: tree[curr])
			{
				if(ch==par)
					continue;
				temp *= (getWays(tree, ch, curr, 0)%MOD + getWays(tree, ch, curr, 1)%MOD);
				temp = temp%MOD;
			}
		}
		return dp[curr][color]=temp;
	}

	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int n=scan.nextInt();
		ArrayList<Integer> tree[]=new ArrayList[n];
		for(int i=0;i<n;i++)
			tree[i]=new ArrayList<>();

		for(int i=0;i<n-1;i++)
		{
			int u=scan.nextInt()-1;
			int v=scan.nextInt()-1;

			tree[u].add(v);
			tree[v].add(u);
		}

		dp[]=new Long[n][2];
		long ans = getWays(tree, 0, -1, 0)%MOD + getWays(tree, 0, -1, 1)%MOD;
		ans = ans%MOD;

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
