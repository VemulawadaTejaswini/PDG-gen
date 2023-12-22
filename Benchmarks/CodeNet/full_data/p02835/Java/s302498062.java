import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int a1,a2,a3;
    a1=in.nextInt();
    a2=in.nextInt();
    a3=in.nextInt();
    if((a1+a2+a3)>=22)
    {
      System.out.println("bust");
    }
    else
    {
      System.out.println("win");
    }
  }
}
