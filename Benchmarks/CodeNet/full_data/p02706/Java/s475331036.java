import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int sum=0;
    for(int x=0;x<m;x++)
    {
      int a=sc.nextInt();
      sum+=a;
    }
    if(sum<=n)
    {
      System.out.println(n-sum);
    }
    else
    {
      System.out.println(-1);
    }
  }
}