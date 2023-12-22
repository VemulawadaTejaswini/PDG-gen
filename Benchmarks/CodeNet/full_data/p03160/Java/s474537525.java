/*package whatever //do not write package name here */

import java.util.*;

class Main{
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    arr[i]=sc.nextInt();
	    int dp[]=new int[100];
	    System.out.println(frog(arr,arr.length));
	}
static int frog(int arr[],int n)
{
    int dp[]=new int[n];
    for(int i=1;i<n;i++)
    {
        int option1=Math.abs(arr[i]-arr[i-1])+dp[i-1];
        int option2=(i==1)?Integer.MAX_VALUE:Math.abs(arr[i]-arr[i-2])+dp[i-2];
        dp[i]=Math.min(option1,option2);
    }
    return dp[n-1];
}
}