import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		String s1=in.next();
		String s2=in.next();
		int n=s1.length();
		int m=s2.length();
		int [][] ans=new int [n+1][m+1];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=m;j++)
			{
				if(i==0||j==0)
				{
					ans[i][j]=0;
				}
				else if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					ans[i][j]=ans[i-1][j-1]+1;
				}
				else
				{
					ans[i][j]=Math.max(ans[i][j-1],ans[i-1][j]);
				}
			}
		}
		String s=new String();
		int i=n;
		int j=m;
		while((i>0)&&(j>0))
		{
			if(s1.charAt(i-1)==s2.charAt(j-1))
			{
				s=s+s1.charAt(i-1);
				i--;
				j--;
			}
			else if(ans[i-1][j]>ans[i][j-1])
				i--;
			else
				j--;
		}
		String ret=reverse(s);
		System.out.println(ret);
			
	}
	public static String reverse(String s)
	{
		int n=s.length();
		String ans=new String();
		for(int i=0;i<n;i++)
		{
			ans=ans+s.charAt(n-1-i);
		}
		return ans;
	}
}
	