import java.util.*;
import java.math.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    long  n=s.nextLong();
    long ans=0;
    int i=(int)Math.sqrt(n);
    for(;i>=1;i--)
    {
       if(n%i==0)
       {
         ans=i+n/i-2;
       System.out.println(ans);
       break;
       }
    }
      }
}