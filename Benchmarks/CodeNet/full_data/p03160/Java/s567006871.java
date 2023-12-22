import java.util.*;
public class Main{

static int[] dp=new int[10000001];
	
	
	public static int solve(int[] arr,int i,int n)
	{
		if(i==n-1)
		{
			return Math.abs(arr[i]-arr[n-1]);
		}
		if(dp[i]!=-1)
		{
			return dp[i];
		}
		int ans=solve(arr,i+1,n)+Math.abs(arr[i]-arr[i+1]);
		if(i<n-2)
		{
			ans=Math.min(ans,solve(arr,i+2,n)+Math.abs(arr[i]-arr[i+2]));
		}
		return dp[i]=ans;
	}

	public static void main(String[] args) {
		Arrays.fill(dp, 0,10000000,-1);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println(solve(arr,0,n));
		sc.close();

	}

}
