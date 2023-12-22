/*package whatever //do not write package name here */

import java.util.*;

class Main {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    arr[i]=sc.nextInt();
	   // int dp[]=new int[100];
	    System.out.println(frog(arr,arr.length,k));
	}
static int frog(int arr[],int n,int k)
{
    int dp[]=new int[n];
    dp[0]=0;
    for(int i=1;i<n;i++)
    {
        dp[i]=1000000000;
        for(int j=i;j>=0 && (i-j)<=k;j--)
        {
        int option1=Math.abs(arr[i]-arr[j])+dp[j];
        dp[i]=Math.min(option1,dp[i]);
        }
    }
    return dp[n-1];
}
}