import java.util.*;
import java.math.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    long  n=s.nextLong();
    long ans=n-1;
    for(int i=1;i*i<=n;i++)
    {
       if(n%i==0)
       {
         ans=Math.min(ans,(i+n/i-2));
       }
    }
    System.out.println(ans);
  }
}