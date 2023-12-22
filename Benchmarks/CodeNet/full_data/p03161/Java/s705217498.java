import java.util.*;

public class Main{
  public static long dp[]=new long[100001];
  public static long go(long a[],int i,int k){
    if(i==a.length-1)
    {
      return 0;
    }
    if(i>a.length-1)
    {
      return 1000000000;
    }
    if(dp[i]!=-1)
    return dp[i];
    long min=1000000000;
    for(int j=i+1;j<=i+k;j++){
      long cost;
      if(j<=a.length-1){
      cost=Math.abs(a[i]-a[j])+go(a,j,k);
      min=Math.min(cost,min);
      dp[i]=min;
      }
    }
    return dp[i];
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in); 
    int n=sc.nextInt();
    int k=sc.nextInt();
    long a[]=new long[n];
    for(int i=0;i<n;i++){
    dp[i]=-1;
    a[i]=sc.nextLong();
    }
    dp[n]=-1;
    System.out.print(go(a,0,k));
  }
}