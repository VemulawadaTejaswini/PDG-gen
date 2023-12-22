import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int a[]=new int[n+1];
		int b[]=new int[m+1];
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			b[i]=scan.nextInt();
		}
		a[n]=0;
		b[m]=0;
		long dp[][]=new long[n+1][m+1];
		long cum[][]=new long[n+1][m+1];
		for(int i=0;i<=n;i++)
		{
			dp[i][0]=(a[i]==b[0])?1:0;
			long prev=(i>0)?cum[i-1][0]:0;
			cum[i][0]=dp[i][0]+prev;
			
		}
		for(int j=0;j<=m;j++)
		{
			dp[0][j]=(a[0]==b[j])?1:0;
			long prev=(j>0)?cum[0][j-1]:0;
			cum[0][j]=prev+dp[0][j];
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(a[i]==b[j]) {
					dp[i][j]=(cum[i-1][j-1]+1)%1000000007;
				}else {
					dp[i][j]=0;
				}
				cum[i][j]=(((((cum[i][j-1]+cum[i-1][j])%1000000007)-cum[i-1][j-1])%1000000007)+dp[i][j])%1000000007;
			}
		}
		System.out.println(dp[n][m]);
	}
}
