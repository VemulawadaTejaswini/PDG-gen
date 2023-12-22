import java.util.*;
class Solution
{
  public static void main(String []args)
  {
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int a[][]=new int[n][n];
    for(int i=0;i<n;i++)
    {
      a[0][i]=sc.nextInt();
    }
    for(int i=1;i<n;i++)
    {
      for(int j=0;j<n-i;j++)
      {
        a[i][j]=a[i-1][j]-a[i-1][j+1];
      }
    }
    System.out.print(a[n-1][0]);
  }
}