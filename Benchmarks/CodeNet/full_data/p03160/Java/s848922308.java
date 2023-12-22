import java.util.*;
public class codeforces{


public static void main (String []args)
{
	Scanner scan=new Scanner(System.in);
	//long t=scan.nextLong();
	//long ways[]=new long[1000000000];
	//ways[1]=1;
	//ways[i]=ways[i-1]*2;
	
	//while(t-->0){
         int n=scan.nextInt();
         
         int a[]=new int[n];
        // int dp[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=scan.nextInt();
       
	int dp[]=new int[n];
	for(int i=1;i<n;i++)
        dp[i]=Integer.MAX_VALUE;
	
	dp[0]=0;
	for(int i=0;i<n;i++)
	{
		if(i+1<n)
		dp[i+1]=Math.min(dp[i+1],dp[i]+Math.abs(a[i+1]-a[i]));
		if(i+2<n)
		dp[i+2]=Math.min(dp[i+2],dp[i]+ Math.abs(a[i+2]-a[i]));
		}
         
         System.out.println(dp[n-1]);
//}//
}
}
