import java.util.*;
class Main
{
  static public void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    boolean b = false;
    for(int i=0; i<s.length()-1; i++)
    {
      if(s.charAt(i) == s.charAt(i+1))
      {
        b = true;
      }
    }
    if(!b)
    {
      System.out.println("Good");
    }
    else
    {
      System.out.println("Bad");
    }
  }
}