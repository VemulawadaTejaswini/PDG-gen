import java.util.*;
public class Main {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max=sc.nextInt();
		long w[]=new long[n];
		long v[]=new long[n];
		for(int i=0;i<n;i++)
		{
			w[i]=sc.nextLong();
			v[i]=sc.nextLong();
		}
		long dp[][]=new long[n+1][max+1];
		for(int i=0;i<=n;i++)
		{
			Arrays.fill(dp[i], -1);
		}
		long ans=rec(w,v,n,0,max,dp);
		System.out.println(ans);
				
	}

	private static long rec(long[] w, long[] v, int n, int ind,int max, long[][] dp) {
		// TODO Auto-generated method stub
		if(ind==n||max<0)
		{
			return 0;
		}
		if(dp[ind][max]!=-1)
		{
			return dp[ind][max];
		}
		long ans=0;
		long opt1=rec(w,v,n,ind+1,max,dp);
		long opt2=0;
		if(w[ind]<=max)
		{
			opt2=v[ind]+rec(w,v,n,ind+1,max-(int)(w[ind]),dp);
		}
		ans=Math.max(opt1, opt2);
		 dp[ind][max]=ans;
		return ans;
	}
}
