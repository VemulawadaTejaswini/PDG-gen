import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int a,b,c;
    a=in.nextInt();
    b=in.nextInt();
    c=in.nextInt();
    if(a==b && a!=c || b==a && b!=c || c==a && b!=c)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}