import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n,c=0;
    n=in.nextInt();
    while(n>=1)
    {
      n=n-2;
      c=c+1;
    }
    System.out.println(c);
  }
}