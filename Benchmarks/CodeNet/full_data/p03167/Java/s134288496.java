/*													   *********************
													   	     H. GRID 1	
													   *********************                   Atharva Tripathi                                 */
													   
import java.util.*;
import java.io.*;
public class Main
{
	static int mod=(int)(1e9+7);
	public static class pair
	{
		int x;
		int y;
		public pair(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String inp[]=br.readLine().split(" ");
		int n=Integer.parseInt(inp[0]),m=Integer.parseInt(inp[1]);
		
		
		int ans[][]=new int[n][m];
		char dp[][]=new char[n][];
		for(int i=0;i<n;i++)
		{
			dp[i]=new char[m];
			dp[i]=br.readLine().toCharArray();
		}
		
		
		for(int i=0;i<m;i++)
		{
			if(dp[0][i]=='#')
				break;
			ans[0][i]=1;
		}
		
		
		for(int i=0;i<n;i++)
		{
			if(dp[i][0]=='#')
				break;
			ans[i][0]=1;
		}
		
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<m;j++)
			{
				if(dp[i][j]!='#')
				{
					ans[i][j]=(ans[i-1][j]+ans[i][j-1])%mod;
				}
			}
		}
		System.out.println(ans[n-1][m-1]);
		
		
	}
}