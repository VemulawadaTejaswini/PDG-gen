import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
public static long help(int[] arr,long[][] dp,int i, int j){
	if(i>j||j<=0||i>arr.length-1){return 0;}
	if(dp[i][j]!=0){return dp[i][j];}
	long x=arr[i]+Math.min(help(arr,dp,i+2,j),help(arr,dp,i+1,j-1));
	long y=arr[j]+Math.min(help(arr,dp,i+1,j-1),help(arr,dp,i,j-2));
	return dp[i][j]=Math.max(x,y);
}
public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
       BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
       int n=s.nextInt();
       long[][] dp=new long[n+1][n+1];
       int[] arr=new int[n+1];
       long sum=0;
       for(int i=1;i<=n;i++){arr[i]=s.nextInt();sum+=arr[i];}       
         out.write((2*help(arr,dp,1,n)-sum)+"\n");       
        out.flush();
  }
}
