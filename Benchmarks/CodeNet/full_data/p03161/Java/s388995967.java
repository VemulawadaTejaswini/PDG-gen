import java.util.*;


public class Main{
	static int[] dp=new int[1000001];
	
	static int solve(int[] arr,int n,int k,int i)
	{
		if(i==n-1)
		{
			return Math.abs(arr[i]-arr[n-1]);
		}
		if(dp[i]!=-1)
		{
			return dp[i];
		}
		int ans=Integer.MAX_VALUE;
		for(int it=1;it<=k;it++)
		{
			if(i+it>=n)
			{
				break;
			}
			ans=Math.min(ans,solve(arr,n,k,i+it)+Math.abs(arr[i+it]-arr[i]));
			
		}
		return dp[i]=ans;
		
	}
	
	
	
	public static void main(String[] args) {
		Arrays.fill(dp,0,1000000,-1);
		Scanner sc=new Scanner(System.in);
		int n,k;
		n=sc.nextInt();
		k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(solve(arr, n, k, 0));
		
		
		
		sc.close();

	}

}
