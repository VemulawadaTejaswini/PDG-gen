import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner Sc=new Scanner(System.in);
    String s=Sc.next();
    int l=s.length();
    int y=0;
    for(int i=0;i<l-1;i++)
    {
      y=0;
      if(s.charAt(i)==s.charAt(i+1))
        y=1;
      if(y==1)
        break;
    }
    if(y==1)
      System.out.println("Bad");
    else
      System.out.println("Good");
  }
}
