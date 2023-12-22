
import java.util.*;
public class Main {

	static long dp[][]=new long[101][1001];
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int maxw=sc.nextInt();
		int w[]=new int[n];
		int v[]=new int[n];
		int maxv=0;
		for(int i=0;i<n;i++)
		{
			w[i]=sc.nextInt();
			v[i]=sc.nextInt();
		maxv+=v[i];
		}
		 solve(w,v,maxv,maxw);
		
			
	}

	private static void solve(int[] w, int[] v, int maxv, int maxw) {
		// TODO Auto-generated method stub
		int n=v.length;
		
		for(int i=maxv;i>=1;i--)
		{
			
		long wr=helper(w,v,i,0);
		//System.out.println(wr);
		if(wr<=maxw)
		{
			System.out.println(i);
			return;
		}
		}
		System.out.println(0);
	}

	private static long helper(int[] w, int[] v, int maxv, int ind) {
		
		// TODO Auto-generated method stub
		if(maxv==0)
		{
			return 0;
		}
		
		if(ind==v.length)
		{
			return Integer.MAX_VALUE;
		}
		if(dp[ind][maxv]!=0)
		{
			return dp[ind][maxv];
		}
		long opt1=helper(w,v,maxv,ind+1);
		long opt2=Integer.MAX_VALUE;
		if(maxv>=v[ind])
		{
			opt2=w[ind]+helper(w,v,maxv-v[ind],ind+1);

		}
		dp[ind][maxv]=Math.min(opt1, opt2);;
				return Math.min(opt1, opt2);
	}
}
