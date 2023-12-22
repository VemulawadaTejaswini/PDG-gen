import java.util.*;

public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String t=sc.nextLine();
    int n=s.length();
    int m=t.length();
    int dp[][]=new int[n+1][m+1];
    for(int i=0;i<=n;i++)
    {
      for(int j=0;j<=m;j++)
      {
        if(i==0 || j==0)
        dp[i][j]=0;
        else
        {
          if(s.charAt(i-1)==t.charAt(j-1))
          dp[i][j]=dp[i-1][j-1]+1;
          else
          dp[i][j]=
            Math.max(dp[i][j-1],dp[i-1][j]);
        }
      }
    }
    int i=n,j=m;
    String ans="";
    while(i!=0 && j!=0)
    {
      if(s.charAt(i-1)==t.charAt(j-1))
      {
        ans+=s.charAt(i-1);
        i--;
        j--;
      }
      else
      {
        if(dp[i][j-1]>dp[i-1][j])
        j--;
        else
        i--;
      }
    }
    String rev="";
    for(int k=ans.length()-1;k>=0;k--)
    rev+=ans.charAt(k);
    System.out.println(rev);
  }
}
    