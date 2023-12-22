


import java.util.Scanner;
public class Main{
 
   
  public static void main(String[] args)
  {
     
  
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    	arr[i]=s.nextInt();
	  
    int dp[]=new int[n];
    
    	
    for(int i=0;i<n;i++)
 	   dp[i]=Integer.MAX_VALUE;
     dp[0]=0;
     dp[1]=Math.abs(arr[0]-arr[1]);
    
    
    
     for(int i=1;i<n;i++)
     {
     	for(int j=1;i-j>=0&&j<=k;j++)
 	   dp[i]=Math.min(dp[i],dp[i-j]+Math.abs(arr[i]-arr[i-j]));
 	   
     }
     
    System.out.print(dp[n-1]);
    s.close();
  }
}