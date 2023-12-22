
import java.util.*;

public class Main{
	
	public static double find(double arr[],double dp[][],int tail,int i,int n)
	{
		if(i>=n)
			return 1;
		
		if(dp[tail][i]==-1)
		{
			double op1=(arr[i])*find(arr,dp,tail,i+1,n);
			double op2=0;
			if(tail<n/2)
				op2=(1-arr[i])*find(arr,dp,tail+1,i+1,n);
			
				dp[tail][i]=op2+op1;
				
		}
		
			return dp[tail][i];
	}
    public static void main(String[] args) 
    {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       double arr[]=new double[n];
       for(int i=0;i<n;i++)
    	   arr[i]=s.nextDouble();
       
       double dp[][]=new double[n/2+1][n];
       for(int i=0;i<=n/2;i++)
       {
    	   for(int j=0;j<n;j++)
    		   dp[i][j]=-1;
       }
       System.out.print(find(arr,dp,0,0,n));
    }
}