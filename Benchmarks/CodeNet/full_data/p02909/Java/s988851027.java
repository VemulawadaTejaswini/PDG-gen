import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    if(s.compareTo("Sunny")==0)
    {
      System.out.println("Cloudy");
    }
    else if(s.compareTo("Cloudy")==0)
    {
      System.out.println("Rainy");
    }
    else
    {
      System.out.println("Sunny");
    }
  }
}