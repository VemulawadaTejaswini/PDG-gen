import java.util.*;
public class Main {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		int dp[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.fill(dp, -1);
		int ans=rec(dp,arr,0,k);
		System.out.println(ans);
		
		//dp[0]=0;
		//dp[1]=Math.abs(arr[0]-arr[1]);
//		for(int i=1;i<n;i++)rr
//		{
//			int min=Integer.MAX_VALUE;
//			for(int j=1;j<=k&&i-j>=0;j++)
//			{
//				//System.out.println(i+" "+j);
//				int temp=dp[i-j]+Math.abs(arr[i]-arr[i-j]);
//			min=Math.min(temp, min);
//			}
//			dp[i]=min;
//			//System.out.println(dp[i]);
//		}
//		System.out.println(dp[n-1]);
	}

	private static int rec(int[] dp, int[] arr, int ind, int k) {
		// TODO Auto-generated method stub
		if(ind==arr.length-1)
		{
			return 0;
		}
		
		if(dp[ind]!=-1)
		{
			
			return dp[ind];
		}
		int n=arr.length;
		int ans=Integer.MAX_VALUE;
		for(int i=1;i<=k;i++)
		{
			if(ind+i<n)
			{
				//System.out.println(ind+" "+i);
				ans=Math.min(ans, Math.abs(arr[ind]-arr[i+ind])+rec(dp,arr,ind+i,k));
			}
		}
		dp[ind]=ans;
		return ans;
	}
}
