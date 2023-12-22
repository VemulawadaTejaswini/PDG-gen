import java.util.*;
import java.io.*;




public class Main
{
	
	
	
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	

	static int n;
	static int[] val,wght;
	static long[][] dp;

	// static int find(int weight,int indx)
	// {
	// 	if(weight<=0 || indx>=n)
	// 		return 0;
	// 	if(dp[weight][indx]>0)
	// 		return dp[weight][indx];
	// 	if(wght[indx]<=weight)
	// 		return dp[weight][indx]=Math.max(val[indx]+find(weight-wght[indx],indx+1),find(weight,indx+1));
	// 	return dp[weight][indx]=find(weight,indx+1);

	// }
	

		
	public static void main(String[] args)throws IOException{
		

			int t=1;
			while(t-->0)
			{
				String[] s=br.readLine().split(" ");
				n=Integer.parseInt(s[0]);
				int w=Integer.parseInt(s[1]);
				val=new int[n];
				wght=new int[n];
				dp=new long[w+1][n];

				for(int i=0;i<n;i++)
				{
					s=br.readLine().split(" ");
					wght[i]=Integer.parseInt(s[0]);
					val[i]=Integer.parseInt(s[1]);
				}

				for(int i=1;i<=w;i++)
				{
					for(int j=0;j<n;j++)
					{
						if(j!=0)
						{
							if(wght[j]<=i)
							{
								dp[i][j]=Math.max(val[j]+dp[i-wght[j]][j-1],dp[i][j-1]);
							}
							else
								dp[i][j]=dp[i][j-1];
						}
						else
						{
							if(wght[0]<=i)
								dp[i][j]=val[j];
						}
					}
				}


				System.out.println(dp[w][n-1]);


			}








	}
	
}