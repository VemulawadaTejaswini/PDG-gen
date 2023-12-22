

import java.util.Scanner;

public class Main{
 
  public static void main(String[] args)
  {
     
   Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int totalWt=s.nextInt();
    int wt[]=new int[n];
    long profit[]=new long[n];
    
    for(int i=0;i<n;i++ )
    {
    	wt[i]=s.nextInt();
    	profit[i]=s.nextLong();
    }
    
    long dp[]=new long[totalWt+1];
    long dp1[]=new long[totalWt+1];
    
     dp[0]=0;
     dp1[0]=0;
    
     for(int i=wt[0];i<=totalWt;i++)
     {
    	dp[i]=profit[0];
     }
     
     for(int i=1;i<n;i++)
     {
    	for(int j=0;j<=totalWt;j++)
    	{
           		if(j-wt[i]>=0)
           		{
           			dp1[j]=Math.max(profit[i]+dp[j-wt[i]], dp[j]);
           		}
           		else
           			dp1[j]=dp[j];
    	}
    	dp=dp1;
    	dp1=new long[totalWt+1];
      }
    
    
   
     System.out.println(dp[totalWt]);
     
     s.close();
    
  }
  }