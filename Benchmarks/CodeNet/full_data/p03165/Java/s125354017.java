import java.io.*;
import java.util.*;




public class Main
{

	static String s1,s2;


	static int[][] dp;


	static int find(int i,int j)
	{
		if(i>=s1.length() || j>=s2.length()) return 0;

		if(dp[i][j]!=-1) return dp[i][j];

		if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]=1+find(i+1,j+1);

		else return dp[i][j]=Math.max(find(i+1,j),find(i,j+1));
	}


	public static void main(String[] Rohan)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));





		// String[] s=br.readLine().split(" ");

		s1=br.readLine();
		s2=br.readLine();


		dp=new int[s1.length()][s2.length()];

		for(int i=0;i<s1.length();i++)
			for(int j=0;j<s2.length();j++) dp[i][j]=-1;

		find(0,0);

		int[][] dp2=new int[s1.length()+2][s2.length()+2];

		for(int i=1;i<=s1.length();i++)
		{
			for(int j=1;j<=s2.length();j++)
			{
				dp2[i][j]=dp[i-1][j-1];
			}
		}

		int i=1,j=1;

		while(i<=s1.length() && j<=s2.length())
		{
			if(s1.charAt(i-1)==s2.charAt(j-1))
			{
				System.out.print(s1.charAt(i-1));
				i++;j++;
			}
			else if(dp2[i+1][j]>dp2[i][j+1]) i++;
			else j++;

		}
		
		System.out.println();
		

	}
}
