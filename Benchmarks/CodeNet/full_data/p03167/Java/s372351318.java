import java.util.*;

public class Main{
  //public static int v[]=new int[100001];
  public static int n,m;
  public static long dp[][]=new long[1001][1001];
  public static long func(String s[],int i,int j)
  {
    if(i==n-1 && j==m-1)  
    return (long)1;
    if(j>=m || i>=n)
    return 0;
    if(s[i].charAt(j)=='#')
    return 0;
    if(dp[i][j]!=-1)
    return dp[i][j];
    dp[i][j]=func(s,i,j+1)%1000000007+func(s,i+1,j)%1000000007;
    return dp[i][j]%1000000007;
  } 
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in); 
    n=sc.nextInt();
    m=sc.nextInt();
    String temp=sc.nextLine();
    String s[]=new String[n];
    for(int i=0;i<n;i++){
      s[i]=sc.nextLine();
    }
    for(int i=0;i<=n;i++){
      for(int j=0;j<=m;j++)  
      dp[i][j]=-1;
    }
    System.out.print(func(s,0,0));
  }
}