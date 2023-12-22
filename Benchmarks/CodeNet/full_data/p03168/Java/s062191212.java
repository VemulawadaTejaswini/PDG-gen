

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		float dp[]= new float [n+1];
		//where dp i represents the pobablity of i 
		//coins
//		float ar[]=new double[n];
		
		dp[0]=1;
		for(int i=1;i<=n;i++)
		{
			float p_head=scan.nextFloat();
			for(int j=i;j>=0;j--)
			{

				dp[j]=((j==0)?0:dp[j-1]*p_head)+(dp[j]*(1-p_head));
			}
		}
		double ans=0;
		for(int i=(n/2)+1;i<=n;i++)
		{
//			System.out.println(dp[i]);
			ans+=dp[i];
		}
		System.out.printf("%.15f",ans);
//		
	}
}
