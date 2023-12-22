import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    long x,num,i,a;
    boolean b=false;
    x=in.nextInt();
    if(x==2)
    {
      System.out.println("2");
      System.exit(0);
    }
    num=x;
    for(i=num;i>0;i++,num++)
    {
      for(a=2;a<n;a++)
      {
        if(n%a==0)
        {
          b=true;
        }
      }
      if(b==false)
      {
        System.out.println(i);
        System.exit(0);
      }
    }
  }
}
    