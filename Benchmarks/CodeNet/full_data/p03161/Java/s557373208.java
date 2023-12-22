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
	    int dp[]=new int[n+1];
	    Arrays.fill(dp,Integer.MAX_VALUE);
	    dp[0]=0;
	    dp[1]=0;
	    dp[2]=Math.abs(arr[1]-arr[0]);
	    for(int i=2;i<n;i++){
	        for(int j=i-1;j>0;j--){
	            dp[i+1]=Math.min(dp[i+1],Math.abs(arr[i]-arr[j])+dp[j+1]);
	        }
	    }
	    System.out.println(dp[n]);
	    
	}
}