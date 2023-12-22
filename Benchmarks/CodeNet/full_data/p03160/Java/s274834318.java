import java.io.*;
public class Main{
 
  public static int findCost(int arr[],int i,int dp[])
  {
	int n=arr.length;
 
    if(i>=n-1)
      return 0;
    int ans1=Integer.MAX_VALUE,ans2=Integer.MAX_VALUE;
    if(dp[i]==Integer.MAX_VALUE) {
    if((i+1)<n)
    ans1=Math.abs(arr[i]-arr[i+1])+findCost(arr,i+1,dp);
    if((i+2)<n)
    ans2=Math.abs(arr[i]-arr[i+2])+findCost(arr,i+2,dp);
    dp[i]=Math.min(ans1, ans2);}
    return dp[i];
    
  }
  
  public static void main(String[] args) throws IOException
  {
     
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    String line=br.readLine();
    String str[]=line.trim().split("\\s+");
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=Integer.parseInt(str[i]);
     // System.out.println(arr[i]);
    }
    int dp[]=new int[n];
    for(int i=0;i<n;i++)
    	dp[i]=Integer.MAX_VALUE;
    System.out.print(findCost(arr,0,dp));
    
  }
}