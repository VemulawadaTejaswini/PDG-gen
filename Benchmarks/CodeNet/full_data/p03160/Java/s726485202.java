import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner();
    int n=sc.nextInt();
    int h[]=new int[n];
    for(int i=0;i<n;i++)
    {
      h[i]=sc.nextInt();
    }
    int min[]=new int[n];
    min[0]=h[0];
    min[1]=h[1]-h[0];
    for(int i=2;i<n;i++)
    {
     int h1=(int)Math.abs(ar[i]-ar[i-1])+h[i-1];
     int h2=(int)Math.abs(ar[i]-ar[i-2])+h[i-2];
      h[i]=h1>h2?h1:h2;
    }
    System.out.println(h[n-1]);
  }
}