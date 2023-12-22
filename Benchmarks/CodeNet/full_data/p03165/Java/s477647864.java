import java.util.Arrays;
import java.util.Collections;
import java.util.*;
class Main
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		int i;	
		char temp[]=sc.next().toCharArray();
		int a=temp.length; char s[]=new char[a+1];
		for(i=0;i<a;i++)
			s[i+1]=temp[i];
		temp=sc.next().toCharArray();
		int b=temp.length; char t[]=new char[b+1];
		for(i=0;i<b;i++)
			t[i+1]=temp[i];
		int dp[][]=new int[a+1][b+1];
		for(i=1;i<=a;i++)
		{
			for(int j=1;j<=b;j++)
			{
				if(s[i]==t[j])
					dp[i][j]=dp[i-1][j-1]+1;
				else
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
			}
		}
		int val=dp[a][b];
		String ans="";
		for(i=a;i>=1;i--)
		{
			for(int j=b;j>=1;j--)
			{
				if(dp[i][j]>dp[i-1][j]&&dp[i][j]>dp[i][j-1]&&dp[i][j]==val)
				{
					ans=s[i]+ans;
					val--;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}