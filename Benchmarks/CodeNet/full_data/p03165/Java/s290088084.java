import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String []args)
{
	Scanner scan=new Scanner(System.in);
	String s=scan.nextLine();
	String t=scan.nextLine();
	int dp[][]=new int[t.length()][s.length()];
	int flag=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)==t.charAt(0))
		flag=1;
		if(flag==1)
		dp[0][i]=1;
		}
		for(int i=1;i<t.length();i++)
	{
		if(s.charAt(0)==t.charAt(i))
		flag=1;
		if(flag==1)
		dp[i][0]=1;
		}
		
		
		for(int i=1;i<t.length();i++)
		{
			for(int j=1;j<s.length();j++)
			{
				if(s.charAt(j)==t.charAt(i))
				 {dp[i][j]=dp[i-1][j-1]+1;
					 
				 }
				 else
				 dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
				 
			//	System.out.print(dp[i][j]);
				}
				//System.out.println();
			}
			int i=t.length()-1;
			int j=s.length()-1;
			boolean over=false;
			StringBuilder str=new StringBuilder();
		while(i>=0&&j>=0&&dp[i][j]>0)
		{//System.out.println("f");
			if(i-1>=0&&dp[i][j]==dp[i-1][j])
			i--;
			else if(j-1>=0&&dp[i][j]==dp[i][j-1])
			j--;
			else 
			{   
				str.append(s.charAt(j));
				
				i--;j--;
				
				}
				
			
			
			}
			str.reverse();
			System.out.println(str);	
		
	
	}
	
	
}
