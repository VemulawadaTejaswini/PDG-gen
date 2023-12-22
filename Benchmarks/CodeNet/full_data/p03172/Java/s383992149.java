import java.util.*;
import java.io.*;
class Main
{
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
			// String h[]=inp.readLine().split(" ");
			String h[]=inp.readLine().split(" ");
			int n=Integer.parseInt(h[0]);
			int k=Integer.parseInt(h[1]);
			String hh[]=inp.readLine().split(" ");
			int a[]=new int[n];
			for(int i=0;i<n;i++){a[i]=Integer.parseInt(hh[i]);}
			long dp[]=new long[k+1];

			long MOD=1000000007;
			// dp[0]=1;
			dp[0]=1;
			
			for(int i=0;i<n;i++)
			{
				long pre[]= new long[k+1];
				// long dp1[]=new long[k+1];
				for(int j=0;j<=k;j++)
				{
					int l=j;
					int r=Math.min(k,j+a[i]);
					// long temp=dp[j];
					pre[l]+=dp[j];
					// pre[r+1]+=1;
					if(r!=k){pre[r+1]-=dp[j];}	
					// for(int u=l;u<=r;u++)
					// {
					// 	dp1[u]+=temp;
					// }		
					

				}
				// dp=dp1;
				dp=new long[k+1];
				dp[0]=pre[0];
				for(int j=1;j<=k;j++)
				{
					pre[j]=(pre[j]%MOD+pre[j-1]%MOD)%MOD;
					dp[j]=(dp[j]%MOD+pre[j]%MOD)%MOD;

				}
				// System.out.println(Arrays.toString(dp));
				

			}
			// for(int i=1;i<=k;i++)
			// {
			// 	dp[i]=(dp[i]%MOD+dp[i-1]%MOD)%MOD;
			// }
			System.out.println(dp[k]);
			
					
		
	}

	
}
class Pair
{
	int a;
	long b;
	
	Pair(int e, long f)
	{
		a=e;
		b=f;
		
	}
}