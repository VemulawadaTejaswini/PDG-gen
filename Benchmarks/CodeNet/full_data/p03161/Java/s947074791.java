import java.util.*;

public class Main{
  public static int dp[]=new int[100001];
  public static int go(int a[],int i,int k){
    if(i==a.length-1)
    {
      return 0;
    }
    if(i>a.length-1)
    {
      return 100000;
    }
    if(dp[i]!=-1)
    return dp[i];
    int min=100000;
    for(int j=i+1;j<=i+k;j++){
      int cost;
      if(j<=a.length-1){
      cost=Math.abs(a[i]-a[j])+go(a,j,k);
      min=Math.min(cost,min);
      }
    }
    return dp[i]=min;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in); 
    int n=sc.nextInt();
    int k=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
    dp[i]=-1;
    a[i]=sc.nextInt();
    }
    dp[n]=-1;
    System.out.print(go(a,0,k));
  }
}