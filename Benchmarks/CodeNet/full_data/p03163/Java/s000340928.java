import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,w;
		n=sc.nextInt();
		w=sc.nextInt();
		int[] wt=new int[n];
		long[] val=new long[n];
		for(int i=0;i<n;i++)
		{
			wt[i]=sc.nextInt();
			val[i]=sc.nextLong();
		}
		System.out.println(knap(wt,val,n,w));
	
		sc.close();

	}
	private static long knap(int[] wt,long[] val,int n,int w)
	{
		long[][] dp=new long[n+1][w+1];
		
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<w+1;j++)
			{
				if(wt[i-1]<=j) {
				dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);}
				else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		return dp[n][w];
	}

}
