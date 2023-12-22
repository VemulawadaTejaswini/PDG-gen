import java.util.*;
import java.util.Arrays;
class prob
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int b[]=new int[n];
    b=Arrays.copyOfRange(a,0,n);
    Arrays.sort(b);
    int t=0;
    for(int i=0;i<n;i++)
      if((a[i]-b[i])<0)
        t++;
    if(t==0||t==2)
      System.out.println("YES");
    else 
      System.out.println("NO");
  }
}
    