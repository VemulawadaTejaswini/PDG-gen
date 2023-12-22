import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int k=s.nextInt();
	    int[]arr=new int[n];
	   //int[]arr=s.nextIntArray();
	    for(int i=0;i<n;i++){
	        arr[i]=s.nextInt();
	    }
	    int dp[]=new int[n];
	    Arrays.fill(dp,Integer.MAX_VALUE);
	    dp[0]=0;
	    dp[1]=Math.abs(arr[1]-arr[0]);
	    for(int i=2;i<n;i++){
	        for(int j=i-1;j>=i-k&&j>=0;j--){
	            dp[i]=Math.min(dp[i],Math.abs(arr[i]-arr[j])+dp[j]);
	        }
	    }
	    System.out.println(dp[n-1]);
	    
	}
}