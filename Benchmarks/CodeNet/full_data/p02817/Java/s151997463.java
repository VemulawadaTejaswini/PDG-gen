import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int ind=s.indexOf(' ');
    for(int i=ind+1;i<s.length();i++)
      System.out.print(s.charAt(i));
    for(int i=0;i<ind;i++)
      System.out.print(s.charAt(i));
  }
}