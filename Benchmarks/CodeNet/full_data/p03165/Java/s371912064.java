import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();

		int[][] dp = new int[s1.length()+1][s2.length()+1];

		for(int i=0;i<=s1.length();i++)
		{
			for(int j=0;j<=s2.length();j++)
			{
				if(i==0||j==0)
				{
					dp[i][j] = 0;
					continue;
				}
				else
				{
					if(s1.charAt(i-1)==s2.charAt(j-1))
					{
						dp[i][j] = 1 + dp[i-1][j-1];
					}
					else
					{
						dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
					}
				}

				dp[i][j] = Math.max(dp[i][j],dp[i-1][j-1]);
			}
		}
       
  

       String ans = "";
       int i =s1.length();
       int j =s2.length();

       while(i>=1&&j>=1)
       {
       	  if(s1.charAt(i-1)==s2.charAt(j-1))
       	  {
       	  	  ans = ans + s1.charAt(i-1);
       	  }

       	  if(dp[i][j]==dp[i][j-1])
       	  {
              j=j-1;
       	  }
       	  else if(dp[i][j] == dp[i-1][j])
       	  {
             i=i-1;
       	  }
       	  else
       	  {
              i=i-1;
              j=j-1;
       	  }
       }
       StringBuilder str = new StringBuilder();
       str.append(ans);

       System.out.println(str.reverse());
 	}
}