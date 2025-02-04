import java.util.*;
import java.io.*;
class Solution
{
	static StringBuilder sb;
	public static final boolean ONLINE_JUDGE=false;
	public static void main(String []args)throws IOException
	{
		sb=new StringBuilder();
		Scanner sc=new Scanner(System.in);
		if(ONLINE_JUDGE)
		{
			File file=new File("output.txt");
			sc=new Scanner(new FileReader(new File("input.txt")));
			PrintStream ps=new PrintStream(file);
			System.setOut(ps);
		}
		int t=1;
		for(int tt=1;tt<=t;tt++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			int dp[]=new int[n];
			Arrays.fill(dp,Integer.MAX_VALUE);
			dp[0]=0;
			dp[1]=Math.abs(a[1]-a[0]);
			for(int i=2;i<n;i++)
			{
				for(int j=1;j<=2;j++)
				{
					dp[i]=Math.min(dp[i],dp[i-j]+Math.abs(a[i]-a[i-j]));
				}
			}
			System.out.println(dp[n-1]);
		}
	}
}