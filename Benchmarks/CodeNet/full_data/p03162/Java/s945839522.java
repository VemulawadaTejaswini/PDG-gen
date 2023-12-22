import java.util.*;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n+1][3];
		for(int i=1;i<n+1;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();		
				
			}
		}
		System.out.println(jolve(arr,n));
		
		sc.close();
	}
	private static int  max(int x,int y,int z)
	{
		int mm=Math.max(x, y);
		int nn=Math.max(mm, z);
		return nn;
	}

	
	private static int jolve(int[][] arr,int n)
	{
		
		int[][] dp=new int[n+1][3];
		dp[1][0]=arr[1][0];
		dp[1][1]=arr[1][1];
		dp[1][2]=arr[1][2];
		for(int i=2;i<=n;i++)
		{
			dp[i][0]=arr[i][0]+Math.max(dp[i-1][1],dp[i-1][2]);
			dp[i][1]=arr[i][1]+Math.max(dp[i-1][0],dp[i-1][2]);
			dp[i][2]=arr[i][2]+Math.max(dp[i-1][1],dp[i-1][0]);
			
		}
		
		return max(dp[n][0],dp[n][1],dp[n][2]);
		
	}

}

