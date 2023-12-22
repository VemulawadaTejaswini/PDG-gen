import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    int n;
    long sum=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    long a[]=new long[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextLong();
    for(int i=0;i<n-1;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        sum+=(a[i]^a[j]);
      }
    }
    sum%=1000000007;
    System.out.println(sum);
  }
} 