import java.util.*;
public class main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int h[]=new int[n];
    for(int i=0;i<n;i++)
    {
      h[i]=sc.nextInt();
    }
    int best[]=new int[n];
    best[0]=h[0];
    best[1]=h[1];
    for(int i=2;i<n;i++)
    {
      int min=9999999;
      for(int j=1;j<=2;j++)
      {
        int t=Math.abs(h[i]+h[i-j]);
        if(t<min)
        {
          min=t;
        }
      }
      best[i]=min;
    }
    System.out.println(best[n-1]);
  }
}