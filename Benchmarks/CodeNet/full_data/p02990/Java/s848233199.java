import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);		
		int n=in.nextInt();
		long m=1000000007l;
		long [][] c=new long [2002][2002];
		c[1][0]=1;
		c[1][1]=1;
		for(int i=0;i<2002;i++)
		{
			c[i][0]=1;
		}
		for(int i=2;i<2002;i++)
		{
			for(int j=1;j<=i;j++)
			{
				c[i][j]=(c[i-1][j]+c[i-1][j-1])%m;
			}
		}
		int k=in.nextInt();
		int r=n-k;
		for(int i=1;i<=k;i++)
		{
			long ans=(c[r+1][i]*c[k-1][i-1])%m;
			System.out.println(ans);
		}
	}
}
	